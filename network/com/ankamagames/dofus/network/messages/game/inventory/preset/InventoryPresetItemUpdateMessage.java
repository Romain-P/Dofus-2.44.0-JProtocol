// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetItemUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6168;
  // i8
  public byte presetId;
  // com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem
  public com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem presetItem;

  public InventoryPresetItemUpdateMessage() {}

  public InventoryPresetItemUpdateMessage(
      byte presetId,
      com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem presetItem) {
    this.presetId = presetId;
    this.presetItem = presetItem;
  }

  @Override
  public int getProtocolId() {
    return 6168;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    this.presetItem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.presetItem = new com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem();
    this.presetItem.deserialize(reader);
  }

  @Override
  public String toString() {

    return "InventoryPresetItemUpdateMessage("
        + "presetId="
        + this.presetId
        + ", presetItem="
        + this.presetItem
        + ')';
  }
}
