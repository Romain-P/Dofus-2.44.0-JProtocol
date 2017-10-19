// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyNewMemberMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyUpdateMessage {
  public static final int PROTOCOL_ID = 6306;

  public PartyNewMemberMessage()
  {}

  public PartyNewMemberMessage(
      int partyId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
          memberInformations)
  {

    super(partyId, memberInformations);
  }

  @Override
  public int getProtocolId()
  {
    return 6306;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PartyNewMemberMessage("
        + "partyId="
        + this.partyId
        + ", memberInformations="
        + this.memberInformations
        + ')';
  }
}
