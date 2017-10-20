// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseOnMapInformations
    extends com.ankamagames.dofus.network.types.game.house.HouseInformations {
  public static final int PROTOCOL_ID = 510;
  // array,i32
  public int[] doorsOnMap;
  // array,com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations
  public com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations[] houseInstances;

  public HouseOnMapInformations() {}

  public HouseOnMapInformations(
      int houseId,
      short modelId,
      int[] doorsOnMap,
      com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations[] houseInstances) {

    super(houseId, modelId);
    this.doorsOnMap = doorsOnMap;
    this.houseInstances = houseInstances;
  }

  public HouseOnMapInformations(
      int houseId,
      short modelId,
      int[] doorsOnMap,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations>
          houseInstances) {

    super(houseId, modelId);
    this.doorsOnMap = doorsOnMap;
    this.houseInstances =
        houseInstances.toArray(
            com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 510;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(doorsOnMap.length);
    writer.write_array_i32(this.doorsOnMap);
    writer.write_ui16(houseInstances.length);

    for (int i = 0; i < houseInstances.length; i++) {

      houseInstances[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int doorsOnMap_length = reader.read_ui16();
    this.doorsOnMap = reader.read_array_i32(doorsOnMap_length);

    int houseInstances_length = reader.read_ui16();
    this.houseInstances =
        new com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations
            [houseInstances_length];

    for (int i = 0; i < houseInstances_length; i++) {

      com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations houseInstances_it =
          new com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations();

      houseInstances_it.deserialize(reader);
      this.houseInstances[i] = houseInstances_it;
    }
  }

  @Override
  public String toString() {

    return "HouseOnMapInformations("
        + "houseId="
        + this.houseId
        + ", modelId="
        + this.modelId
        + ", doorsOnMap="
        + java.util.Arrays.toString(this.doorsOnMap)
        + ", houseInstances="
        + java.util.Arrays.toString(this.houseInstances)
        + ')';
  }
}
