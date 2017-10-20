// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntFlagRemoveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6510;
  // i8
  public byte questType;
  // i8
  public byte index;

  public TreasureHuntFlagRemoveRequestMessage() {}

  public TreasureHuntFlagRemoveRequestMessage(byte questType, byte index) {
    this.questType = questType;
    this.index = index;
  }

  @Override
  public int getProtocolId() {
    return 6510;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.questType);
    writer.write_i8(this.index);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.questType = reader.read_i8();
    this.index = reader.read_i8();
  }

  @Override
  public String toString() {

    return "TreasureHuntFlagRemoveRequestMessage("
        + "questType="
        + this.questType
        + ", index="
        + this.index
        + ')';
  }
}
