// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyJoinMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5576;
  // i8
  public byte partyType;
  // vi64
  public long partyLeaderId;
  // i8
  public byte maxParticipants;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations[]
      members;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
      guests;
  // bool
  public boolean restricted;
  // str
  public java.lang.String partyName;

  public PartyJoinMessage() {}

  public PartyJoinMessage(
      int partyId,
      byte partyType,
      long partyLeaderId,
      byte maxParticipants,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations[]
          members,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
          guests,
      boolean restricted,
      java.lang.String partyName) {

    super(partyId);
    this.partyType = partyType;
    this.partyLeaderId = partyLeaderId;
    this.maxParticipants = maxParticipants;
    this.members = members;
    this.guests = guests;
    this.restricted = restricted;
    this.partyName = partyName;
  }

  public PartyJoinMessage(
      int partyId,
      byte partyType,
      long partyLeaderId,
      byte maxParticipants,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyMemberInformations>
          members,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .PartyGuestInformations>
          guests,
      boolean restricted,
      java.lang.String partyName) {

    super(partyId);
    this.partyType = partyType;
    this.partyLeaderId = partyLeaderId;
    this.maxParticipants = maxParticipants;
    this.members =
        members.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
                    []
                ::new);
    this.guests =
        guests.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyGuestInformations[]
                ::new);
    this.restricted = restricted;
    this.partyName = partyName;
  }

  @Override
  public int getProtocolId() {
    return 5576;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.partyType);
    writer.write_vi64(this.partyLeaderId);
    writer.write_i8(this.maxParticipants);
    writer.write_ui16(members.length);

    for (int i = 0; i < members.length; i++) {

      writer.write_ui16(members[i].getProtocolId());

      members[i].serialize(writer);
    }
    writer.write_ui16(guests.length);

    for (int i = 0; i < guests.length; i++) {

      guests[i].serialize(writer);
    }
    writer.write_bool(this.restricted);
    writer.write_str(this.partyName);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.partyType = reader.read_i8();
    this.partyLeaderId = reader.read_vi64();
    this.maxParticipants = reader.read_i8();

    int members_length = reader.read_ui16();
    this.members =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
            [members_length];

    for (int i = 0; i < members_length; i++) {

      int members_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.party.PartyMemberInformations
          members_it =
              (com.ankamagames.dofus.network.types.game.context.roleplay.party
                      .PartyMemberInformations)
                  InternalProtocolTypeManager.get(members_it_typeId);

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
    this.restricted = reader.read_bool();
    this.partyName = reader.read_str();
  }

  @Override
  public String toString() {

    return "PartyJoinMessage("
        + "partyId="
        + this.partyId
        + ", partyType="
        + this.partyType
        + ", partyLeaderId="
        + this.partyLeaderId
        + ", maxParticipants="
        + this.maxParticipants
        + ", members="
        + java.util.Arrays.toString(this.members)
        + ", guests="
        + java.util.Arrays.toString(this.guests)
        + ", restricted="
        + this.restricted
        + ", partyName="
        + this.partyName
        + ')';
  }
}
