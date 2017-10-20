// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultExperienceData
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData {
  public static final int PROTOCOL_ID = 192;
  // flag,_loc2_,0
  public boolean showExperience;
  // flag,_loc2_,1
  public boolean showExperienceLevelFloor;
  // flag,_loc2_,2
  public boolean showExperienceNextLevelFloor;
  // flag,_loc2_,3
  public boolean showExperienceFightDelta;
  // flag,_loc2_,4
  public boolean showExperienceForGuild;
  // flag,_loc2_,5
  public boolean showExperienceForMount;
  // flag,_loc2_,6
  public boolean isIncarnationExperience;
  // vi64
  public long experience;
  // vi64
  public long experienceLevelFloor;
  // vi64
  public long experienceNextLevelFloor;
  // vi64
  public long experienceFightDelta;
  // vi64
  public long experienceForGuild;
  // vi64
  public long experienceForMount;
  // i8
  public byte rerollExperienceMul;

  public FightResultExperienceData() {}

  public FightResultExperienceData(
      boolean showExperience,
      boolean showExperienceLevelFloor,
      boolean showExperienceNextLevelFloor,
      boolean showExperienceFightDelta,
      boolean showExperienceForGuild,
      boolean showExperienceForMount,
      boolean isIncarnationExperience,
      long experience,
      long experienceLevelFloor,
      long experienceNextLevelFloor,
      long experienceFightDelta,
      long experienceForGuild,
      long experienceForMount,
      byte rerollExperienceMul) {

    super();
    this.showExperience = showExperience;
    this.showExperienceLevelFloor = showExperienceLevelFloor;
    this.showExperienceNextLevelFloor = showExperienceNextLevelFloor;
    this.showExperienceFightDelta = showExperienceFightDelta;
    this.showExperienceForGuild = showExperienceForGuild;
    this.showExperienceForMount = showExperienceForMount;
    this.isIncarnationExperience = isIncarnationExperience;
    this.experience = experience;
    this.experienceLevelFloor = experienceLevelFloor;
    this.experienceNextLevelFloor = experienceNextLevelFloor;
    this.experienceFightDelta = experienceFightDelta;
    this.experienceForGuild = experienceForGuild;
    this.experienceForMount = experienceForMount;
    this.rerollExperienceMul = rerollExperienceMul;
  }

  @Override
  public int getProtocolId() {
    return 192;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperience, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperienceLevelFloor, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperienceNextLevelFloor, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperienceFightDelta, 3);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperienceForGuild, 4);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.showExperienceForMount, 5);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isIncarnationExperience, 6);
    writer.write_i8(_loc2_);
    writer.write_vi64(this.experience);
    writer.write_vi64(this.experienceLevelFloor);
    writer.write_vi64(this.experienceNextLevelFloor);
    writer.write_vi64(this.experienceFightDelta);
    writer.write_vi64(this.experienceForGuild);
    writer.write_vi64(this.experienceForMount);
    writer.write_i8(this.rerollExperienceMul);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.showExperience = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.showExperienceLevelFloor = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.showExperienceNextLevelFloor = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.showExperienceFightDelta = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.showExperienceForGuild = BooleanByteWrapper.getFlag(_loc2_, 4);
    this.showExperienceForMount = BooleanByteWrapper.getFlag(_loc2_, 5);
    this.isIncarnationExperience = BooleanByteWrapper.getFlag(_loc2_, 6);
    this.experience = reader.read_vi64();
    this.experienceLevelFloor = reader.read_vi64();
    this.experienceNextLevelFloor = reader.read_vi64();
    this.experienceFightDelta = reader.read_vi64();
    this.experienceForGuild = reader.read_vi64();
    this.experienceForMount = reader.read_vi64();
    this.rerollExperienceMul = reader.read_i8();
  }

  @Override
  public String toString() {

    return "FightResultExperienceData("
        + "showExperience="
        + this.showExperience
        + ", showExperienceLevelFloor="
        + this.showExperienceLevelFloor
        + ", showExperienceNextLevelFloor="
        + this.showExperienceNextLevelFloor
        + ", showExperienceFightDelta="
        + this.showExperienceFightDelta
        + ", showExperienceForGuild="
        + this.showExperienceForGuild
        + ", showExperienceForMount="
        + this.showExperienceForMount
        + ", isIncarnationExperience="
        + this.isIncarnationExperience
        + ", experience="
        + this.experience
        + ", experienceLevelFloor="
        + this.experienceLevelFloor
        + ", experienceNextLevelFloor="
        + this.experienceNextLevelFloor
        + ", experienceFightDelta="
        + this.experienceFightDelta
        + ", experienceForGuild="
        + this.experienceForGuild
        + ", experienceForMount="
        + this.experienceForMount
        + ", rerollExperienceMul="
        + this.rerollExperienceMul
        + ')';
  }
}
