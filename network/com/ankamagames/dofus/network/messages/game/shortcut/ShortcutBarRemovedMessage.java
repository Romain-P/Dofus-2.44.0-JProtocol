// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6224;
  // i8
  public byte barType;
  // i8
  public byte slot;

  public ShortcutBarRemovedMessage() {}

  public ShortcutBarRemovedMessage(byte barType, byte slot) {
    this.barType = barType;
    this.slot = slot;
  }

  @Override
  public int getProtocolId() {
    return 6224;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.barType);
    writer.write_i8(this.slot);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.barType = reader.read_i8();
    this.slot = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ShortcutBarRemovedMessage(" + "barType=" + this.barType + ", slot=" + this.slot + ')';
  }
}
