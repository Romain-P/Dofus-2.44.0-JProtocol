// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformations extends NetworkType {
  public static final int PROTOCOL_ID = 111;
  // vi32
  public int houseId;
  // vi16
  public short modelId;

  public HouseInformations() {}

  public HouseInformations(int houseId, short modelId) {
    this.houseId = houseId;
    this.modelId = modelId;
  }

  @Override
  public int getProtocolId() {
    return 111;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.houseId);
    writer.write_vi16(this.modelId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.houseId = reader.read_vi32();
    this.modelId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "HouseInformations(" + "houseId=" + this.houseId + ", modelId=" + this.modelId + ')';
  }
}
