// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformationsInside
    extends com.ankamagames.dofus.network.types.game.house.HouseInformations {
  public static final int PROTOCOL_ID = 218;
  // com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations
  public com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations houseInfos;
  // i16
  public short worldX;
  // i16
  public short worldY;

  public HouseInformationsInside() {}

  public HouseInformationsInside(
      int houseId,
      short modelId,
      com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations houseInfos,
      short worldX,
      short worldY) {

    super(houseId, modelId);
    this.houseInfos = houseInfos;
    this.worldX = worldX;
    this.worldY = worldY;
  }

  @Override
  public int getProtocolId() {
    return 218;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.houseInfos.getProtocolId());
    this.houseInfos.serialize(writer);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
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
  }

  @Override
  public String toString() {

    return "HouseInformationsInside("
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
        + ')';
  }
}
