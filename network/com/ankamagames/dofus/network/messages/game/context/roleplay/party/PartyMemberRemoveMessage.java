// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberRemoveMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyEventMessage {
  public static final int PROTOCOL_ID = 5579;
  // ui64
  public java.math.BigInteger leavingPlayerId;

  public PartyMemberRemoveMessage()
  {}

  public PartyMemberRemoveMessage(int partyId, java.math.BigInteger leavingPlayerId)
  {

    super(partyId);
    this.leavingPlayerId = leavingPlayerId;
  }

  @Override
  public int getProtocolId()
  {
    return 5579;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.leavingPlayerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.leavingPlayerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyMemberRemoveMessage("
        + "partyId="
        + this.partyId
        + ", leavingPlayerId="
        + this.leavingPlayerId
        + ')';
  }
}
