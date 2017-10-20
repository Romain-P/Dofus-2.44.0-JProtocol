// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntGiveUpRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6487;
  // i8
  public byte questType;

  public TreasureHuntGiveUpRequestMessage() {}

  public TreasureHuntGiveUpRequestMessage(byte questType) {
    this.questType = questType;
  }

  @Override
  public int getProtocolId() {
    return 6487;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.questType);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.questType = reader.read_i8();
  }

  @Override
  public String toString() {

    return "TreasureHuntGiveUpRequestMessage(" + "questType=" + this.questType + ')';
  }
}
