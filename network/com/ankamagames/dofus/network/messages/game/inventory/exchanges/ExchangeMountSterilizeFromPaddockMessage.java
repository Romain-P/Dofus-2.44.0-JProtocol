// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountSterilizeFromPaddockMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6056;
  // str
  public java.lang.String name;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // str
  public java.lang.String sterilizator;

  public ExchangeMountSterilizeFromPaddockMessage()
  {}

  public ExchangeMountSterilizeFromPaddockMessage(
      java.lang.String name, short worldX, short worldY, java.lang.String sterilizator)
  {
    this.name = name;
    this.worldX = worldX;
    this.worldY = worldY;
    this.sterilizator = sterilizator;
  }

  @Override
  public int getProtocolId()
  {
    return 6056;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.name);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_str(this.sterilizator);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.name = reader.read_str();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.sterilizator = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "ExchangeMountSterilizeFromPaddockMessage("
        + "name="
        + this.name
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", sterilizator="
        + this.sterilizator
        + ')';
  }
}
