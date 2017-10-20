// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyRefuseInvitationNotificationMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyEventMessage {
  public static final int PROTOCOL_ID = 5596;
  // vi64
  public long guestId;

  public PartyRefuseInvitationNotificationMessage() {}

  public PartyRefuseInvitationNotificationMessage(int partyId, long guestId) {

    super(partyId);
    this.guestId = guestId;
  }

  @Override
  public int getProtocolId() {
    return 5596;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.guestId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.guestId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PartyRefuseInvitationNotificationMessage("
        + "partyId="
        + this.partyId
        + ", guestId="
        + this.guestId
        + ')';
  }
}
