// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyUpdateMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyEventMessage {
  public static final int PROTOCOL_ID = 5575;
  // com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
      memberInformations;

  public PartyUpdateMessage() {}

  public PartyUpdateMessage(
      int partyId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
          memberInformations) {

    super(partyId);
    this.memberInformations = memberInformations;
  }

  @Override
  public int getProtocolId() {
    return 5575;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.memberInformations.getProtocolId());
    this.memberInformations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int memberInformations_typeId = reader.read_ui16();
    this.memberInformations =
        (com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations)
            InternalProtocolTypeManager.get(memberInformations_typeId);
    this.memberInformations.deserialize(reader);
  }

  @Override
  public String toString() {

    return "PartyUpdateMessage("
        + "partyId="
        + this.partyId
        + ", memberInformations="
        + this.memberInformations
        + ')';
  }
}
