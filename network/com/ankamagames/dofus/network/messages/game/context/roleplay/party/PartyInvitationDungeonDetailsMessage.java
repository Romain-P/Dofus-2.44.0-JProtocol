// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationDungeonDetailsMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyInvitationDetailsMessage {
  public static final int PROTOCOL_ID = 6262;
  // vi16
  public short dungeonId;
  // array,bool
  public boolean[] playersDungeonReady;

  public PartyInvitationDungeonDetailsMessage() {}

  public PartyInvitationDungeonDetailsMessage(
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
          guests,
      short dungeonId,
      boolean[] playersDungeonReady) {

    super(partyId, partyType, partyName, fromId, fromName, leaderId, members, guests);
    this.dungeonId = dungeonId;
    this.playersDungeonReady = playersDungeonReady;
  }

  public PartyInvitationDungeonDetailsMessage(
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
          guests,
      short dungeonId,
      boolean[] playersDungeonReady) {

    super(partyId, partyType, partyName, fromId, fromName, leaderId, members, guests);
    this.dungeonId = dungeonId;
    this.playersDungeonReady = playersDungeonReady;
  }

  @Override
  public int getProtocolId() {
    return 6262;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.dungeonId);
    writer.write_ui16(playersDungeonReady.length);
    writer.write_array_bool(this.playersDungeonReady);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.dungeonId = reader.read_vi16();

    int playersDungeonReady_length = reader.read_ui16();
    this.playersDungeonReady = reader.read_array_bool(playersDungeonReady_length);
  }

  @Override
  public String toString() {

    return "PartyInvitationDungeonDetailsMessage("
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
        + ", dungeonId="
        + this.dungeonId
        + ", playersDungeonReady="
        + java.util.Arrays.toString(this.playersDungeonReady)
        + ')';
  }
}
