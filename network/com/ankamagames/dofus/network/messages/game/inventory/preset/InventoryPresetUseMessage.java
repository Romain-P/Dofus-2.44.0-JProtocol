// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetUseMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6167;
  // i8
  public byte presetId;

  public InventoryPresetUseMessage() {}

  public InventoryPresetUseMessage(byte presetId) {
    this.presetId = presetId;
  }

  @Override
  public int getProtocolId() {
    return 6167;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "InventoryPresetUseMessage(" + "presetId=" + this.presetId + ')';
  }
}
