// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CurrentServerStatusUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6525;
  // i8
  public byte status;

  public CurrentServerStatusUpdateMessage()
  {}

  public CurrentServerStatusUpdateMessage(byte status)
  {
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 6525;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.status);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.status = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "CurrentServerStatusUpdateMessage(" + "status=" + this.status + ')';
  }
}
