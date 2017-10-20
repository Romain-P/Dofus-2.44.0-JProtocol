// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryListEntry extends NetworkType {
  public static final int PROTOCOL_ID = 196;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryPlayerInfo
  public com.ankamagames.dofus.network.types.game.context.roleplay.job
          .JobCrafterDirectoryEntryPlayerInfo
      playerInfo;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryJobInfo
  public com.ankamagames.dofus.network.types.game.context.roleplay.job
          .JobCrafterDirectoryEntryJobInfo
      jobInfo;

  public JobCrafterDirectoryListEntry() {}

  public JobCrafterDirectoryListEntry(
      com.ankamagames.dofus.network.types.game.context.roleplay.job
              .JobCrafterDirectoryEntryPlayerInfo
          playerInfo,
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryEntryJobInfo
          jobInfo) {
    this.playerInfo = playerInfo;
    this.jobInfo = jobInfo;
  }

  @Override
  public int getProtocolId() {
    return 196;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.playerInfo.serialize(writer);
    this.jobInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.playerInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
            .JobCrafterDirectoryEntryPlayerInfo();
    this.playerInfo.deserialize(reader);
    this.jobInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
            .JobCrafterDirectoryEntryJobInfo();
    this.jobInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryListEntry("
        + "playerInfo="
        + this.playerInfo
        + ", jobInfo="
        + this.jobInfo
        + ')';
  }
}
