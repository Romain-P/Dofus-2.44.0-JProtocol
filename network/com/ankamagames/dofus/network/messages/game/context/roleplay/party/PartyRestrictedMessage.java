// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyRestrictedMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6175;
  // bool
  public boolean restricted;

  public PartyRestrictedMessage()
  {}

  public PartyRestrictedMessage(int partyId, boolean restricted)
  {

    super(partyId);
    this.restricted = restricted;
  }

  @Override
  public int getProtocolId()
  {
    return 6175;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.restricted);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.restricted = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "PartyRestrictedMessage("
        + "partyId="
        + this.partyId
        + ", restricted="
        + this.restricted
        + ')';
  }
}
