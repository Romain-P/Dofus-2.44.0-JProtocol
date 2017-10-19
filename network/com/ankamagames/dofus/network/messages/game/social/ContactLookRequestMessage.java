// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5932;
  // ui8
  public short requestId;
  // i8
  public byte contactType;

  public ContactLookRequestMessage()
  {}

  public ContactLookRequestMessage(short requestId, byte contactType)
  {
    this.requestId = requestId;
    this.contactType = contactType;
  }

  @Override
  public int getProtocolId()
  {
    return 5932;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.requestId);
    writer.write_i8(this.contactType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.requestId = reader.read_ui8();
    this.contactType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ContactLookRequestMessage("
        + "requestId="
        + this.requestId
        + ", contactType="
        + this.contactType
        + ')';
  }
}
