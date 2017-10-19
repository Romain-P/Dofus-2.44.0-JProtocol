// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChangeHavenBagRoomRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6638;
  // i8
  public byte roomId;

  public ChangeHavenBagRoomRequestMessage()
  {}

  public ChangeHavenBagRoomRequestMessage(byte roomId)
  {
    this.roomId = roomId;
  }

  @Override
  public int getProtocolId()
  {
    return 6638;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.roomId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.roomId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ChangeHavenBagRoomRequestMessage(" + "roomId=" + this.roomId + ')';
  }
}
