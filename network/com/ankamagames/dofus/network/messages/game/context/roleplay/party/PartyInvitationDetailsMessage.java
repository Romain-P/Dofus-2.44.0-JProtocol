// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationDetailsMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6263;
  // i8
  public byte partyType;
  // str
  public java.lang.String partyName;
  // vi64
  public long fromId;
  // str
  public java.lang.String fromName;
  // vi64
  public long leaderId;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyInvitationMemberInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party
          .PartyInvitationMemberInformations[]
      members;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
      guests;

  public PartyInvitationDetailsMessage() {}

  public PartyInvitationDetailsMessage(
      int partyId,
      byte partyType,
      java.lang.String partyName,
      long fromId,
      java.lang.String fromName,
      long leaderId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyInvitationMemberInformations
              []
          members,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
          guests) {

    super(partyId);
    this.partyType = partyType;
    this.partyName = partyName;
    this.fromId = fromId;
    this.fromName = fromName;
    this.leaderId = leaderId;
    this.members = members;
    this.guests = guests;
  }

  public PartyInvitationDetailsMessage(
      int partyId,
      byte partyType,
      java.lang.String partyName,
      long fromId,
      java.lang.String fromName,
      long leaderId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyInvitationMemberInformations>
          members,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyGuestInformations>
          guests) {

    super(partyId);
    this.partyType = partyType;
    this.partyName = partyName;
    this.fromId = fromId;
    this.fromName = fromName;
    this.leaderId = leaderId;
    this.members =
        members.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party
                        .PartyInvitationMemberInformations
                    []
                ::new);
    this.guests =
        guests.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6263;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.partyType);
    writer.write_str(this.partyName);
    writer.write_vi64(this.fromId);
    writer.write_str(this.fromName);
    writer.write_vi64(this.leaderId);
    writer.write_ui16(members.length);

    for (int i = 0; i < members.length; i++) {

      members[i].serialize(writer);
    }
    writer.write_ui16(guests.length);

    for (int i = 0; i < guests.length; i++) {

      guests[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.partyType = reader.read_i8();
    this.partyName = reader.read_str();
    this.fromId = reader.read_vi64();
    this.fromName = reader.read_str();
    this.leaderId = reader.read_vi64();

    int members_length = reader.read_ui16();
    this.members =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party
                .PartyInvitationMemberInformations[members_length];

    for (int i = 0; i < members_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party
              .PartyInvitationMemberInformations
          members_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyInvitationMemberInformations();

      members_it.deserialize(reader);
      this.members[i] = members_it;
    }

    int guests_length = reader.read_ui16();
    this.guests =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
            [guests_length];

    for (int i = 0; i < guests_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
          guests_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyGuestInformations();

      guests_it.deserialize(reader);
      this.guests[i] = guests_it;
    }
  }

  @Override
  public String toString() {

    return "PartyInvitationDetailsMessage("
        + "partyId="
        + this.partyId
        + ", partyType="
        + this.partyType
        + ", partyName="
        + this.partyName
        + ", fromId="
        + this.fromId
        + ", fromName="
        + this.fromName
        + ", leaderId="
        + this.leaderId
        + ", members="
        + java.util.Arrays.toString(this.members)
        + ", guests="
        + java.util.Arrays.toString(this.guests)
        + ')';
  }
}
