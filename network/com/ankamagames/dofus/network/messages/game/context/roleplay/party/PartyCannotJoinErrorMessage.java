// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCannotJoinErrorMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5583;
  // i8
  public byte reason;

  public PartyCannotJoinErrorMessage()
  {}

  public PartyCannotJoinErrorMessage(int partyId, byte reason)
  {

    super(partyId);
    this.reason = reason;
  }

  @Override
  public int getProtocolId()
  {
    return 5583;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.reason = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "PartyCannotJoinErrorMessage("
        + "partyId="
        + this.partyId
        + ", reason="
        + this.reason
        + ')';
  }
}
