// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntDigRequestAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6484;
  // i8
  public byte questType;
  // i8
  public byte result;

  public TreasureHuntDigRequestAnswerMessage() {}

  public TreasureHuntDigRequestAnswerMessage(byte questType, byte result) {
    this.questType = questType;
    this.result = result;
  }

  @Override
  public int getProtocolId() {
    return 6484;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.questType);
    writer.write_i8(this.result);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.questType = reader.read_i8();
    this.result = reader.read_i8();
  }

  @Override
  public String toString() {

    return "TreasureHuntDigRequestAnswerMessage("
        + "questType="
        + this.questType
        + ", result="
        + this.result
        + ')';
  }
}
