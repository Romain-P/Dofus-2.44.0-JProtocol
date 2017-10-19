// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutSmiley extends com.ankamagames.dofus.network.types.game.shortcut.Shortcut {
  public static final int PROTOCOL_ID = 388;
  // vi16
  public short smileyId;

  public ShortcutSmiley()
  {}

  public ShortcutSmiley(byte slot, short smileyId)
  {

    super(slot);
    this.smileyId = smileyId;
  }

  @Override
  public int getProtocolId()
  {
    return 388;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.smileyId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.smileyId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ShortcutSmiley(" + "slot=" + this.slot + ", smileyId=" + this.smileyId + ')';
  }
}
