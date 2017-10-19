// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.initialization;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class OnConnectionEventMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5726;
  // i8
  public byte eventType;

  public OnConnectionEventMessage()
  {}

  public OnConnectionEventMessage(byte eventType)
  {
    this.eventType = eventType;
  }

  @Override
  public int getProtocolId()
  {
    return 5726;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.eventType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.eventType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "OnConnectionEventMessage(" + "eventType=" + this.eventType + ')';
  }
}
