// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyNewGuestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyEventMessage {
  public static final int PROTOCOL_ID = 6260;
  // com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
      guest;

  public PartyNewGuestMessage()
  {}

  public PartyNewGuestMessage(
      int partyId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
          guest)
  {

    super(partyId);
    this.guest = guest;
  }

  @Override
  public int getProtocolId()
  {
    return 6260;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.guest.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guest =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party
            .PartyGuestInformations();
    this.guest.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PartyNewGuestMessage(" + "partyId=" + this.partyId + ", guest=" + this.guest + ')';
  }
}
