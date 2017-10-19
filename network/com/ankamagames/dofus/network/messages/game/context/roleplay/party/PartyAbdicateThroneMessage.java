// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyAbdicateThroneMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6080;
  // ui64
  public java.math.BigInteger playerId;

  public PartyAbdicateThroneMessage()
  {}

  public PartyAbdicateThroneMessage(int partyId, java.math.BigInteger playerId)
  {

    super(partyId);
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6080;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyAbdicateThroneMessage("
        + "partyId="
        + this.partyId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
