// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendSpouseOnlineInformations
    extends com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations {
  public static final int PROTOCOL_ID = 93;
  // flag,_loc2_,0
  public boolean inFight;
  // flag,_loc2_,1
  public boolean followSpouse;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;

  public FriendSpouseOnlineInformations() {}

  public FriendSpouseOnlineInformations(
      int spouseAccountId,
      long spouseId,
      java.lang.String spouseName,
      short spouseLevel,
      byte breed,
      byte sex,
      com.ankamagames.dofus.network.types.game.look.EntityLook spouseEntityLook,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo,
      byte alignmentSide,
      boolean inFight,
      boolean followSpouse,
      double mapId,
      short subAreaId) {

    super(
        spouseAccountId,
        spouseId,
        spouseName,
        spouseLevel,
        breed,
        sex,
        spouseEntityLook,
        guildInfo,
        alignmentSide);
    this.inFight = inFight;
    this.followSpouse = followSpouse;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
  }

  @Override
  public int getProtocolId() {
    return 93;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.inFight, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.followSpouse, 1);
    writer.write_i8(_loc2_);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.inFight = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.followSpouse = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "FriendSpouseOnlineInformations("
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
        + ", inFight="
        + this.inFight
        + ", followSpouse="
        + this.followSpouse
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ')';
  }
}
