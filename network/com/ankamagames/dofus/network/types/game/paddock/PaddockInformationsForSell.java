// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockInformationsForSell extends NetworkType {
  public static final int PROTOCOL_ID = 222;
  // str
  public java.lang.String guildOwner;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // vi16
  public short subAreaId;
  // i8
  public byte nbMount;
  // i8
  public byte nbObject;
  // ui64
  public java.math.BigInteger price;

  public PaddockInformationsForSell()
  {}

  public PaddockInformationsForSell(
      java.lang.String guildOwner,
      short worldX,
      short worldY,
      short subAreaId,
      byte nbMount,
      byte nbObject,
      java.math.BigInteger price)
  {
    this.guildOwner = guildOwner;
    this.worldX = worldX;
    this.worldY = worldY;
    this.subAreaId = subAreaId;
    this.nbMount = nbMount;
    this.nbObject = nbObject;
    this.price = price;
  }

  @Override
  public int getProtocolId()
  {
    return 222;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.guildOwner);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_vi16(this.subAreaId);
    writer.write_i8(this.nbMount);
    writer.write_i8(this.nbObject);
    writer.write_ui64(this.price);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.guildOwner = reader.read_str();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.subAreaId = reader.read_vi16();
    this.nbMount = reader.read_i8();
    this.nbObject = reader.read_i8();
    this.price = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PaddockInformationsForSell("
        + "guildOwner="
        + this.guildOwner
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", subAreaId="
        + this.subAreaId
        + ", nbMount="
        + this.nbMount
        + ", nbObject="
        + this.nbObject
        + ", price="
        + this.price
        + ')';
  }
}
