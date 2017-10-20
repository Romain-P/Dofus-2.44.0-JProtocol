// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPreset extends NetworkType {
  public static final int PROTOCOL_ID = 491;
  // i8
  public byte presetId;
  // i8
  public byte symbolId;
  // array,vi16
  public short[] idolId;

  public IdolsPreset() {}

  public IdolsPreset(byte presetId, byte symbolId, short[] idolId) {
    this.presetId = presetId;
    this.symbolId = symbolId;
    this.idolId = idolId;
  }

  @Override
  public int getProtocolId() {
    return 491;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.symbolId);
    writer.write_ui16(idolId.length);
    writer.write_array_vi16(this.idolId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.symbolId = reader.read_i8();

    int idolId_length = reader.read_ui16();
    this.idolId = reader.read_array_vi16(idolId_length);
  }

  @Override
  public String toString() {

    return "IdolsPreset("
        + "presetId="
        + this.presetId
        + ", symbolId="
        + this.symbolId
        + ", idolId="
        + java.util.Arrays.toString(this.idolId)
        + ')';
  }
}
