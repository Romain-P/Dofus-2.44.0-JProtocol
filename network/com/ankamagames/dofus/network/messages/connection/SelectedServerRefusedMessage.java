// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SelectedServerRefusedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 41;
  // vi16
  public short serverId;
  // i8
  public byte error;
  // i8
  public byte serverStatus;

  public SelectedServerRefusedMessage()
  {}

  public SelectedServerRefusedMessage(short serverId, byte error, byte serverStatus)
  {
    this.serverId = serverId;
    this.error = error;
    this.serverStatus = serverStatus;
  }

  @Override
  public int getProtocolId()
  {
    return 41;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.serverId);
    writer.write_i8(this.error);
    writer.write_i8(this.serverStatus);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.serverId = reader.read_vi16();
    this.error = reader.read_i8();
    this.serverStatus = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "SelectedServerRefusedMessage("
        + "serverId="
        + this.serverId
        + ", error="
        + this.error
        + ", serverStatus="
        + this.serverStatus
        + ')';
  }
}
