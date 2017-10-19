// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorAttackedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5918;
  // vi16
  public short firstNameId;
  // vi16
  public short lastNameId;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild;

  public TaxCollectorAttackedMessage()
  {}

  public TaxCollectorAttackedMessage(
      short firstNameId,
      short lastNameId,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild)
  {
    this.firstNameId = firstNameId;
    this.lastNameId = lastNameId;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.guild = guild;
  }

  @Override
  public int getProtocolId()
  {
    return 5918;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.firstNameId);
    writer.write_vi16(this.lastNameId);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
    this.guild.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.firstNameId = reader.read_vi16();
    this.lastNameId = reader.read_vi16();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();
    this.guild =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guild.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "TaxCollectorAttackedMessage("
        + "firstNameId="
        + this.firstNameId
        + ", lastNameId="
        + this.lastNameId
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ", guild="
        + this.guild
        + ')';
  }
}
