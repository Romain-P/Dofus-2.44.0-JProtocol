// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCancelInvitationMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6254;
  // ui64
  public java.math.BigInteger guestId;

  public PartyCancelInvitationMessage()
  {}

  public PartyCancelInvitationMessage(int partyId, java.math.BigInteger guestId)
  {

    super(partyId);
    this.guestId = guestId;
  }

  @Override
  public int getProtocolId()
  {
    return 6254;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.guestId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guestId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyCancelInvitationMessage("
        + "partyId="
        + this.partyId
        + ", guestId="
        + this.guestId
        + ')';
  }
}
