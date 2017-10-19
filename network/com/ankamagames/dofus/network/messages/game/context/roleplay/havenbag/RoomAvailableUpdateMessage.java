// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RoomAvailableUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6630;
  // ui8
  public short nbRoom;

  public RoomAvailableUpdateMessage()
  {}

  public RoomAvailableUpdateMessage(short nbRoom)
  {
    this.nbRoom = nbRoom;
  }

  @Override
  public int getProtocolId()
  {
    return 6630;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.nbRoom);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.nbRoom = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "RoomAvailableUpdateMessage(" + "nbRoom=" + this.nbRoom + ')';
  }
}
