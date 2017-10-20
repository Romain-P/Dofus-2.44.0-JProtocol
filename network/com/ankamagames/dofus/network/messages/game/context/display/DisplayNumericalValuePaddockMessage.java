// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.display;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DisplayNumericalValuePaddockMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6563;
  // i32
  public int rideId;
  // i32
  public int value;
  // i8
  public byte type;

  public DisplayNumericalValuePaddockMessage() {}

  public DisplayNumericalValuePaddockMessage(int rideId, int value, byte type) {
    this.rideId = rideId;
    this.value = value;
    this.type = type;
  }

  @Override
  public int getProtocolId() {
    return 6563;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.rideId);
    writer.write_i32(this.value);
    writer.write_i8(this.type);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.rideId = reader.read_i32();
    this.value = reader.read_i32();
    this.type = reader.read_i8();
  }

  @Override
  public String toString() {

    return "DisplayNumericalValuePaddockMessage("
        + "rideId="
        + this.rideId
        + ", value="
        + this.value
        + ", type="
        + this.type
        + ')';
  }
}
