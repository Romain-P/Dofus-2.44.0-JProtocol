// Created by Heat the 2017-10-19 04:03:13+02:00
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
  // ui64
  public java.math.BigInteger cancelerId;

  public PartyInvitationCancelledForGuestMessage()
  {}

  public PartyInvitationCancelledForGuestMessage(int partyId, java.math.BigInteger cancelerId)
  {

    super(partyId);
    this.cancelerId = cancelerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6256;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.cancelerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.cancelerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyInvitationCancelledForGuestMessage("
        + "partyId="
        + this.partyId
        + ", cancelerId="
        + this.cancelerId
        + ')';
  }
}
