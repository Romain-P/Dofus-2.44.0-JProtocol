// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountFreeFromPaddockMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6055;
  // str
  public java.lang.String name;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // str
  public java.lang.String liberator;

  public ExchangeMountFreeFromPaddockMessage() {}

  public ExchangeMountFreeFromPaddockMessage(
      java.lang.String name, short worldX, short worldY, java.lang.String liberator) {
    this.name = name;
    this.worldX = worldX;
    this.worldY = worldY;
    this.liberator = liberator;
  }

  @Override
  public int getProtocolId() {
    return 6055;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.name);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_str(this.liberator);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.name = reader.read_str();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.liberator = reader.read_str();
  }

  @Override
  public String toString() {

    return "ExchangeMountFreeFromPaddockMessage("
        + "name="
        + this.name
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", liberator="
        + this.liberator
        + ')';
  }
}
