// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPresetUseResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6614;
  // i8
  public byte presetId;
  // i8
  public byte code;
  // array,vi16
  public short[] missingIdols;

  public IdolsPresetUseResultMessage() {}

  public IdolsPresetUseResultMessage(byte presetId, byte code, short[] missingIdols) {
    this.presetId = presetId;
    this.code = code;
    this.missingIdols = missingIdols;
  }

  @Override
  public int getProtocolId() {
    return 6614;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.code);
    writer.write_ui16(missingIdols.length);
    writer.write_array_vi16(this.missingIdols);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.code = reader.read_i8();

    int missingIdols_length = reader.read_ui16();
    this.missingIdols = reader.read_array_vi16(missingIdols_length);
  }

  @Override
  public String toString() {

    return "IdolsPresetUseResultMessage("
        + "presetId="
        + this.presetId
        + ", code="
        + this.code
        + ", missingIdols="
        + java.util.Arrays.toString(this.missingIdols)
        + ')';
  }
}
