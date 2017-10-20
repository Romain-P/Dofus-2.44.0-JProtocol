// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayGroupMonsterInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 160;
  // flag,_loc2_,0
  public boolean keyRingBonus;
  // flag,_loc2_,1
  public boolean hasHardcoreDrop;
  // flag,_loc2_,2
  public boolean hasAVARewardToken;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
      staticInfos;
  // f64
  public double creationTime;
  // i32
  public int ageBonusRate;
  // i8
  public byte lootShare;
  // i8
  public byte alignmentSide;

  public GameRolePlayGroupMonsterInformations() {}

  public GameRolePlayGroupMonsterInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      boolean keyRingBonus,
      boolean hasHardcoreDrop,
      boolean hasAVARewardToken,
      com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
          staticInfos,
      double creationTime,
      int ageBonusRate,
      byte lootShare,
      byte alignmentSide) {

    super(contextualId, look, disposition);
    this.keyRingBonus = keyRingBonus;
    this.hasHardcoreDrop = hasHardcoreDrop;
    this.hasAVARewardToken = hasAVARewardToken;
    this.staticInfos = staticInfos;
    this.creationTime = creationTime;
    this.ageBonusRate = ageBonusRate;
    this.lootShare = lootShare;
    this.alignmentSide = alignmentSide;
  }

  @Override
  public int getProtocolId() {
    return 160;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.keyRingBonus, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasHardcoreDrop, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasAVARewardToken, 2);
    writer.write_i8(_loc2_);
    writer.write_ui16(this.staticInfos.getProtocolId());
    this.staticInfos.serialize(writer);
    writer.write_f64(this.creationTime);
    writer.write_i32(this.ageBonusRate);
    writer.write_i8(this.lootShare);
    writer.write_i8(this.alignmentSide);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.keyRingBonus = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.hasHardcoreDrop = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.hasAVARewardToken = BooleanByteWrapper.getFlag(_loc2_, 2);

    int staticInfos_typeId = reader.read_ui16();
    this.staticInfos =
        (com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations)
            InternalProtocolTypeManager.get(staticInfos_typeId);
    this.staticInfos.deserialize(reader);
    this.creationTime = reader.read_f64();
    this.ageBonusRate = reader.read_i32();
    this.lootShare = reader.read_i8();
    this.alignmentSide = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameRolePlayGroupMonsterInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", keyRingBonus="
        + this.keyRingBonus
        + ", hasHardcoreDrop="
        + this.hasHardcoreDrop
        + ", hasAVARewardToken="
        + this.hasAVARewardToken
        + ", staticInfos="
        + this.staticInfos
        + ", creationTime="
        + this.creationTime
        + ", ageBonusRate="
        + this.ageBonusRate
        + ", lootShare="
        + this.lootShare
        + ", alignmentSide="
        + this.alignmentSide
        + ')';
  }
}
