// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCancelInvitationNotificationMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyEventMessage {
  public static final int PROTOCOL_ID = 6251;
  // ui64
  public java.math.BigInteger cancelerId;
  // ui64
  public java.math.BigInteger guestId;

  public PartyCancelInvitationNotificationMessage()
  {}

  public PartyCancelInvitationNotificationMessage(
      int partyId, java.math.BigInteger cancelerId, java.math.BigInteger guestId)
  {

    super(partyId);
    this.cancelerId = cancelerId;
    this.guestId = guestId;
  }

  @Override
  public int getProtocolId()
  {
    return 6251;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.cancelerId);
    writer.write_ui64(this.guestId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.cancelerId = reader.read_ui64();
    this.guestId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyCancelInvitationNotificationMessage("
        + "partyId="
        + this.partyId
        + ", cancelerId="
        + this.cancelerId
        + ", guestId="
        + this.guestId
        + ')';
  }
}
