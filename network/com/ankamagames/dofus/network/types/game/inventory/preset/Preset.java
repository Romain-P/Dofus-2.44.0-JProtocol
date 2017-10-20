// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class Preset extends NetworkType {
  public static final int PROTOCOL_ID = 355;
  // i8
  public byte presetId;
  // i8
  public byte symbolId;
  // bool
  public boolean mount;
  // array,com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem
  public com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem[] objects;

  public Preset() {}

  public Preset(
      byte presetId,
      byte symbolId,
      boolean mount,
      com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem[] objects) {
    this.presetId = presetId;
    this.symbolId = symbolId;
    this.mount = mount;
    this.objects = objects;
  }

  public Preset(
      byte presetId,
      byte symbolId,
      boolean mount,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem>
          objects) {
    this.presetId = presetId;
    this.symbolId = symbolId;
    this.mount = mount;
    this.objects =
        objects.toArray(
            com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 355;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.symbolId);
    writer.write_bool(this.mount);
    writer.write_ui16(objects.length);

    for (int i = 0; i < objects.length; i++) {

      objects[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.symbolId = reader.read_i8();
    this.mount = reader.read_bool();

    int objects_length = reader.read_ui16();
    this.objects =
        new com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem[objects_length];

    for (int i = 0; i < objects_length; i++) {

      com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem objects_it =
          new com.ankamagames.dofus.network.types.game.inventory.preset.PresetItem();

      objects_it.deserialize(reader);
      this.objects[i] = objects_it;
    }
  }

  @Override
  public String toString() {

    return "Preset("
        + "presetId="
        + this.presetId
        + ", symbolId="
        + this.symbolId
        + ", mount="
        + this.mount
        + ", objects="
        + java.util.Arrays.toString(this.objects)
        + ')';
  }
}
