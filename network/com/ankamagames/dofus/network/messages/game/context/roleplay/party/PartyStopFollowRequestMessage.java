// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyStopFollowRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5574;
  // vi64
  public long playerId;

  public PartyStopFollowRequestMessage() {}

  public PartyStopFollowRequestMessage(int partyId, long playerId) {

    super(partyId);
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId() {
    return 5574;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PartyStopFollowRequestMessage("
        + "partyId="
        + this.partyId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
