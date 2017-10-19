// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UnfollowQuestObjectiveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6723;
  // vi16
  public short questId;
  // i16
  public short objectiveId;

  public UnfollowQuestObjectiveRequestMessage()
  {}

  public UnfollowQuestObjectiveRequestMessage(short questId, short objectiveId)
  {
    this.questId = questId;
    this.objectiveId = objectiveId;
  }

  @Override
  public int getProtocolId()
  {
    return 6723;
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

    return "UnfollowQuestObjectiveRequestMessage("
        + "questId="
        + this.questId
        + ", objectiveId="
        + this.objectiveId
        + ')';
  }
}
