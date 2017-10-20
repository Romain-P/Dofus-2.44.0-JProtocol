// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestObjectiveValidationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6085;
  // vi16
  public short questId;
  // vi16
  public short objectiveId;

  public QuestObjectiveValidationMessage() {}

  public QuestObjectiveValidationMessage(short questId, short objectiveId) {
    this.questId = questId;
    this.objectiveId = objectiveId;
  }

  @Override
  public int getProtocolId() {
    return 6085;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.questId);
    writer.write_vi16(this.objectiveId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.questId = reader.read_vi16();
    this.objectiveId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "QuestObjectiveValidationMessage("
        + "questId="
        + this.questId
        + ", objectiveId="
        + this.objectiveId
        + ')';
  }
}
