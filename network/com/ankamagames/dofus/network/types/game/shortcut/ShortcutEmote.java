// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutEmote extends com.ankamagames.dofus.network.types.game.shortcut.Shortcut {
  public static final int PROTOCOL_ID = 389;
  // ui8
  public short emoteId;

  public ShortcutEmote()
  {}

  public ShortcutEmote(byte slot, short emoteId)
  {

    super(slot);
    this.emoteId = emoteId;
  }

  @Override
  public int getProtocolId()
  {
    return 389;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui8(this.emoteId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.emoteId = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "ShortcutEmote(" + "slot=" + this.slot + ", emoteId=" + this.emoteId + ')';
  }
}
