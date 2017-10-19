// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.characteristic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterCharacteristicsInformations extends NetworkType {
  public static final int PROTOCOL_ID = 8;
  // ui64
  public java.math.BigInteger experience;
  // ui64
  public java.math.BigInteger experienceLevelFloor;
  // ui64
  public java.math.BigInteger experienceNextLevelFloor;
  // ui64
  public java.math.BigInteger experienceBonusLimit;
  // ui64
  public java.math.BigInteger kamas;
  // vi16
  public short statsPoints;
  // vi16
  public short additionnalPoints;
  // vi16
  public short spellsPoints;
  // com.ankamagames.dofus.network.types.game.character.alignment.ActorExtendedAlignmentInformations
  public com.ankamagames.dofus.network.types.game.character.alignment
          .ActorExtendedAlignmentInformations
      alignmentInfos;
  // vi32
  public int lifePoints;
  // vi32
  public int maxLifePoints;
  // vi16
  public short energyPoints;
  // vi16
  public short maxEnergyPoints;
  // vi16
  public short actionPointsCurrent;
  // vi16
  public short movementPointsCurrent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      initiative;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      prospecting;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      actionPoints;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      movementPoints;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      strength;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      vitality;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      wisdom;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      chance;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      agility;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      intelligence;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      range;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      summonableCreaturesBoost;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      reflect;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      criticalHit;
  // vi16
  public short criticalHitWeapon;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      criticalMiss;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      healBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      allDamagesBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      weaponDamagesBonusPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      damagesBonusPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      trapBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      trapBonusPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      glyphBonusPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      runeBonusPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      permanentDamagePercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      tackleBlock;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      tackleEvade;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      PAAttack;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      PMAttack;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pushDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      criticalDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      neutralDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      earthDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      waterDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      airDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      fireDamageBonus;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      dodgePALostProbability;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      dodgePMLostProbability;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      neutralElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      earthElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      waterElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      airElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      fireElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      neutralElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      earthElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      waterElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      airElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      fireElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pushDamageReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      criticalDamageReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpNeutralElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpEarthElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpWaterElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpAirElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpFireElementResistPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpNeutralElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpEarthElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpWaterElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpAirElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      pvpFireElementReduction;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      meleeDamageDonePercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      meleeDamageReceivedPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      rangedDamageDonePercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      rangedDamageReceivedPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      weaponDamageDonePercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      weaponDamageReceivedPercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      spellDamageDonePercent;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      spellDamageReceivedPercent;
  // array,com.ankamagames.dofus.network.types.game.character.characteristic.CharacterSpellModification
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterSpellModification[]
      spellModifications;
  // i32
  public int probationTime;

  public CharacterCharacteristicsInformations()
  {}

  public CharacterCharacteristicsInformations(
      java.math.BigInteger experience,
      java.math.BigInteger experienceLevelFloor,
      java.math.BigInteger experienceNextLevelFloor,
      java.math.BigInteger experienceBonusLimit,
      java.math.BigInteger kamas,
      short statsPoints,
      short additionnalPoints,
      short spellsPoints,
      com.ankamagames.dofus.network.types.game.character.alignment
              .ActorExtendedAlignmentInformations
          alignmentInfos,
      int lifePoints,
      int maxLifePoints,
      short energyPoints,
      short maxEnergyPoints,
      short actionPointsCurrent,
      short movementPointsCurrent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          initiative,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          prospecting,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          actionPoints,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          movementPoints,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          strength,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          vitality,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          wisdom,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          chance,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          agility,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          intelligence,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          range,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          summonableCreaturesBoost,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          reflect,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalHit,
      short criticalHitWeapon,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalMiss,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          healBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          allDamagesBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamagesBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          damagesBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          trapBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          trapBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          glyphBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          runeBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          permanentDamagePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          tackleBlock,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          tackleEvade,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          PAAttack,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          PMAttack,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pushDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          dodgePALostProbability,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          dodgePMLostProbability,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pushDamageReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalDamageReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpNeutralElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpEarthElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpWaterElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpAirElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpFireElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpNeutralElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpEarthElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpWaterElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpAirElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpFireElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          meleeDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          meleeDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          rangedDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          rangedDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          spellDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          spellDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterSpellModification[]
          spellModifications,
      int probationTime)
  {
    this.experience = experience;
    this.experienceLevelFloor = experienceLevelFloor;
    this.experienceNextLevelFloor = experienceNextLevelFloor;
    this.experienceBonusLimit = experienceBonusLimit;
    this.kamas = kamas;
    this.statsPoints = statsPoints;
    this.additionnalPoints = additionnalPoints;
    this.spellsPoints = spellsPoints;
    this.alignmentInfos = alignmentInfos;
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.energyPoints = energyPoints;
    this.maxEnergyPoints = maxEnergyPoints;
    this.actionPointsCurrent = actionPointsCurrent;
    this.movementPointsCurrent = movementPointsCurrent;
    this.initiative = initiative;
    this.prospecting = prospecting;
    this.actionPoints = actionPoints;
    this.movementPoints = movementPoints;
    this.strength = strength;
    this.vitality = vitality;
    this.wisdom = wisdom;
    this.chance = chance;
    this.agility = agility;
    this.intelligence = intelligence;
    this.range = range;
    this.summonableCreaturesBoost = summonableCreaturesBoost;
    this.reflect = reflect;
    this.criticalHit = criticalHit;
    this.criticalHitWeapon = criticalHitWeapon;
    this.criticalMiss = criticalMiss;
    this.healBonus = healBonus;
    this.allDamagesBonus = allDamagesBonus;
    this.weaponDamagesBonusPercent = weaponDamagesBonusPercent;
    this.damagesBonusPercent = damagesBonusPercent;
    this.trapBonus = trapBonus;
    this.trapBonusPercent = trapBonusPercent;
    this.glyphBonusPercent = glyphBonusPercent;
    this.runeBonusPercent = runeBonusPercent;
    this.permanentDamagePercent = permanentDamagePercent;
    this.tackleBlock = tackleBlock;
    this.tackleEvade = tackleEvade;
    this.PAAttack = PAAttack;
    this.PMAttack = PMAttack;
    this.pushDamageBonus = pushDamageBonus;
    this.criticalDamageBonus = criticalDamageBonus;
    this.neutralDamageBonus = neutralDamageBonus;
    this.earthDamageBonus = earthDamageBonus;
    this.waterDamageBonus = waterDamageBonus;
    this.airDamageBonus = airDamageBonus;
    this.fireDamageBonus = fireDamageBonus;
    this.dodgePALostProbability = dodgePALostProbability;
    this.dodgePMLostProbability = dodgePMLostProbability;
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
    this.pushDamageReduction = pushDamageReduction;
    this.criticalDamageReduction = criticalDamageReduction;
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
    this.meleeDamageDonePercent = meleeDamageDonePercent;
    this.meleeDamageReceivedPercent = meleeDamageReceivedPercent;
    this.rangedDamageDonePercent = rangedDamageDonePercent;
    this.rangedDamageReceivedPercent = rangedDamageReceivedPercent;
    this.weaponDamageDonePercent = weaponDamageDonePercent;
    this.weaponDamageReceivedPercent = weaponDamageReceivedPercent;
    this.spellDamageDonePercent = spellDamageDonePercent;
    this.spellDamageReceivedPercent = spellDamageReceivedPercent;
    this.spellModifications = spellModifications;
    this.probationTime = probationTime;
  }

  public CharacterCharacteristicsInformations(
      java.math.BigInteger experience,
      java.math.BigInteger experienceLevelFloor,
      java.math.BigInteger experienceNextLevelFloor,
      java.math.BigInteger experienceBonusLimit,
      java.math.BigInteger kamas,
      short statsPoints,
      short additionnalPoints,
      short spellsPoints,
      com.ankamagames.dofus.network.types.game.character.alignment
              .ActorExtendedAlignmentInformations
          alignmentInfos,
      int lifePoints,
      int maxLifePoints,
      short energyPoints,
      short maxEnergyPoints,
      short actionPointsCurrent,
      short movementPointsCurrent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          initiative,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          prospecting,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          actionPoints,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          movementPoints,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          strength,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          vitality,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          wisdom,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          chance,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          agility,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          intelligence,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          range,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          summonableCreaturesBoost,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          reflect,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalHit,
      short criticalHitWeapon,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalMiss,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          healBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          allDamagesBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamagesBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          damagesBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          trapBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          trapBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          glyphBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          runeBonusPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          permanentDamagePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          tackleBlock,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          tackleEvade,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          PAAttack,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          PMAttack,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pushDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireDamageBonus,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          dodgePALostProbability,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          dodgePMLostProbability,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          neutralElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          earthElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          waterElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          airElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          fireElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pushDamageReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          criticalDamageReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpNeutralElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpEarthElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpWaterElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpAirElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpFireElementResistPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpNeutralElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpEarthElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpWaterElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpAirElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          pvpFireElementReduction,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          meleeDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          meleeDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          rangedDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          rangedDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          weaponDamageReceivedPercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          spellDamageDonePercent,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          spellDamageReceivedPercent,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.characteristic
                  .CharacterSpellModification>
          spellModifications,
      int probationTime)
  {
    this.experience = experience;
    this.experienceLevelFloor = experienceLevelFloor;
    this.experienceNextLevelFloor = experienceNextLevelFloor;
    this.experienceBonusLimit = experienceBonusLimit;
    this.kamas = kamas;
    this.statsPoints = statsPoints;
    this.additionnalPoints = additionnalPoints;
    this.spellsPoints = spellsPoints;
    this.alignmentInfos = alignmentInfos;
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.energyPoints = energyPoints;
    this.maxEnergyPoints = maxEnergyPoints;
    this.actionPointsCurrent = actionPointsCurrent;
    this.movementPointsCurrent = movementPointsCurrent;
    this.initiative = initiative;
    this.prospecting = prospecting;
    this.actionPoints = actionPoints;
    this.movementPoints = movementPoints;
    this.strength = strength;
    this.vitality = vitality;
    this.wisdom = wisdom;
    this.chance = chance;
    this.agility = agility;
    this.intelligence = intelligence;
    this.range = range;
    this.summonableCreaturesBoost = summonableCreaturesBoost;
    this.reflect = reflect;
    this.criticalHit = criticalHit;
    this.criticalHitWeapon = criticalHitWeapon;
    this.criticalMiss = criticalMiss;
    this.healBonus = healBonus;
    this.allDamagesBonus = allDamagesBonus;
    this.weaponDamagesBonusPercent = weaponDamagesBonusPercent;
    this.damagesBonusPercent = damagesBonusPercent;
    this.trapBonus = trapBonus;
    this.trapBonusPercent = trapBonusPercent;
    this.glyphBonusPercent = glyphBonusPercent;
    this.runeBonusPercent = runeBonusPercent;
    this.permanentDamagePercent = permanentDamagePercent;
    this.tackleBlock = tackleBlock;
    this.tackleEvade = tackleEvade;
    this.PAAttack = PAAttack;
    this.PMAttack = PMAttack;
    this.pushDamageBonus = pushDamageBonus;
    this.criticalDamageBonus = criticalDamageBonus;
    this.neutralDamageBonus = neutralDamageBonus;
    this.earthDamageBonus = earthDamageBonus;
    this.waterDamageBonus = waterDamageBonus;
    this.airDamageBonus = airDamageBonus;
    this.fireDamageBonus = fireDamageBonus;
    this.dodgePALostProbability = dodgePALostProbability;
    this.dodgePMLostProbability = dodgePMLostProbability;
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
    this.pushDamageReduction = pushDamageReduction;
    this.criticalDamageReduction = criticalDamageReduction;
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
    this.meleeDamageDonePercent = meleeDamageDonePercent;
    this.meleeDamageReceivedPercent = meleeDamageReceivedPercent;
    this.rangedDamageDonePercent = rangedDamageDonePercent;
    this.rangedDamageReceivedPercent = rangedDamageReceivedPercent;
    this.weaponDamageDonePercent = weaponDamageDonePercent;
    this.weaponDamageReceivedPercent = weaponDamageReceivedPercent;
    this.spellDamageDonePercent = spellDamageDonePercent;
    this.spellDamageReceivedPercent = spellDamageReceivedPercent;
    this.spellModifications =
        spellModifications.toArray(
            com.ankamagames.dofus.network.types.game.character.characteristic
                        .CharacterSpellModification
                    []
                ::new);
    this.probationTime = probationTime;
  }

  @Override
  public int getProtocolId()
  {
    return 8;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.experience);
    writer.write_ui64(this.experienceLevelFloor);
    writer.write_ui64(this.experienceNextLevelFloor);
    writer.write_ui64(this.experienceBonusLimit);
    writer.write_ui64(this.kamas);
    writer.write_vi16(this.statsPoints);
    writer.write_vi16(this.additionnalPoints);
    writer.write_vi16(this.spellsPoints);
    this.alignmentInfos.serialize(writer);
    writer.write_vi32(this.lifePoints);
    writer.write_vi32(this.maxLifePoints);
    writer.write_vi16(this.energyPoints);
    writer.write_vi16(this.maxEnergyPoints);
    writer.write_vi16(this.actionPointsCurrent);
    writer.write_vi16(this.movementPointsCurrent);
    this.initiative.serialize(writer);
    this.prospecting.serialize(writer);
    this.actionPoints.serialize(writer);
    this.movementPoints.serialize(writer);
    this.strength.serialize(writer);
    this.vitality.serialize(writer);
    this.wisdom.serialize(writer);
    this.chance.serialize(writer);
    this.agility.serialize(writer);
    this.intelligence.serialize(writer);
    this.range.serialize(writer);
    this.summonableCreaturesBoost.serialize(writer);
    this.reflect.serialize(writer);
    this.criticalHit.serialize(writer);
    writer.write_vi16(this.criticalHitWeapon);
    this.criticalMiss.serialize(writer);
    this.healBonus.serialize(writer);
    this.allDamagesBonus.serialize(writer);
    this.weaponDamagesBonusPercent.serialize(writer);
    this.damagesBonusPercent.serialize(writer);
    this.trapBonus.serialize(writer);
    this.trapBonusPercent.serialize(writer);
    this.glyphBonusPercent.serialize(writer);
    this.runeBonusPercent.serialize(writer);
    this.permanentDamagePercent.serialize(writer);
    this.tackleBlock.serialize(writer);
    this.tackleEvade.serialize(writer);
    this.PAAttack.serialize(writer);
    this.PMAttack.serialize(writer);
    this.pushDamageBonus.serialize(writer);
    this.criticalDamageBonus.serialize(writer);
    this.neutralDamageBonus.serialize(writer);
    this.earthDamageBonus.serialize(writer);
    this.waterDamageBonus.serialize(writer);
    this.airDamageBonus.serialize(writer);
    this.fireDamageBonus.serialize(writer);
    this.dodgePALostProbability.serialize(writer);
    this.dodgePMLostProbability.serialize(writer);
    this.neutralElementResistPercent.serialize(writer);
    this.earthElementResistPercent.serialize(writer);
    this.waterElementResistPercent.serialize(writer);
    this.airElementResistPercent.serialize(writer);
    this.fireElementResistPercent.serialize(writer);
    this.neutralElementReduction.serialize(writer);
    this.earthElementReduction.serialize(writer);
    this.waterElementReduction.serialize(writer);
    this.airElementReduction.serialize(writer);
    this.fireElementReduction.serialize(writer);
    this.pushDamageReduction.serialize(writer);
    this.criticalDamageReduction.serialize(writer);
    this.pvpNeutralElementResistPercent.serialize(writer);
    this.pvpEarthElementResistPercent.serialize(writer);
    this.pvpWaterElementResistPercent.serialize(writer);
    this.pvpAirElementResistPercent.serialize(writer);
    this.pvpFireElementResistPercent.serialize(writer);
    this.pvpNeutralElementReduction.serialize(writer);
    this.pvpEarthElementReduction.serialize(writer);
    this.pvpWaterElementReduction.serialize(writer);
    this.pvpAirElementReduction.serialize(writer);
    this.pvpFireElementReduction.serialize(writer);
    this.meleeDamageDonePercent.serialize(writer);
    this.meleeDamageReceivedPercent.serialize(writer);
    this.rangedDamageDonePercent.serialize(writer);
    this.rangedDamageReceivedPercent.serialize(writer);
    this.weaponDamageDonePercent.serialize(writer);
    this.weaponDamageReceivedPercent.serialize(writer);
    this.spellDamageDonePercent.serialize(writer);
    this.spellDamageReceivedPercent.serialize(writer);
    writer.write_ui16(spellModifications.length);

    for (int i = 0; i < spellModifications.length; i++)
  {

      spellModifications[i].serialize(writer);
    }
    writer.write_i32(this.probationTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.experience = reader.read_ui64();
    this.experienceLevelFloor = reader.read_ui64();
    this.experienceNextLevelFloor = reader.read_ui64();
    this.experienceBonusLimit = reader.read_ui64();
    this.kamas = reader.read_ui64();
    this.statsPoints = reader.read_vi16();
    this.additionnalPoints = reader.read_vi16();
    this.spellsPoints = reader.read_vi16();
    this.alignmentInfos =
        new com.ankamagames.dofus.network.types.game.character.alignment
            .ActorExtendedAlignmentInformations();
    this.alignmentInfos.deserialize(reader);
    this.lifePoints = reader.read_vi32();
    this.maxLifePoints = reader.read_vi32();
    this.energyPoints = reader.read_vi16();
    this.maxEnergyPoints = reader.read_vi16();
    this.actionPointsCurrent = reader.read_vi16();
    this.movementPointsCurrent = reader.read_vi16();
    this.initiative =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.initiative.deserialize(reader);
    this.prospecting =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.prospecting.deserialize(reader);
    this.actionPoints =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.actionPoints.deserialize(reader);
    this.movementPoints =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.movementPoints.deserialize(reader);
    this.strength =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.strength.deserialize(reader);
    this.vitality =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.vitality.deserialize(reader);
    this.wisdom =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.wisdom.deserialize(reader);
    this.chance =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.chance.deserialize(reader);
    this.agility =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.agility.deserialize(reader);
    this.intelligence =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.intelligence.deserialize(reader);
    this.range =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.range.deserialize(reader);
    this.summonableCreaturesBoost =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.summonableCreaturesBoost.deserialize(reader);
    this.reflect =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.reflect.deserialize(reader);
    this.criticalHit =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.criticalHit.deserialize(reader);
    this.criticalHitWeapon = reader.read_vi16();
    this.criticalMiss =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.criticalMiss.deserialize(reader);
    this.healBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.healBonus.deserialize(reader);
    this.allDamagesBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.allDamagesBonus.deserialize(reader);
    this.weaponDamagesBonusPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.weaponDamagesBonusPercent.deserialize(reader);
    this.damagesBonusPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.damagesBonusPercent.deserialize(reader);
    this.trapBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.trapBonus.deserialize(reader);
    this.trapBonusPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.trapBonusPercent.deserialize(reader);
    this.glyphBonusPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.glyphBonusPercent.deserialize(reader);
    this.runeBonusPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.runeBonusPercent.deserialize(reader);
    this.permanentDamagePercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.permanentDamagePercent.deserialize(reader);
    this.tackleBlock =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.tackleBlock.deserialize(reader);
    this.tackleEvade =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.tackleEvade.deserialize(reader);
    this.PAAttack =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.PAAttack.deserialize(reader);
    this.PMAttack =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.PMAttack.deserialize(reader);
    this.pushDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pushDamageBonus.deserialize(reader);
    this.criticalDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.criticalDamageBonus.deserialize(reader);
    this.neutralDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.neutralDamageBonus.deserialize(reader);
    this.earthDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.earthDamageBonus.deserialize(reader);
    this.waterDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.waterDamageBonus.deserialize(reader);
    this.airDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.airDamageBonus.deserialize(reader);
    this.fireDamageBonus =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.fireDamageBonus.deserialize(reader);
    this.dodgePALostProbability =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.dodgePALostProbability.deserialize(reader);
    this.dodgePMLostProbability =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.dodgePMLostProbability.deserialize(reader);
    this.neutralElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.neutralElementResistPercent.deserialize(reader);
    this.earthElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.earthElementResistPercent.deserialize(reader);
    this.waterElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.waterElementResistPercent.deserialize(reader);
    this.airElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.airElementResistPercent.deserialize(reader);
    this.fireElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.fireElementResistPercent.deserialize(reader);
    this.neutralElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.neutralElementReduction.deserialize(reader);
    this.earthElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.earthElementReduction.deserialize(reader);
    this.waterElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.waterElementReduction.deserialize(reader);
    this.airElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.airElementReduction.deserialize(reader);
    this.fireElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.fireElementReduction.deserialize(reader);
    this.pushDamageReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pushDamageReduction.deserialize(reader);
    this.criticalDamageReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.criticalDamageReduction.deserialize(reader);
    this.pvpNeutralElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpNeutralElementResistPercent.deserialize(reader);
    this.pvpEarthElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpEarthElementResistPercent.deserialize(reader);
    this.pvpWaterElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpWaterElementResistPercent.deserialize(reader);
    this.pvpAirElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpAirElementResistPercent.deserialize(reader);
    this.pvpFireElementResistPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpFireElementResistPercent.deserialize(reader);
    this.pvpNeutralElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpNeutralElementReduction.deserialize(reader);
    this.pvpEarthElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpEarthElementReduction.deserialize(reader);
    this.pvpWaterElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpWaterElementReduction.deserialize(reader);
    this.pvpAirElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpAirElementReduction.deserialize(reader);
    this.pvpFireElementReduction =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.pvpFireElementReduction.deserialize(reader);
    this.meleeDamageDonePercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.meleeDamageDonePercent.deserialize(reader);
    this.meleeDamageReceivedPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.meleeDamageReceivedPercent.deserialize(reader);
    this.rangedDamageDonePercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.rangedDamageDonePercent.deserialize(reader);
    this.rangedDamageReceivedPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.rangedDamageReceivedPercent.deserialize(reader);
    this.weaponDamageDonePercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.weaponDamageDonePercent.deserialize(reader);
    this.weaponDamageReceivedPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.weaponDamageReceivedPercent.deserialize(reader);
    this.spellDamageDonePercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.spellDamageDonePercent.deserialize(reader);
    this.spellDamageReceivedPercent =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.spellDamageReceivedPercent.deserialize(reader);

    int spellModifications_length = reader.read_ui16();
    this.spellModifications =
        new com.ankamagames.dofus.network.types.game.character.characteristic
                .CharacterSpellModification[spellModifications_length];

    for (int i = 0; i < spellModifications_length; i++)
  {

      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterSpellModification
          spellModifications_it =
              new com.ankamagames.dofus.network.types.game.character.characteristic
                  .CharacterSpellModification();

      spellModifications_it.deserialize(reader);
      this.spellModifications[i] = spellModifications_it;
    }
    this.probationTime = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "CharacterCharacteristicsInformations("
        + "experience="
        + this.experience
        + ", experienceLevelFloor="
        + this.experienceLevelFloor
        + ", experienceNextLevelFloor="
        + this.experienceNextLevelFloor
        + ", experienceBonusLimit="
        + this.experienceBonusLimit
        + ", kamas="
        + this.kamas
        + ", statsPoints="
        + this.statsPoints
        + ", additionnalPoints="
        + this.additionnalPoints
        + ", spellsPoints="
        + this.spellsPoints
        + ", alignmentInfos="
        + this.alignmentInfos
        + ", lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", energyPoints="
        + this.energyPoints
        + ", maxEnergyPoints="
        + this.maxEnergyPoints
        + ", actionPointsCurrent="
        + this.actionPointsCurrent
        + ", movementPointsCurrent="
        + this.movementPointsCurrent
        + ", initiative="
        + this.initiative
        + ", prospecting="
        + this.prospecting
        + ", actionPoints="
        + this.actionPoints
        + ", movementPoints="
        + this.movementPoints
        + ", strength="
        + this.strength
        + ", vitality="
        + this.vitality
        + ", wisdom="
        + this.wisdom
        + ", chance="
        + this.chance
        + ", agility="
        + this.agility
        + ", intelligence="
        + this.intelligence
        + ", range="
        + this.range
        + ", summonableCreaturesBoost="
        + this.summonableCreaturesBoost
        + ", reflect="
        + this.reflect
        + ", criticalHit="
        + this.criticalHit
        + ", criticalHitWeapon="
        + this.criticalHitWeapon
        + ", criticalMiss="
        + this.criticalMiss
        + ", healBonus="
        + this.healBonus
        + ", allDamagesBonus="
        + this.allDamagesBonus
        + ", weaponDamagesBonusPercent="
        + this.weaponDamagesBonusPercent
        + ", damagesBonusPercent="
        + this.damagesBonusPercent
        + ", trapBonus="
        + this.trapBonus
        + ", trapBonusPercent="
        + this.trapBonusPercent
        + ", glyphBonusPercent="
        + this.glyphBonusPercent
        + ", runeBonusPercent="
        + this.runeBonusPercent
        + ", permanentDamagePercent="
        + this.permanentDamagePercent
        + ", tackleBlock="
        + this.tackleBlock
        + ", tackleEvade="
        + this.tackleEvade
        + ", PAAttack="
        + this.PAAttack
        + ", PMAttack="
        + this.PMAttack
        + ", pushDamageBonus="
        + this.pushDamageBonus
        + ", criticalDamageBonus="
        + this.criticalDamageBonus
        + ", neutralDamageBonus="
        + this.neutralDamageBonus
        + ", earthDamageBonus="
        + this.earthDamageBonus
        + ", waterDamageBonus="
        + this.waterDamageBonus
        + ", airDamageBonus="
        + this.airDamageBonus
        + ", fireDamageBonus="
        + this.fireDamageBonus
        + ", dodgePALostProbability="
        + this.dodgePALostProbability
        + ", dodgePMLostProbability="
        + this.dodgePMLostProbability
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
        + ", pushDamageReduction="
        + this.pushDamageReduction
        + ", criticalDamageReduction="
        + this.criticalDamageReduction
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
        + ", meleeDamageDonePercent="
        + this.meleeDamageDonePercent
        + ", meleeDamageReceivedPercent="
        + this.meleeDamageReceivedPercent
        + ", rangedDamageDonePercent="
        + this.rangedDamageDonePercent
        + ", rangedDamageReceivedPercent="
        + this.rangedDamageReceivedPercent
        + ", weaponDamageDonePercent="
        + this.weaponDamageDonePercent
        + ", weaponDamageReceivedPercent="
        + this.weaponDamageReceivedPercent
        + ", spellDamageDonePercent="
        + this.spellDamageDonePercent
        + ", spellDamageReceivedPercent="
        + this.spellDamageReceivedPercent
        + ", spellModifications="
        + java.util.Arrays.toString(this.spellModifications)
        + ", probationTime="
        + this.probationTime
        + ')';
  }
}
