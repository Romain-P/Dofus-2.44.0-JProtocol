// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetUseResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6163;
  // i8
  public byte presetId;
  // i8
  public byte code;
  // array,ui8
  public short[] unlinkedPosition;

  public InventoryPresetUseResultMessage() {}

  public InventoryPresetUseResultMessage(byte presetId, byte code, short[] unlinkedPosition) {
    this.presetId = presetId;
    this.code = code;
    this.unlinkedPosition = unlinkedPosition;
  }

  @Override
  public int getProtocolId() {
    return 6163;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.code);
    writer.write_ui16(unlinkedPosition.length);
    writer.write_array_ui8(this.unlinkedPosition);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.code = reader.read_i8();

    int unlinkedPosition_length = reader.read_ui16();
    this.unlinkedPosition = reader.read_array_ui8(unlinkedPosition_length);
  }

  @Override
  public String toString() {

    return "InventoryPresetUseResultMessage("
        + "presetId="
        + this.presetId
        + ", code="
        + this.code
        + ", unlinkedPosition="
        + java.util.Arrays.toString(this.unlinkedPosition)
        + ')';
  }
}
