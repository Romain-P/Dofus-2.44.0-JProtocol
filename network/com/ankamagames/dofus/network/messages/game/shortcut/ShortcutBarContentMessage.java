// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarContentMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6231;
  // i8
  public byte barType;
  // array,com.ankamagames.dofus.network.types.game.shortcut.Shortcut
  public com.ankamagames.dofus.network.types.game.shortcut.Shortcut[] shortcuts;

  public ShortcutBarContentMessage()
  {}

  public ShortcutBarContentMessage(
      byte barType, com.ankamagames.dofus.network.types.game.shortcut.Shortcut[] shortcuts)
  {
    this.barType = barType;
    this.shortcuts = shortcuts;
  }

  public ShortcutBarContentMessage(
      byte barType,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.shortcut.Shortcut>
          shortcuts)
  {
    this.barType = barType;
    this.shortcuts =
        shortcuts.toArray(com.ankamagames.dofus.network.types.game.shortcut.Shortcut[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6231;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.barType);
    writer.write_ui16(shortcuts.length);

    for (int i = 0; i < shortcuts.length; i++)
  {

      writer.write_ui16(shortcuts[i].getProtocolId());

      shortcuts[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.barType = reader.read_i8();

    int shortcuts_length = reader.read_ui16();
    this.shortcuts =
        new com.ankamagames.dofus.network.types.game.shortcut.Shortcut[shortcuts_length];

    for (int i = 0; i < shortcuts_length; i++)
  {

      int shortcuts_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.shortcut.Shortcut shortcuts_it =
          (com.ankamagames.dofus.network.types.game.shortcut.Shortcut)
              InternalProtocolTypeManager.get(shortcuts_it_typeId);

      shortcuts_it.deserialize(reader);
      this.shortcuts[i] = shortcuts_it;
    }
  }

  @Override
  public String toString()
  {

    return "ShortcutBarContentMessage("
        + "barType="
        + this.barType
        + ", shortcuts="
        + java.util.Arrays.toString(this.shortcuts)
        + ')';
  }
}
