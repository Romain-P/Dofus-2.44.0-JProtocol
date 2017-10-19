// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicAckMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6362;
  // vi32
  public int seq;
  // vi16
  public short lastPacketId;

  public BasicAckMessage()
  {}

  public BasicAckMessage(int seq, short lastPacketId)
  {
    this.seq = seq;
    this.lastPacketId = lastPacketId;
  }

  @Override
  public int getProtocolId()
  {
    return 6362;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.seq);
    writer.write_vi16(this.lastPacketId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.seq = reader.read_vi32();
    this.lastPacketId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "BasicAckMessage(" + "seq=" + this.seq + ", lastPacketId=" + this.lastPacketId + ')';
  }
}
