// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookRequestByNameMessage
    extends com.ankamagames.dofus.network.messages.game.social.ContactLookRequestMessage {
  public static final int PROTOCOL_ID = 5933;
  // str
  public java.lang.String playerName;

  public ContactLookRequestByNameMessage() {}

  public ContactLookRequestByNameMessage(
      short requestId, byte contactType, java.lang.String playerName) {

    super(requestId, contactType);
    this.playerName = playerName;
  }

  @Override
  public int getProtocolId() {
    return 5933;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.playerName);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerName = reader.read_str();
  }

  @Override
  public String toString() {

    return "ContactLookRequestByNameMessage("
        + "requestId="
        + this.requestId
        + ", contactType="
        + this.contactType
        + ", playerName="
        + this.playerName
        + ')';
  }
}
