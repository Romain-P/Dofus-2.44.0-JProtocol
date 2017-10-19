// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountRidingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5967;
  // bool
  public boolean isRiding;

  public MountRidingMessage()
  {}

  public MountRidingMessage(boolean isRiding)
  {
    this.isRiding = isRiding;
  }

  @Override
  public int getProtocolId()
  {
    return 5967;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.isRiding);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.isRiding = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "MountRidingMessage(" + "isRiding=" + this.isRiding + ')';
  }
}
