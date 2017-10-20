// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismGeolocalizedInformation
    extends com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo {
  public static final int PROTOCOL_ID = 434;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // com.ankamagames.dofus.network.types.game.prism.PrismInformation
  public com.ankamagames.dofus.network.types.game.prism.PrismInformation prism;

  public PrismGeolocalizedInformation() {}

  public PrismGeolocalizedInformation(
      short subAreaId,
      int allianceId,
      short worldX,
      short worldY,
      double mapId,
      com.ankamagames.dofus.network.types.game.prism.PrismInformation prism) {

    super(subAreaId, allianceId);
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.prism = prism;
  }

  @Override
  public int getProtocolId() {
    return 434;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_ui16(this.prism.getProtocolId());
    this.prism.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();

    int prism_typeId = reader.read_ui16();
    this.prism =
        (com.ankamagames.dofus.network.types.game.prism.PrismInformation)
            InternalProtocolTypeManager.get(prism_typeId);
    this.prism.deserialize(reader);
  }

  @Override
  public String toString() {

    return "PrismGeolocalizedInformation("
        + "subAreaId="
        + this.subAreaId
        + ", allianceId="
        + this.allianceId
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", prism="
        + this.prism
        + ')';
  }
}
