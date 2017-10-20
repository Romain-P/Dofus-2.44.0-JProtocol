// Created by Heat the 2017-10-20 01:53:25+02:00
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
  // vi64
  public long leavingPlayerId;

  public PartyMemberRemoveMessage() {}

  public PartyMemberRemoveMessage(int partyId, long leavingPlayerId) {

    super(partyId);
    this.leavingPlayerId = leavingPlayerId;
  }

  @Override
  public int getProtocolId() {
    return 5579;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.leavingPlayerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.leavingPlayerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PartyMemberRemoveMessage("
        + "partyId="
        + this.partyId
        + ", leavingPlayerId="
        + this.leavingPlayerId
        + ')';
  }
}
