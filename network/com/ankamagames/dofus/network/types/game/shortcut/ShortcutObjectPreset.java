// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutObjectPreset
    extends com.ankamagames.dofus.network.types.game.shortcut.ShortcutObject {
  public static final int PROTOCOL_ID = 370;
  // i8
  public byte presetId;

  public ShortcutObjectPreset() {}

  public ShortcutObjectPreset(byte slot, byte presetId) {

    super(slot);
    this.presetId = presetId;
  }

  @Override
  public int getProtocolId() {
    return 370;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.presetId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.presetId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ShortcutObjectPreset(" + "slot=" + this.slot + ", presetId=" + this.presetId + ')';
  }
}
