// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryEntryPlayerInfo extends NetworkType {
  public static final int PROTOCOL_ID = 194;
  // ui64
  public java.math.BigInteger playerId;
  // str
  public java.lang.String playerName;
  // i8
  public byte alignmentSide;
  // i8
  public byte breed;
  // bool
  public boolean sex;
  // bool
  public boolean isInWorkshop;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;

  public JobCrafterDirectoryEntryPlayerInfo()
  {}

  public JobCrafterDirectoryEntryPlayerInfo(
      java.math.BigInteger playerId,
      java.lang.String playerName,
      byte alignmentSide,
      byte breed,
      boolean sex,
      boolean isInWorkshop,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status)
  {
    this.playerId = playerId;
    this.playerName = playerName;
    this.alignmentSide = alignmentSide;
    this.breed = breed;
    this.sex = sex;
    this.isInWorkshop = isInWorkshop;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 194;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.playerId);
    writer.write_str(this.playerName);
    writer.write_i8(this.alignmentSide);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
    writer.write_bool(this.isInWorkshop);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerId = reader.read_ui64();
    this.playerName = reader.read_str();
    this.alignmentSide = reader.read_i8();
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();
    this.isInWorkshop = reader.read_bool();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "JobCrafterDirectoryEntryPlayerInfo("
        + "playerId="
        + this.playerId
        + ", playerName="
        + this.playerName
        + ", alignmentSide="
        + this.alignmentSide
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", isInWorkshop="
        + this.isInWorkshop
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ", status="
        + this.status
        + ')';
  }
}
