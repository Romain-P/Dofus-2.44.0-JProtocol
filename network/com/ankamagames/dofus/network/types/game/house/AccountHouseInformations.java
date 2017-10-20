// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountHouseInformations
    extends com.ankamagames.dofus.network.types.game.house.HouseInformations {
  public static final int PROTOCOL_ID = 390;
  // com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations
  public com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations houseInfos;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;

  public AccountHouseInformations() {}

  public AccountHouseInformations(
      int houseId,
      short modelId,
      com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations houseInfos,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId) {

    super(houseId, modelId);
    this.houseInfos = houseInfos;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
  }

  @Override
  public int getProtocolId() {
    return 390;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.houseInfos.getProtocolId());
    this.houseInfos.serialize(writer);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int houseInfos_typeId = reader.read_ui16();
    this.houseInfos =
        (com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations)
            InternalProtocolTypeManager.get(houseInfos_typeId);
    this.houseInfos.deserialize(reader);
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "AccountHouseInformations("
        + "houseId="
        + this.houseId
        + ", modelId="
        + this.modelId
        + ", houseInfos="
        + this.houseInfos
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
