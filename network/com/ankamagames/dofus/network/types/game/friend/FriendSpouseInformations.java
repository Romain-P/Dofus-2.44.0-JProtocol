// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendSpouseInformations extends NetworkType {
  public static final int PROTOCOL_ID = 77;
  // i32
  public int spouseAccountId;
  // ui64
  public java.math.BigInteger spouseId;
  // str
  public java.lang.String spouseName;
  // ui8
  public short spouseLevel;
  // i8
  public byte breed;
  // i8
  public byte sex;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook spouseEntityLook;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
  // i8
  public byte alignmentSide;

  public FriendSpouseInformations()
  {}

  public FriendSpouseInformations(
      int spouseAccountId,
      java.math.BigInteger spouseId,
      java.lang.String spouseName,
      short spouseLevel,
      byte breed,
      byte sex,
      com.ankamagames.dofus.network.types.game.look.EntityLook spouseEntityLook,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo,
      byte alignmentSide)
  {
    this.spouseAccountId = spouseAccountId;
    this.spouseId = spouseId;
    this.spouseName = spouseName;
    this.spouseLevel = spouseLevel;
    this.breed = breed;
    this.sex = sex;
    this.spouseEntityLook = spouseEntityLook;
    this.guildInfo = guildInfo;
    this.alignmentSide = alignmentSide;
  }

  @Override
  public int getProtocolId()
  {
    return 77;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.spouseAccountId);
    writer.write_ui64(this.spouseId);
    writer.write_str(this.spouseName);
    writer.write_ui8(this.spouseLevel);
    writer.write_i8(this.breed);
    writer.write_i8(this.sex);
    this.spouseEntityLook.serialize(writer);
    this.guildInfo.serialize(writer);
    writer.write_i8(this.alignmentSide);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.spouseAccountId = reader.read_i32();
    this.spouseId = reader.read_ui64();
    this.spouseName = reader.read_str();
    this.spouseLevel = reader.read_ui8();
    this.breed = reader.read_i8();
    this.sex = reader.read_i8();
    this.spouseEntityLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.spouseEntityLook.deserialize(reader);
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildInfo.deserialize(reader);
    this.alignmentSide = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "FriendSpouseInformations("
        + "spouseAccountId="
        + this.spouseAccountId
        + ", spouseId="
        + this.spouseId
        + ", spouseName="
        + this.spouseName
        + ", spouseLevel="
        + this.spouseLevel
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", spouseEntityLook="
        + this.spouseEntityLook
        + ", guildInfo="
        + this.guildInfo
        + ", alignmentSide="
        + this.alignmentSide
        + ')';
  }
}
