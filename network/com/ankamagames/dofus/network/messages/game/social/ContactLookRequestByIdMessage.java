// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookRequestByIdMessage
    extends com.ankamagames.dofus.network.messages.game.social.ContactLookRequestMessage {
  public static final int PROTOCOL_ID = 5935;
  // vi64
  public long playerId;

  public ContactLookRequestByIdMessage() {}

  public ContactLookRequestByIdMessage(short requestId, byte contactType, long playerId) {

    super(requestId, contactType);
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId() {
    return 5935;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ContactLookRequestByIdMessage("
        + "requestId="
        + this.requestId
        + ", contactType="
        + this.contactType
        + ", playerId="
        + this.playerId
        + ')';
  }
}
