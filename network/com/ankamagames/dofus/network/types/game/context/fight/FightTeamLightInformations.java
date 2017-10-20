// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamLightInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.AbstractFightTeamInformations {
  public static final int PROTOCOL_ID = 115;
  // flag,_loc2_,0
  public boolean hasFriend;
  // flag,_loc2_,1
  public boolean hasGuildMember;
  // flag,_loc2_,2
  public boolean hasAllianceMember;
  // flag,_loc2_,3
  public boolean hasGroupMember;
  // flag,_loc2_,4
  public boolean hasMyTaxCollector;
  // i8
  public byte teamMembersCount;
  // vi32
  public int meanLevel;

  public FightTeamLightInformations() {}

  public FightTeamLightInformations(
      byte teamId,
      double leaderId,
      byte teamSide,
      byte teamTypeId,
      byte nbWaves,
      boolean hasFriend,
      boolean hasGuildMember,
      boolean hasAllianceMember,
      boolean hasGroupMember,
      boolean hasMyTaxCollector,
      byte teamMembersCount,
      int meanLevel) {

    super(teamId, leaderId, teamSide, teamTypeId, nbWaves);
    this.hasFriend = hasFriend;
    this.hasGuildMember = hasGuildMember;
    this.hasAllianceMember = hasAllianceMember;
    this.hasGroupMember = hasGroupMember;
    this.hasMyTaxCollector = hasMyTaxCollector;
    this.teamMembersCount = teamMembersCount;
    this.meanLevel = meanLevel;
  }

  @Override
  public int getProtocolId() {
    return 115;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasFriend, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasGuildMember, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasAllianceMember, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasGroupMember, 3);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasMyTaxCollector, 4);
    writer.write_i8(_loc2_);
    writer.write_i8(this.teamMembersCount);
    writer.write_vi32(this.meanLevel);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.hasFriend = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.hasGuildMember = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.hasAllianceMember = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.hasGroupMember = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.hasMyTaxCollector = BooleanByteWrapper.getFlag(_loc2_, 4);
    this.teamMembersCount = reader.read_i8();
    this.meanLevel = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "FightTeamLightInformations("
        + "teamId="
        + this.teamId
        + ", leaderId="
        + this.leaderId
        + ", teamSide="
        + this.teamSide
        + ", teamTypeId="
        + this.teamTypeId
        + ", nbWaves="
        + this.nbWaves
        + ", hasFriend="
        + this.hasFriend
        + ", hasGuildMember="
        + this.hasGuildMember
        + ", hasAllianceMember="
        + this.hasAllianceMember
        + ", hasGroupMember="
        + this.hasGroupMember
        + ", hasMyTaxCollector="
        + this.hasMyTaxCollector
        + ", teamMembersCount="
        + this.teamMembersCount
        + ", meanLevel="
        + this.meanLevel
        + ')';
  }
}
