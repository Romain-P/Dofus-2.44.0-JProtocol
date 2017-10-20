// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryContentAndPresetMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.InventoryContentMessage {
  public static final int PROTOCOL_ID = 6162;
  // array,com.ankamagames.dofus.network.types.game.inventory.preset.Preset
  public com.ankamagames.dofus.network.types.game.inventory.preset.Preset[] presets;
  // array,com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset
  public com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset[] idolsPresets;

  public InventoryContentAndPresetMessage() {}

  public InventoryContentAndPresetMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects,
      long kamas,
      com.ankamagames.dofus.network.types.game.inventory.preset.Preset[] presets,
      com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset[] idolsPresets) {

    super(objects, kamas);
    this.presets = presets;
    this.idolsPresets = idolsPresets;
  }

  public InventoryContentAndPresetMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects,
      long kamas,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.inventory.preset.Preset>
          presets,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset>
          idolsPresets) {

    super(objects, kamas);
    this.presets =
        presets.toArray(com.ankamagames.dofus.network.types.game.inventory.preset.Preset[]::new);
    this.idolsPresets =
        idolsPresets.toArray(
            com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6162;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(presets.length);

    for (int i = 0; i < presets.length; i++) {

      presets[i].serialize(writer);
    }
    writer.write_ui16(idolsPresets.length);

    for (int i = 0; i < idolsPresets.length; i++) {

      idolsPresets[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int presets_length = reader.read_ui16();
    this.presets =
        new com.ankamagames.dofus.network.types.game.inventory.preset.Preset[presets_length];

    for (int i = 0; i < presets_length; i++) {

      com.ankamagames.dofus.network.types.game.inventory.preset.Preset presets_it =
          new com.ankamagames.dofus.network.types.game.inventory.preset.Preset();

      presets_it.deserialize(reader);
      this.presets[i] = presets_it;
    }

    int idolsPresets_length = reader.read_ui16();
    this.idolsPresets =
        new com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset
            [idolsPresets_length];

    for (int i = 0; i < idolsPresets_length; i++) {

      com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset idolsPresets_it =
          new com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset();

      idolsPresets_it.deserialize(reader);
      this.idolsPresets[i] = idolsPresets_it;
    }
  }

  @Override
  public String toString() {

    return "InventoryContentAndPresetMessage("
        + "objects="
        + java.util.Arrays.toString(this.objects)
        + ", kamas="
        + this.kamas
        + ", presets="
        + java.util.Arrays.toString(this.presets)
        + ", idolsPresets="
        + java.util.Arrays.toString(this.idolsPresets)
        + ')';
  }
}
