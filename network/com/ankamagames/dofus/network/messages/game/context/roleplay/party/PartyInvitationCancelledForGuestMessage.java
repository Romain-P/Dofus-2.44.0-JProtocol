// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationCancelledForGuestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6256;
  // vi64
  public long cancelerId;

  public PartyInvitationCancelledForGuestMessage() {}

  public PartyInvitationCancelledForGuestMessage(int partyId, long cancelerId) {

    super(partyId);
    this.cancelerId = cancelerId;
  }

  @Override
  public int getProtocolId() {
    return 6256;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.cancelerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.cancelerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PartyInvitationCancelledForGuestMessage("
        + "partyId="
        + this.partyId
        + ", cancelerId="
        + this.cancelerId
        + ')';
  }
}
