// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyKickedByMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5590;
  // vi64
  public long kickerId;

  public PartyKickedByMessage() {}

  public PartyKickedByMessage(int partyId, long kickerId) {

    super(partyId);
    this.kickerId = kickerId;
  }

  @Override
  public int getProtocolId() {
    return 5590;
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

    return "PartyKickedByMessage("
        + "partyId="
        + this.partyId
        + ", kickerId="
        + this.kickerId
        + ')';
  }
}
