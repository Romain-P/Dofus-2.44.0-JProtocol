// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutObjectItem
    extends com.ankamagames.dofus.network.types.game.shortcut.ShortcutObject {
  public static final int PROTOCOL_ID = 371;
  // i32
  public int itemUID;
  // i32
  public int itemGID;

  public ShortcutObjectItem() {}

  public ShortcutObjectItem(byte slot, int itemUID, int itemGID) {

    super(slot);
    this.itemUID = itemUID;
    this.itemGID = itemGID;
  }

  @Override
  public int getProtocolId() {
    return 371;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.itemUID);
    writer.write_i32(this.itemGID);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.itemUID = reader.read_i32();
    this.itemGID = reader.read_i32();
  }

  @Override
  public String toString() {

    return "ShortcutObjectItem("
        + "slot="
        + this.slot
        + ", itemUID="
        + this.itemUID
        + ", itemGID="
        + this.itemGID
        + ')';
  }
}
