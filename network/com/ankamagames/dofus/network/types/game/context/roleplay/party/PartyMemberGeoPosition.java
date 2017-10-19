// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberGeoPosition extends NetworkType {
  public static final int PROTOCOL_ID = 378;
  // i32
  public int memberId;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;

  public PartyMemberGeoPosition()
  {}

  public PartyMemberGeoPosition(
      int memberId, short worldX, short worldY, double mapId, short subAreaId)
  {
    this.memberId = memberId;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
  }

  @Override
  public int getProtocolId()
  {
    return 378;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.memberId);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.memberId = reader.read_i32();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "PartyMemberGeoPosition("
        + "memberId="
        + this.memberId
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ')';
  }
}
