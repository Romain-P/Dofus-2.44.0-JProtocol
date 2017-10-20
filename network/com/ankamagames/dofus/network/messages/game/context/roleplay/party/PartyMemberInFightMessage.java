// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberInFightMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 6342;
  // i8
  public byte reason;
  // vi64
  public long memberId;
  // i32
  public int memberAccountId;
  // str
  public java.lang.String memberName;
  // i32
  public int fightId;
  // com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended
  public com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended fightMap;
  // vi16
  public short timeBeforeFightStart;

  public PartyMemberInFightMessage() {}

  public PartyMemberInFightMessage(
      int partyId,
      byte reason,
      long memberId,
      int memberAccountId,
      java.lang.String memberName,
      int fightId,
      com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended fightMap,
      short timeBeforeFightStart) {

    super(partyId);
    this.reason = reason;
    this.memberId = memberId;
    this.memberAccountId = memberAccountId;
    this.memberName = memberName;
    this.fightId = fightId;
    this.fightMap = fightMap;
    this.timeBeforeFightStart = timeBeforeFightStart;
  }

  @Override
  public int getProtocolId() {
    return 6342;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.reason);
    writer.write_vi64(this.memberId);
    writer.write_i32(this.memberAccountId);
    writer.write_str(this.memberName);
    writer.write_i32(this.fightId);
    this.fightMap.serialize(writer);
    writer.write_vi16(this.timeBeforeFightStart);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.reason = reader.read_i8();
    this.memberId = reader.read_vi64();
    this.memberAccountId = reader.read_i32();
    this.memberName = reader.read_str();
    this.fightId = reader.read_i32();
    this.fightMap = new com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended();
    this.fightMap.deserialize(reader);
    this.timeBeforeFightStart = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "PartyMemberInFightMessage("
        + "partyId="
        + this.partyId
        + ", reason="
        + this.reason
        + ", memberId="
        + this.memberId
        + ", memberAccountId="
        + this.memberAccountId
        + ", memberName="
        + this.memberName
        + ", fightId="
        + this.fightId
        + ", fightMap="
        + this.fightMap
        + ", timeBeforeFightStart="
        + this.timeBeforeFightStart
        + ')';
  }
}
