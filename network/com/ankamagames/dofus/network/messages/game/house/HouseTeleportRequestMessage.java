// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseTeleportRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6726;
  // vi32
  public int houseId;
  // i32
  public int houseInstanceId;

  public HouseTeleportRequestMessage() {}

  public HouseTeleportRequestMessage(int houseId, int houseInstanceId) {
    this.houseId = houseId;
    this.houseInstanceId = houseInstanceId;
  }

  @Override
  public int getProtocolId() {
    return 6726;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.houseId);
    writer.write_i32(this.houseInstanceId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.houseId = reader.read_vi32();
    this.houseInstanceId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "HouseTeleportRequestMessage("
        + "houseId="
        + this.houseId
        + ", houseInstanceId="
        + this.houseInstanceId
        + ')';
  }
}
