// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6045;
  // vi32
  public int requestId;

  public ContactLookErrorMessage()
  {}

  public ContactLookErrorMessage(int requestId)
  {
    this.requestId = requestId;
  }

  @Override
  public int getProtocolId()
  {
    return 6045;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.requestId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.requestId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ContactLookErrorMessage(" + "requestId=" + this.requestId + ')';
  }
}
