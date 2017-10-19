// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutSpell extends com.ankamagames.dofus.network.types.game.shortcut.Shortcut {
  public static final int PROTOCOL_ID = 368;
  // vi16
  public short spellId;

  public ShortcutSpell()
  {}

  public ShortcutSpell(byte slot, short spellId)
  {

    super(slot);
    this.spellId = spellId;
  }

  @Override
  public int getProtocolId()
  {
    return 368;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.spellId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.spellId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ShortcutSpell(" + "slot=" + this.slot + ", spellId=" + this.spellId + ')';
  }
}
