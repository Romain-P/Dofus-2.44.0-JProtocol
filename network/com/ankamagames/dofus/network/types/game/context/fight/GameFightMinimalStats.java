// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightMinimalStats extends NetworkType {
  public static final int PROTOCOL_ID = 31;
  // vi32
  public int lifePoints;
  // vi32
  public int maxLifePoints;
  // vi32
  public int baseMaxLifePoints;
  // vi32
  public int permanentDamagePercent;
  // vi32
  public int shieldPoints;
  // vi16
  public short actionPoints;
  // vi16
  public short maxActionPoints;
  // vi16
  public short movementPoints;
  // vi16
  public short maxMovementPoints;
  // f64
  public double summoner;
  // bool
  public boolean summoned;
  // vi16
  public short neutralElementResistPercent;
  // vi16
  public short earthElementResistPercent;
  // vi16
  public short waterElementResistPercent;
  // vi16
  public short airElementResistPercent;
  // vi16
  public short fireElementResistPercent;
  // vi16
  public short neutralElementReduction;
  // vi16
  public short earthElementReduction;
  // vi16
  public short waterElementReduction;
  // vi16
  public short airElementReduction;
  // vi16
  public short fireElementReduction;
  // vi16
  public short criticalDamageFixedResist;
  // vi16
  public short pushDamageFixedResist;
  // vi16
  public short pvpNeutralElementResistPercent;
  // vi16
  public short pvpEarthElementResistPercent;
  // vi16
  public short pvpWaterElementResistPercent;
  // vi16
  public short pvpAirElementResistPercent;
  // vi16
  public short pvpFireElementResistPercent;
  // vi16
  public short pvpNeutralElementReduction;
  // vi16
  public short pvpEarthElementReduction;
  // vi16
  public short pvpWaterElementReduction;
  // vi16
  public short pvpAirElementReduction;
  // vi16
  public short pvpFireElementReduction;
  // vi16
  public short dodgePALostProbability;
  // vi16
  public short dodgePMLostProbability;
  // vi16
  public short tackleBlock;
  // vi16
  public short tackleEvade;
  // vi16
  public short fixedDamageReflection;
  // i8
  public byte invisibilityState;
  // vi16
  public short meleeDamageReceivedPercent;
  // vi16
  public short rangedDamageReceivedPercent;
  // vi16
  public short weaponDamageReceivedPercent;
  // vi16
  public short spellDamageReceivedPercent;

  public GameFightMinimalStats()
  {}

  public GameFightMinimalStats(
      int lifePoints,
      int maxLifePoints,
      int baseMaxLifePoints,
      int permanentDamagePercent,
      int shieldPoints,
      short actionPoints,
      short maxActionPoints,
      short movementPoints,
      short maxMovementPoints,
      double summoner,
      boolean summoned,
      short neutralElementResistPercent,
      short earthElementResistPercent,
      short waterElementResistPercent,
      short airElementResistPercent,
      short fireElementResistPercent,
      short neutralElementReduction,
      short earthElementReduction,
      short waterElementReduction,
      short airElementReduction,
      short fireElementReduction,
      short criticalDamageFixedResist,
      short pushDamageFixedResist,
      short pvpNeutralElementResistPercent,
      short pvpEarthElementResistPercent,
      short pvpWaterElementResistPercent,
      short pvpAirElementResistPercent,
      short pvpFireElementResistPercent,
      short pvpNeutralElementReduction,
      short pvpEarthElementReduction,
      short pvpWaterElementReduction,
      short pvpAirElementReduction,
      short pvpFireElementReduction,
      short dodgePALostProbability,
      short dodgePMLostProbability,
      short tackleBlock,
      short tackleEvade,
      short fixedDamageReflection,
      byte invisibilityState,
      short meleeDamageReceivedPercent,
      short rangedDamageReceivedPercent,
      short weaponDamageReceivedPercent,
      short spellDamageReceivedPercent)
  {
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.baseMaxLifePoints = baseMaxLifePoints;
    this.permanentDamagePercent = permanentDamagePercent;
    this.shieldPoints = shieldPoints;
    this.actionPoints = actionPoints;
    this.maxActionPoints = maxActionPoints;
    this.movementPoints = movementPoints;
    this.maxMovementPoints = maxMovementPoints;
    this.summoner = summoner;
    this.summoned = summoned;
    this.neutralElementResistPercent = neutralElementResistPercent;
    this.earthElementResistPercent = earthElementResistPercent;
    this.waterElementResistPercent = waterElementResistPercent;
    this.airElementResistPercent = airElementResistPercent;
    this.fireElementResistPercent = fireElementResistPercent;
    this.neutralElementReduction = neutralElementReduction;
    this.earthElementReduction = earthElementReduction;
    this.waterElementReduction = waterElementReduction;
    this.airElementReduction = airElementReduction;
    this.fireElementReduction = fireElementReduction;
    this.criticalDamageFixedResist = criticalDamageFixedResist;
    this.pushDamageFixedResist = pushDamageFixedResist;
    this.pvpNeutralElementResistPercent = pvpNeutralElementResistPercent;
    this.pvpEarthElementResistPercent = pvpEarthElementResistPercent;
    this.pvpWaterElementResistPercent = pvpWaterElementResistPercent;
    this.pvpAirElementResistPercent = pvpAirElementResistPercent;
    this.pvpFireElementResistPercent = pvpFireElementResistPercent;
    this.pvpNeutralElementReduction = pvpNeutralElementReduction;
    this.pvpEarthElementReduction = pvpEarthElementReduction;
    this.pvpWaterElementReduction = pvpWaterElementReduction;
    this.pvpAirElementReduction = pvpAirElementReduction;
    this.pvpFireElementReduction = pvpFireElementReduction;
    this.dodgePALostProbability = dodgePALostProbability;
    this.dodgePMLostProbability = dodgePMLostProbability;
    this.tackleBlock = tackleBlock;
    this.tackleEvade = tackleEvade;
    this.fixedDamageReflection = fixedDamageReflection;
    this.invisibilityState = invisibilityState;
    this.meleeDamageReceivedPercent = meleeDamageReceivedPercent;
    this.rangedDamageReceivedPercent = rangedDamageReceivedPercent;
    this.weaponDamageReceivedPercent = weaponDamageReceivedPercent;
    this.spellDamageReceivedPercent = spellDamageReceivedPercent;
  }

  @Override
  public int getProtocolId()
  {
    return 31;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.lifePoints);
    writer.write_vi32(this.maxLifePoints);
    writer.write_vi32(this.baseMaxLifePoints);
    writer.write_vi32(this.permanentDamagePercent);
    writer.write_vi32(this.shieldPoints);
    writer.write_vi16(this.actionPoints);
    writer.write_vi16(this.maxActionPoints);
    writer.write_vi16(this.movementPoints);
    writer.write_vi16(this.maxMovementPoints);
    writer.write_f64(this.summoner);
    writer.write_bool(this.summoned);
    writer.write_vi16(this.neutralElementResistPercent);
    writer.write_vi16(this.earthElementResistPercent);
    writer.write_vi16(this.waterElementResistPercent);
    writer.write_vi16(this.airElementResistPercent);
    writer.write_vi16(this.fireElementResistPercent);
    writer.write_vi16(this.neutralElementReduction);
    writer.write_vi16(this.earthElementReduction);
    writer.write_vi16(this.waterElementReduction);
    writer.write_vi16(this.airElementReduction);
    writer.write_vi16(this.fireElementReduction);
    writer.write_vi16(this.criticalDamageFixedResist);
    writer.write_vi16(this.pushDamageFixedResist);
    writer.write_vi16(this.pvpNeutralElementResistPercent);
    writer.write_vi16(this.pvpEarthElementResistPercent);
    writer.write_vi16(this.pvpWaterElementResistPercent);
    writer.write_vi16(this.pvpAirElementResistPercent);
    writer.write_vi16(this.pvpFireElementResistPercent);
    writer.write_vi16(this.pvpNeutralElementReduction);
    writer.write_vi16(this.pvpEarthElementReduction);
    writer.write_vi16(this.pvpWaterElementReduction);
    writer.write_vi16(this.pvpAirElementReduction);
    writer.write_vi16(this.pvpFireElementReduction);
    writer.write_vi16(this.dodgePALostProbability);
    writer.write_vi16(this.dodgePMLostProbability);
    writer.write_vi16(this.tackleBlock);
    writer.write_vi16(this.tackleEvade);
    writer.write_vi16(this.fixedDamageReflection);
    writer.write_i8(this.invisibilityState);
    writer.write_vi16(this.meleeDamageReceivedPercent);
    writer.write_vi16(this.rangedDamageReceivedPercent);
    writer.write_vi16(this.weaponDamageReceivedPercent);
    writer.write_vi16(this.spellDamageReceivedPercent);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.lifePoints = reader.read_vi32();
    this.maxLifePoints = reader.read_vi32();
    this.baseMaxLifePoints = reader.read_vi32();
    this.permanentDamagePercent = reader.read_vi32();
    this.shieldPoints = reader.read_vi32();
    this.actionPoints = reader.read_vi16();
    this.maxActionPoints = reader.read_vi16();
    this.movementPoints = reader.read_vi16();
    this.maxMovementPoints = reader.read_vi16();
    this.summoner = reader.read_f64();
    this.summoned = reader.read_bool();
    this.neutralElementResistPercent = reader.read_vi16();
    this.earthElementResistPercent = reader.read_vi16();
    this.waterElementResistPercent = reader.read_vi16();
    this.airElementResistPercent = reader.read_vi16();
    this.fireElementResistPercent = reader.read_vi16();
    this.neutralElementReduction = reader.read_vi16();
    this.earthElementReduction = reader.read_vi16();
    this.waterElementReduction = reader.read_vi16();
    this.airElementReduction = reader.read_vi16();
    this.fireElementReduction = reader.read_vi16();
    this.criticalDamageFixedResist = reader.read_vi16();
    this.pushDamageFixedResist = reader.read_vi16();
    this.pvpNeutralElementResistPercent = reader.read_vi16();
    this.pvpEarthElementResistPercent = reader.read_vi16();
    this.pvpWaterElementResistPercent = reader.read_vi16();
    this.pvpAirElementResistPercent = reader.read_vi16();
    this.pvpFireElementResistPercent = reader.read_vi16();
    this.pvpNeutralElementReduction = reader.read_vi16();
    this.pvpEarthElementReduction = reader.read_vi16();
    this.pvpWaterElementReduction = reader.read_vi16();
    this.pvpAirElementReduction = reader.read_vi16();
    this.pvpFireElementReduction = reader.read_vi16();
    this.dodgePALostProbability = reader.read_vi16();
    this.dodgePMLostProbability = reader.read_vi16();
    this.tackleBlock = reader.read_vi16();
    this.tackleEvade = reader.read_vi16();
    this.fixedDamageReflection = reader.read_vi16();
    this.invisibilityState = reader.read_i8();
    this.meleeDamageReceivedPercent = reader.read_vi16();
    this.rangedDamageReceivedPercent = reader.read_vi16();
    this.weaponDamageReceivedPercent = reader.read_vi16();
    this.spellDamageReceivedPercent = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameFightMinimalStats("
        + "lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", baseMaxLifePoints="
        + this.baseMaxLifePoints
        + ", permanentDamagePercent="
        + this.permanentDamagePercent
        + ", shieldPoints="
        + this.shieldPoints
        + ", actionPoints="
        + this.actionPoints
        + ", maxActionPoints="
        + this.maxActionPoints
        + ", movementPoints="
        + this.movementPoints
        + ", maxMovementPoints="
        + this.maxMovementPoints
        + ", summoner="
        + this.summoner
        + ", summoned="
        + this.summoned
        + ", neutralElementResistPercent="
        + this.neutralElementResistPercent
        + ", earthElementResistPercent="
        + this.earthElementResistPercent
        + ", waterElementResistPercent="
        + this.waterElementResistPercent
        + ", airElementResistPercent="
        + this.airElementResistPercent
        + ", fireElementResistPercent="
        + this.fireElementResistPercent
        + ", neutralElementReduction="
        + this.neutralElementReduction
        + ", earthElementReduction="
        + this.earthElementReduction
        + ", waterElementReduction="
        + this.waterElementReduction
        + ", airElementReduction="
        + this.airElementReduction
        + ", fireElementReduction="
        + this.fireElementReduction
        + ", criticalDamageFixedResist="
        + this.criticalDamageFixedResist
        + ", pushDamageFixedResist="
        + this.pushDamageFixedResist
        + ", pvpNeutralElementResistPercent="
        + this.pvpNeutralElementResistPercent
        + ", pvpEarthElementResistPercent="
        + this.pvpEarthElementResistPercent
        + ", pvpWaterElementResistPercent="
        + this.pvpWaterElementResistPercent
        + ", pvpAirElementResistPercent="
        + this.pvpAirElementResistPercent
        + ", pvpFireElementResistPercent="
        + this.pvpFireElementResistPercent
        + ", pvpNeutralElementReduction="
        + this.pvpNeutralElementReduction
        + ", pvpEarthElementReduction="
        + this.pvpEarthElementReduction
        + ", pvpWaterElementReduction="
        + this.pvpWaterElementReduction
        + ", pvpAirElementReduction="
        + this.pvpAirElementReduction
        + ", pvpFireElementReduction="
        + this.pvpFireElementReduction
        + ", dodgePALostProbability="
        + this.dodgePALostProbability
        + ", dodgePMLostProbability="
        + this.dodgePMLostProbability
        + ", tackleBlock="
        + this.tackleBlock
        + ", tackleEvade="
        + this.tackleEvade
        + ", fixedDamageReflection="
        + this.fixedDamageReflection
        + ", invisibilityState="
        + this.invisibilityState
        + ", meleeDamageReceivedPercent="
        + this.meleeDamageReceivedPercent
        + ", rangedDamageReceivedPercent="
        + this.rangedDamageReceivedPercent
        + ", weaponDamageReceivedPercent="
        + this.weaponDamageReceivedPercent
        + ", spellDamageReceivedPercent="
        + this.spellDamageReceivedPercent
        + ')';
  }
}
