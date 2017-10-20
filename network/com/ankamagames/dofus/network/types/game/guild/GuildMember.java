// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMember
    extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations {
  public static final int PROTOCOL_ID = 88;
  // flag,_loc2_,0
  public boolean sex;
  // flag,_loc2_,1
  public boolean havenBagShared;
  // i8
  public byte breed;
  // vi16
  public short rank;
  // vi64
  public long givenExperience;
  // i8
  public byte experienceGivenPercent;
  // vi32
  public int rights;
  // i8
  public byte connected;
  // i8
  public byte alignmentSide;
  // ui16
  public int hoursSinceLastConnection;
  // vi16
  public short moodSmileyId;
  // i32
  public int accountId;
  // i32
  public int achievementPoints;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;

  public GuildMember() {}

  public GuildMember(
      long id,
      java.lang.String name,
      short level,
      boolean sex,
      boolean havenBagShared,
      byte breed,
      short rank,
      long givenExperience,
      byte experienceGivenPercent,
      int rights,
      byte connected,
      byte alignmentSide,
      int hoursSinceLastConnection,
      short moodSmileyId,
      int accountId,
      int achievementPoints,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status) {

    super(id, name, level);
    this.sex = sex;
    this.havenBagShared = havenBagShared;
    this.breed = breed;
    this.rank = rank;
    this.givenExperience = givenExperience;
    this.experienceGivenPercent = experienceGivenPercent;
    this.rights = rights;
    this.connected = connected;
    this.alignmentSide = alignmentSide;
    this.hoursSinceLastConnection = hoursSinceLastConnection;
    this.moodSmileyId = moodSmileyId;
    this.accountId = accountId;
    this.achievementPoints = achievementPoints;
    this.status = status;
  }

  @Override
  public int getProtocolId() {
    return 88;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.sex, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.havenBagShared, 1);
    writer.write_i8(_loc2_);
    writer.write_i8(this.breed);
    writer.write_vi16(this.rank);
    writer.write_vi64(this.givenExperience);
    writer.write_i8(this.experienceGivenPercent);
    writer.write_vi32(this.rights);
    writer.write_i8(this.connected);
    writer.write_i8(this.alignmentSide);
    writer.write_ui16(this.hoursSinceLastConnection);
    writer.write_vi16(this.moodSmileyId);
    writer.write_i32(this.accountId);
    writer.write_i32(this.achievementPoints);
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.sex = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.havenBagShared = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.breed = reader.read_i8();
    this.rank = reader.read_vi16();
    this.givenExperience = reader.read_vi64();
    this.experienceGivenPercent = reader.read_i8();
    this.rights = reader.read_vi32();
    this.connected = reader.read_i8();
    this.alignmentSide = reader.read_i8();
    this.hoursSinceLastConnection = reader.read_ui16();
    this.moodSmileyId = reader.read_vi16();
    this.accountId = reader.read_i32();
    this.achievementPoints = reader.read_i32();

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GuildMember("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", sex="
        + this.sex
        + ", havenBagShared="
        + this.havenBagShared
        + ", breed="
        + this.breed
        + ", rank="
        + this.rank
        + ", givenExperience="
        + this.givenExperience
        + ", experienceGivenPercent="
        + this.experienceGivenPercent
        + ", rights="
        + this.rights
        + ", connected="
        + this.connected
        + ", alignmentSide="
        + this.alignmentSide
        + ", hoursSinceLastConnection="
        + this.hoursSinceLastConnection
        + ", moodSmileyId="
        + this.moodSmileyId
        + ", accountId="
        + this.accountId
        + ", achievementPoints="
        + this.achievementPoints
        + ", status="
        + this.status
        + ')';
  }
}
