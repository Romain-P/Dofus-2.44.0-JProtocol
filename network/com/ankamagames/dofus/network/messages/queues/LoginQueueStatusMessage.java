// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.queues;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LoginQueueStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 10;
  // ui16
  public int position;
  // ui16
  public int total;

  public LoginQueueStatusMessage()
  {}

  public LoginQueueStatusMessage(int position, int total)
  {
    this.position = position;
    this.total = total;
  }

  @Override
  public int getProtocolId()
  {
    return 10;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.position);
    writer.write_ui16(this.total);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.position = reader.read_ui16();
    this.total = reader.read_ui16();
  }

  @Override
  public String toString()
  {

    return "LoginQueueStatusMessage(" + "position=" + this.position + ", total=" + this.total + ')';
  }
}
