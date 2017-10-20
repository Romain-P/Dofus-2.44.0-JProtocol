// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapCoordinatesExtended
    extends com.ankamagames.dofus.network.types.game.context.MapCoordinatesAndId {
  public static final int PROTOCOL_ID = 176;
  // vi16
  public short subAreaId;

  public MapCoordinatesExtended() {}

  public MapCoordinatesExtended(short worldX, short worldY, double mapId, short subAreaId) {

    super(worldX, worldY, mapId);
    this.subAreaId = subAreaId;
  }

  @Override
  public int getProtocolId() {
    return 176;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.subAreaId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.subAreaId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "MapCoordinatesExtended("
        + "worldX="
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
