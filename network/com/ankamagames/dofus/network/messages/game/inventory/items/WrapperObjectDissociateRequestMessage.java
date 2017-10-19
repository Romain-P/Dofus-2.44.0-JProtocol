// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class WrapperObjectDissociateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6524;
  // vi32
  public int hostUID;
  // ui8
  public short hostPos;

  public WrapperObjectDissociateRequestMessage()
  {}

  public WrapperObjectDissociateRequestMessage(int hostUID, short hostPos)
  {
    this.hostUID = hostUID;
    this.hostPos = hostPos;
  }

  @Override
  public int getProtocolId()
  {
    return 6524;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.hostUID);
    writer.write_ui8(this.hostPos);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.hostUID = reader.read_vi32();
    this.hostPos = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "WrapperObjectDissociateRequestMessage("
        + "hostUID="
        + this.hostUID
        + ", hostPos="
        + this.hostPos
        + ')';
  }
}
