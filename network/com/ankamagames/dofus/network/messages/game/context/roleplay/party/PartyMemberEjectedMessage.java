// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberEjectedMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyMemberRemoveMessage {
  public static final int PROTOCOL_ID = 6252;
  // vi64
  public long kickerId;

  public PartyMemberEjectedMessage() {}

  public PartyMemberEjectedMessage(int partyId, long leavingPlayerId, long kickerId) {

    super(partyId, leavingPlayerId);
    this.kickerId = kickerId;
  }

  @Override
  public int getProtocolId() {
    return 6252;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.kickerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.kickerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PartyMemberEjectedMessage("
        + "partyId="
        + this.partyId
        + ", leavingPlayerId="
        + this.leavingPlayerId
        + ", kickerId="
        + this.kickerId
        + ')';
  }
}
