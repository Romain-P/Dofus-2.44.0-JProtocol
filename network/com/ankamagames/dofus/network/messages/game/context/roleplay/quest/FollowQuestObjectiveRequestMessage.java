// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FollowQuestObjectiveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6724;
  // vi16
  public short questId;
  // i16
  public short objectiveId;

  public FollowQuestObjectiveRequestMessage()
  {}

  public FollowQuestObjectiveRequestMessage(short questId, short objectiveId)
  {
    this.questId = questId;
    this.objectiveId = objectiveId;
  }

  @Override
  public int getProtocolId()
  {
    return 6724;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.questId);
    writer.write_i16(this.objectiveId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.questId = reader.read_vi16();
    this.objectiveId = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "FollowQuestObjectiveRequestMessage("
        + "questId="
        + this.questId
        + ", objectiveId="
        + this.objectiveId
        + ')';
  }
}
