// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryEntryMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6044;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryPlayerInfo
  public com.ankamagames.dofus.network.types.game.context.roleplay.job
          .JobCrafterDirectoryEntryPlayerInfo
      playerInfo;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryJobInfo
  public com.ankamagames.dofus.network.types.game.context.roleplay.job
          .JobCrafterDirectoryEntryJobInfo[]
      jobInfoList;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook playerLook;

  public JobCrafterDirectoryEntryMessage()
  {}

  public JobCrafterDirectoryEntryMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job
              .JobCrafterDirectoryEntryPlayerInfo
          playerInfo,
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryJobInfo
              []
          jobInfoList,
      com.ankamagames.dofus.network.types.game.look.EntityLook playerLook)
  {
    this.playerInfo = playerInfo;
    this.jobInfoList = jobInfoList;
    this.playerLook = playerLook;
  }

  public JobCrafterDirectoryEntryMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job
              .JobCrafterDirectoryEntryPlayerInfo
          playerInfo,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectoryEntryJobInfo>
          jobInfoList,
      com.ankamagames.dofus.network.types.game.look.EntityLook playerLook)
  {
    this.playerInfo = playerInfo;
    this.jobInfoList =
        jobInfoList.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job
                        .JobCrafterDirectoryEntryJobInfo
                    []
                ::new);
    this.playerLook = playerLook;
  }

  @Override
  public int getProtocolId()
  {
    return 6044;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.playerInfo.serialize(writer);
    writer.write_ui16(jobInfoList.length);

    for (int i = 0; i < jobInfoList.length; i++)
  {

      jobInfoList[i].serialize(writer);
    }
    this.playerLook.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
            .JobCrafterDirectoryEntryPlayerInfo();
    this.playerInfo.deserialize(reader);

    int jobInfoList_length = reader.read_ui16();
    this.jobInfoList =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
                .JobCrafterDirectoryEntryJobInfo[jobInfoList_length];

    for (int i = 0; i < jobInfoList_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryJobInfo
          jobInfoList_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectoryEntryJobInfo();

      jobInfoList_it.deserialize(reader);
      this.jobInfoList[i] = jobInfoList_it;
    }
    this.playerLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.playerLook.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "JobCrafterDirectoryEntryMessage("
        + "playerInfo="
        + this.playerInfo
        + ", jobInfoList="
        + java.util.Arrays.toString(this.jobInfoList)
        + ", playerLook="
        + this.playerLook
        + ')';
  }
}
