// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyNameSetErrorMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6501;
  // i8
  public byte result;

  public PartyNameSetErrorMessage() {}

  public PartyNameSetErrorMessage(int partyId, byte result) {

    super(partyId);
    this.result = result;
  }

  @Override
  public int getProtocolId() {
    return 6501;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.result);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.result = reader.read_i8();
  }

  @Override
  public String toString() {

    return "PartyNameSetErrorMessage("
        + "partyId="
        + this.partyId
        + ", result="
        + this.result
        + ')';
  }
}
