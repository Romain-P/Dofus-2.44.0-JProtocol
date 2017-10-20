// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyFollowThisMemberRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyFollowMemberRequestMessage {
  public static final int PROTOCOL_ID = 5588;
  // bool
  public boolean enabled;

  public PartyFollowThisMemberRequestMessage() {}

  public PartyFollowThisMemberRequestMessage(int partyId, long playerId, boolean enabled) {

    super(partyId, playerId);
    this.enabled = enabled;
  }

  @Override
  public int getProtocolId() {
    return 5588;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_bool(this.enabled);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.enabled = reader.read_bool();
  }

  @Override
  public String toString() {

    return "PartyFollowThisMemberRequestMessage("
        + "partyId="
        + this.partyId
        + ", playerId="
        + this.playerId
        + ", enabled="
        + this.enabled
        + ')';
  }
}
