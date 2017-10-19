// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuestModeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6505;
  // bool
  public boolean active;

  public GuestModeMessage()
  {}

  public GuestModeMessage(boolean active)
  {
    this.active = active;
  }

  @Override
  public int getProtocolId()
  {
    return 6505;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.active);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.active = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GuestModeMessage(" + "active=" + this.active + ')';
  }
}
