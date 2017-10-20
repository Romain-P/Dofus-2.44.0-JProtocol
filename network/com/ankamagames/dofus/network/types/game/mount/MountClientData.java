// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountClientData extends NetworkType {
  public static final int PROTOCOL_ID = 178;
  // flag,_loc2_,0
  public boolean sex;
  // flag,_loc2_,1
  public boolean isRideable;
  // flag,_loc2_,2
  public boolean isWild;
  // flag,_loc2_,3
  public boolean isFecondationReady;
  // flag,_loc2_,4
  public boolean useHarnessColors;
  // f64
  public double id;
  // vi32
  public int model;
  // array,i32
  public int[] ancestor;
  // array,i32
  public int[] behaviors;
  // str
  public java.lang.String name;
  // i32
  public int ownerId;
  // vi64
  public long experience;
  // vi64
  public long experienceForLevel;
  // f64
  public double experienceForNextLevel;
  // i8
  public byte level;
  // vi32
  public int maxPods;
  // vi32
  public int stamina;
  // vi32
  public int staminaMax;
  // vi32
  public int maturity;
  // vi32
  public int maturityForAdult;
  // vi32
  public int energy;
  // vi32
  public int energyMax;
  // i32
  public int serenity;
  // i32
  public int aggressivityMax;
  // vi32
  public int serenityMax;
  // vi32
  public int love;
  // vi32
  public int loveMax;
  // i32
  public int fecondationTime;
  // i32
  public int boostLimiter;
  // f64
  public double boostMax;
  // i32
  public int reproductionCount;
  // vi32
  public int reproductionCountMax;
  // vi16
  public short harnessGID;
  // array,com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger
  public com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger[]
      effectList;

  public MountClientData() {}

  public MountClientData(
      boolean sex,
      boolean isRideable,
      boolean isWild,
      boolean isFecondationReady,
      boolean useHarnessColors,
      double id,
      int model,
      int[] ancestor,
      int[] behaviors,
      java.lang.String name,
      int ownerId,
      long experience,
      long experienceForLevel,
      double experienceForNextLevel,
      byte level,
      int maxPods,
      int stamina,
      int staminaMax,
      int maturity,
      int maturityForAdult,
      int energy,
      int energyMax,
      int serenity,
      int aggressivityMax,
      int serenityMax,
      int love,
      int loveMax,
      int fecondationTime,
      int boostLimiter,
      double boostMax,
      int reproductionCount,
      int reproductionCountMax,
      short harnessGID,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger[]
          effectList) {
    this.sex = sex;
    this.isRideable = isRideable;
    this.isWild = isWild;
    this.isFecondationReady = isFecondationReady;
    this.useHarnessColors = useHarnessColors;
    this.id = id;
    this.model = model;
    this.ancestor = ancestor;
    this.behaviors = behaviors;
    this.name = name;
    this.ownerId = ownerId;
    this.experience = experience;
    this.experienceForLevel = experienceForLevel;
    this.experienceForNextLevel = experienceForNextLevel;
    this.level = level;
    this.maxPods = maxPods;
    this.stamina = stamina;
    this.staminaMax = staminaMax;
    this.maturity = maturity;
    this.maturityForAdult = maturityForAdult;
    this.energy = energy;
    this.energyMax = energyMax;
    this.serenity = serenity;
    this.aggressivityMax = aggressivityMax;
    this.serenityMax = serenityMax;
    this.love = love;
    this.loveMax = loveMax;
    this.fecondationTime = fecondationTime;
    this.boostLimiter = boostLimiter;
    this.boostMax = boostMax;
    this.reproductionCount = reproductionCount;
    this.reproductionCountMax = reproductionCountMax;
    this.harnessGID = harnessGID;
    this.effectList = effectList;
  }

  public MountClientData(
      boolean sex,
      boolean isRideable,
      boolean isWild,
      boolean isFecondationReady,
      boolean useHarnessColors,
      double id,
      int model,
      int[] ancestor,
      int[] behaviors,
      java.lang.String name,
      int ownerId,
      long experience,
      long experienceForLevel,
      double experienceForNextLevel,
      byte level,
      int maxPods,
      int stamina,
      int staminaMax,
      int maturity,
      int maturityForAdult,
      int energy,
      int energyMax,
      int serenity,
      int aggressivityMax,
      int serenityMax,
      int love,
      int loveMax,
      int fecondationTime,
      int boostLimiter,
      double boostMax,
      int reproductionCount,
      int reproductionCountMax,
      short harnessGID,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger>
          effectList) {
    this.sex = sex;
    this.isRideable = isRideable;
    this.isWild = isWild;
    this.isFecondationReady = isFecondationReady;
    this.useHarnessColors = useHarnessColors;
    this.id = id;
    this.model = model;
    this.ancestor = ancestor;
    this.behaviors = behaviors;
    this.name = name;
    this.ownerId = ownerId;
    this.experience = experience;
    this.experienceForLevel = experienceForLevel;
    this.experienceForNextLevel = experienceForNextLevel;
    this.level = level;
    this.maxPods = maxPods;
    this.stamina = stamina;
    this.staminaMax = staminaMax;
    this.maturity = maturity;
    this.maturityForAdult = maturityForAdult;
    this.energy = energy;
    this.energyMax = energyMax;
    this.serenity = serenity;
    this.aggressivityMax = aggressivityMax;
    this.serenityMax = serenityMax;
    this.love = love;
    this.loveMax = loveMax;
    this.fecondationTime = fecondationTime;
    this.boostLimiter = boostLimiter;
    this.boostMax = boostMax;
    this.reproductionCount = reproductionCount;
    this.reproductionCountMax = reproductionCountMax;
    this.harnessGID = harnessGID;
    this.effectList =
        effectList.toArray(
            com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger[]::new);
  }

  @Override
  public int getProtocolId() {
    return 178;
  }

  @Override
  public void serialize(DataWriter writer) {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.sex, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isRideable, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isWild, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isFecondationReady, 3);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.useHarnessColors, 4);
    writer.write_i8(_loc2_);
    writer.write_f64(this.id);
    writer.write_vi32(this.model);
    writer.write_ui16(ancestor.length);
    writer.write_array_i32(this.ancestor);
    writer.write_ui16(behaviors.length);
    writer.write_array_i32(this.behaviors);
    writer.write_str(this.name);
    writer.write_i32(this.ownerId);
    writer.write_vi64(this.experience);
    writer.write_vi64(this.experienceForLevel);
    writer.write_f64(this.experienceForNextLevel);
    writer.write_i8(this.level);
    writer.write_vi32(this.maxPods);
    writer.write_vi32(this.stamina);
    writer.write_vi32(this.staminaMax);
    writer.write_vi32(this.maturity);
    writer.write_vi32(this.maturityForAdult);
    writer.write_vi32(this.energy);
    writer.write_vi32(this.energyMax);
    writer.write_i32(this.serenity);
    writer.write_i32(this.aggressivityMax);
    writer.write_vi32(this.serenityMax);
    writer.write_vi32(this.love);
    writer.write_vi32(this.loveMax);
    writer.write_i32(this.fecondationTime);
    writer.write_i32(this.boostLimiter);
    writer.write_f64(this.boostMax);
    writer.write_i32(this.reproductionCount);
    writer.write_vi32(this.reproductionCountMax);
    writer.write_vi16(this.harnessGID);
    writer.write_ui16(effectList.length);

    for (int i = 0; i < effectList.length; i++) {

      effectList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int _loc2_ = reader.read_i8();
    this.sex = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.isRideable = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.isWild = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.isFecondationReady = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.useHarnessColors = BooleanByteWrapper.getFlag(_loc2_, 4);
    this.id = reader.read_f64();
    this.model = reader.read_vi32();

    int ancestor_length = reader.read_ui16();
    this.ancestor = reader.read_array_i32(ancestor_length);

    int behaviors_length = reader.read_ui16();
    this.behaviors = reader.read_array_i32(behaviors_length);
    this.name = reader.read_str();
    this.ownerId = reader.read_i32();
    this.experience = reader.read_vi64();
    this.experienceForLevel = reader.read_vi64();
    this.experienceForNextLevel = reader.read_f64();
    this.level = reader.read_i8();
    this.maxPods = reader.read_vi32();
    this.stamina = reader.read_vi32();
    this.staminaMax = reader.read_vi32();
    this.maturity = reader.read_vi32();
    this.maturityForAdult = reader.read_vi32();
    this.energy = reader.read_vi32();
    this.energyMax = reader.read_vi32();
    this.serenity = reader.read_i32();
    this.aggressivityMax = reader.read_i32();
    this.serenityMax = reader.read_vi32();
    this.love = reader.read_vi32();
    this.loveMax = reader.read_vi32();
    this.fecondationTime = reader.read_i32();
    this.boostLimiter = reader.read_i32();
    this.boostMax = reader.read_f64();
    this.reproductionCount = reader.read_i32();
    this.reproductionCountMax = reader.read_vi32();
    this.harnessGID = reader.read_vi16();

    int effectList_length = reader.read_ui16();
    this.effectList =
        new com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger
            [effectList_length];

    for (int i = 0; i < effectList_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger
          effectList_it =
              new com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectInteger();

      effectList_it.deserialize(reader);
      this.effectList[i] = effectList_it;
    }
  }

  @Override
  public String toString() {

    return "MountClientData("
        + "sex="
        + this.sex
        + ", isRideable="
        + this.isRideable
        + ", isWild="
        + this.isWild
        + ", isFecondationReady="
        + this.isFecondationReady
        + ", useHarnessColors="
        + this.useHarnessColors
        + ", id="
        + this.id
        + ", model="
        + this.model
        + ", ancestor="
        + java.util.Arrays.toString(this.ancestor)
        + ", behaviors="
        + java.util.Arrays.toString(this.behaviors)
        + ", name="
        + this.name
        + ", ownerId="
        + this.ownerId
        + ", experience="
        + this.experience
        + ", experienceForLevel="
        + this.experienceForLevel
        + ", experienceForNextLevel="
        + this.experienceForNextLevel
        + ", level="
        + this.level
        + ", maxPods="
        + this.maxPods
        + ", stamina="
        + this.stamina
        + ", staminaMax="
        + this.staminaMax
        + ", maturity="
        + this.maturity
        + ", maturityForAdult="
        + this.maturityForAdult
        + ", energy="
        + this.energy
        + ", energyMax="
        + this.energyMax
        + ", serenity="
        + this.serenity
        + ", aggressivityMax="
        + this.aggressivityMax
        + ", serenityMax="
        + this.serenityMax
        + ", love="
        + this.love
        + ", loveMax="
        + this.loveMax
        + ", fecondationTime="
        + this.fecondationTime
        + ", boostLimiter="
        + this.boostLimiter
        + ", boostMax="
        + this.boostMax
        + ", reproductionCount="
        + this.reproductionCount
        + ", reproductionCountMax="
        + this.reproductionCountMax
        + ", harnessGID="
        + this.harnessGID
        + ", effectList="
        + java.util.Arrays.toString(this.effectList)
        + ')';
  }
}
