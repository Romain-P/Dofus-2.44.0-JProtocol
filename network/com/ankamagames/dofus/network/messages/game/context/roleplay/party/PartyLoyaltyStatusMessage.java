// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyLoyaltyStatusMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6270;
  // bool
  public boolean loyal;

  public PartyLoyaltyStatusMessage() {}

  public PartyLoyaltyStatusMessage(int partyId, boolean loyal) {

    super(partyId);
    this.loyal = loyal;
  }

  @Override
  public int getProtocolId() {
    return 6270;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_bool(this.loyal);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.loyal = reader.read_bool();
  }

  @Override
  public String toString() {

    return "PartyLoyaltyStatusMessage(" + "partyId=" + this.partyId + ", loyal=" + this.loyal + ')';
  }
}
