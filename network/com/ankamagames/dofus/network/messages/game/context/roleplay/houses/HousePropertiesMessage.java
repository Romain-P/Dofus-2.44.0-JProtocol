// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HousePropertiesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5734;
  // vi32
  public int houseId;
  // array,i32
  public int[] doorsOnMap;
  // com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations
  public com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations properties;

  public HousePropertiesMessage() {}

  public HousePropertiesMessage(
      int houseId,
      int[] doorsOnMap,
      com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations properties) {
    this.houseId = houseId;
    this.doorsOnMap = doorsOnMap;
    this.properties = properties;
  }

  @Override
  public int getProtocolId() {
    return 5734;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.houseId);
    writer.write_ui16(doorsOnMap.length);
    writer.write_array_i32(this.doorsOnMap);
    writer.write_ui16(this.properties.getProtocolId());
    this.properties.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.houseId = reader.read_vi32();

    int doorsOnMap_length = reader.read_ui16();
    this.doorsOnMap = reader.read_array_i32(doorsOnMap_length);

    int properties_typeId = reader.read_ui16();
    this.properties =
        (com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations)
            InternalProtocolTypeManager.get(properties_typeId);
    this.properties.deserialize(reader);
  }

  @Override
  public String toString() {

    return "HousePropertiesMessage("
        + "houseId="
        + this.houseId
        + ", doorsOnMap="
        + java.util.Arrays.toString(this.doorsOnMap)
        + ", properties="
        + this.properties
        + ')';
  }
}
