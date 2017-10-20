// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyLocateMembersMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5595;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition[]
      geopositions;

  public PartyLocateMembersMessage() {}

  public PartyLocateMembersMessage(
      int partyId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition[]
          geopositions) {

    super(partyId);
    this.geopositions = geopositions;
  }

  public PartyLocateMembersMessage(
      int partyId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyMemberGeoPosition>
          geopositions) {

    super(partyId);
    this.geopositions =
        geopositions.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5595;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(geopositions.length);

    for (int i = 0; i < geopositions.length; i++) {

      geopositions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int geopositions_length = reader.read_ui16();
    this.geopositions =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition
            [geopositions_length];

    for (int i = 0; i < geopositions_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberGeoPosition
          geopositions_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyMemberGeoPosition();

      geopositions_it.deserialize(reader);
      this.geopositions[i] = geopositions_it;
    }
  }

  @Override
  public String toString() {

    return "PartyLocateMembersMessage("
        + "partyId="
        + this.partyId
        + ", geopositions="
        + java.util.Arrays.toString(this.geopositions)
        + ')';
  }
}
