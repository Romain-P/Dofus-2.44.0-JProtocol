// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareCriteria extends NetworkType {
  public static final int PROTOCOL_ID = 501;
  // i8
  public byte type;
  // array,i32
  public int[] params;

  public DareCriteria() {}

  public DareCriteria(byte type, int[] params) {
    this.type = type;
    this.params = params;
  }

  @Override
  public int getProtocolId() {
    return 501;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.type);
    writer.write_ui16(params.length);
    writer.write_array_i32(this.params);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type = reader.read_i8();

    int params_length = reader.read_ui16();
    this.params = reader.read_array_i32(params_length);
  }

  @Override
  public String toString() {

    return "DareCriteria("
        + "type="
        + this.type
        + ", params="
        + java.util.Arrays.toString(this.params)
        + ')';
  }
}
