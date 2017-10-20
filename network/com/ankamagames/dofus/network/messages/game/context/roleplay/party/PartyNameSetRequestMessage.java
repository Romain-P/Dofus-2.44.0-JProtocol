// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyNameSetRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6503;
  // str
  public java.lang.String partyName;

  public PartyNameSetRequestMessage() {}

  public PartyNameSetRequestMessage(int partyId, java.lang.String partyName) {

    super(partyId);
    this.partyName = partyName;
  }

  @Override
  public int getProtocolId() {
    return 6503;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.partyName);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.partyName = reader.read_str();
  }

  @Override
  public String toString() {

    return "PartyNameSetRequestMessage("
        + "partyId="
        + this.partyId
        + ", partyName="
        + this.partyName
        + ')';
  }
}
