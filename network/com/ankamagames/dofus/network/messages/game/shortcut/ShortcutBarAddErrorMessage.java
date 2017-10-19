// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarAddErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6227;
  // i8
  public byte error;

  public ShortcutBarAddErrorMessage()
  {}

  public ShortcutBarAddErrorMessage(byte error)
  {
    this.error = error;
  }

  @Override
  public int getProtocolId()
  {
    return 6227;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.error);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.error = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ShortcutBarAddErrorMessage(" + "error=" + this.error + ')';
  }
}
