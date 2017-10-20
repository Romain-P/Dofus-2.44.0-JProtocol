// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyModifiableStatusMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6277;
  // bool
  public boolean enabled;

  public PartyModifiableStatusMessage() {}

  public PartyModifiableStatusMessage(int partyId, boolean enabled) {

    super(partyId);
    this.enabled = enabled;
  }

  @Override
  public int getProtocolId() {
    return 6277;
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

    return "PartyModifiableStatusMessage("
        + "partyId="
        + this.partyId
        + ", enabled="
        + this.enabled
        + ')';
  }
}
