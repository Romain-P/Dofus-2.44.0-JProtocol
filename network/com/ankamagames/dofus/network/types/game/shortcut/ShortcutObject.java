// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutObject extends com.ankamagames.dofus.network.types.game.shortcut.Shortcut {
  public static final int PROTOCOL_ID = 367;

  public ShortcutObject()
  {}

  public ShortcutObject(byte slot)
  {

    super(slot);
  }

  @Override
  public int getProtocolId()
  {
    return 367;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ShortcutObject(" + "slot=" + this.slot + ')';
  }
}
