// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationArenaRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyInvitationRequestMessage {
  public static final int PROTOCOL_ID = 6283;

  public PartyInvitationArenaRequestMessage() {}

  public PartyInvitationArenaRequestMessage(java.lang.String name) {

    super(name);
  }

  @Override
  public int getProtocolId() {
    return 6283;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "PartyInvitationArenaRequestMessage(" + "name=" + this.name + ')';
  }
}
