// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarRemoveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6228;
  // i8
  public byte barType;
  // i8
  public byte slot;

  public ShortcutBarRemoveRequestMessage()
  {}

  public ShortcutBarRemoveRequestMessage(byte barType, byte slot)
  {
    this.barType = barType;
    this.slot = slot;
  }

  @Override
  public int getProtocolId()
  {
    return 6228;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.barType);
    writer.write_i8(this.slot);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.barType = reader.read_i8();
    this.slot = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ShortcutBarRemoveRequestMessage("
        + "barType="
        + this.barType
        + ", slot="
        + this.slot
        + ')';
  }
}
