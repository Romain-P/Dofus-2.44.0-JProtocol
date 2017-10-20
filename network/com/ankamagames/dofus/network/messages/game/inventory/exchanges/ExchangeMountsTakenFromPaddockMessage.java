// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountsTakenFromPaddockMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6554;
  // str
  public java.lang.String name;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // str
  public java.lang.String ownername;

  public ExchangeMountsTakenFromPaddockMessage() {}

  public ExchangeMountsTakenFromPaddockMessage(
      java.lang.String name, short worldX, short worldY, java.lang.String ownername) {
    this.name = name;
    this.worldX = worldX;
    this.worldY = worldY;
    this.ownername = ownername;
  }

  @Override
  public int getProtocolId() {
    return 6554;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.name);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_str(this.ownername);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.name = reader.read_str();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.ownername = reader.read_str();
  }

  @Override
  public String toString() {

    return "ExchangeMountsTakenFromPaddockMessage("
        + "name="
        + this.name
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", ownername="
        + this.ownername
        + ')';
  }
}
