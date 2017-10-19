// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5586;
  // i8
  public byte partyType;
  // str
  public java.lang.String partyName;
  // i8
  public byte maxParticipants;
  // ui64
  public java.math.BigInteger fromId;
  // str
  public java.lang.String fromName;
  // ui64
  public java.math.BigInteger toId;

  public PartyInvitationMessage()
  {}

  public PartyInvitationMessage(
      int partyId,
      byte partyType,
      java.lang.String partyName,
      byte maxParticipants,
      java.math.BigInteger fromId,
      java.lang.String fromName,
      java.math.BigInteger toId)
  {

    super(partyId);
    this.partyType = partyType;
    this.partyName = partyName;
    this.maxParticipants = maxParticipants;
    this.fromId = fromId;
    this.fromName = fromName;
    this.toId = toId;
  }

  @Override
  public int getProtocolId()
  {
    return 5586;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.partyType);
    writer.write_str(this.partyName);
    writer.write_i8(this.maxParticipants);
    writer.write_ui64(this.fromId);
    writer.write_str(this.fromName);
    writer.write_ui64(this.toId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.partyType = reader.read_i8();
    this.partyName = reader.read_str();
    this.maxParticipants = reader.read_i8();
    this.fromId = reader.read_ui64();
    this.fromName = reader.read_str();
    this.toId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyInvitationMessage("
        + "partyId="
        + this.partyId
        + ", partyType="
        + this.partyType
        + ", partyName="
        + this.partyName
        + ", maxParticipants="
        + this.maxParticipants
        + ", fromId="
        + this.fromId
        + ", fromName="
        + this.fromName
        + ", toId="
        + this.toId
        + ')';
  }
}
