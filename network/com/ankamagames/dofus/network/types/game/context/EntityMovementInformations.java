// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EntityMovementInformations extends NetworkType {
  public static final int PROTOCOL_ID = 63;
  // i32
  public int id;
  // array,i8
  public byte[] steps;

  public EntityMovementInformations() {}

  public EntityMovementInformations(int id, byte[] steps) {
    this.id = id;
    this.steps = steps;
  }

  @Override
  public int getProtocolId() {
    return 63;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.id);
    writer.write_ui16(steps.length);
    writer.write_array_i8(this.steps);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_i32();

    int steps_length = reader.read_ui16();
    this.steps = reader.read_array_i8(steps_length);
  }

  @Override
  public String toString() {

    return "EntityMovementInformations("
        + "id="
        + this.id
        + ", steps="
        + +this.steps.length
        + "b"
        + ')';
  }
}
