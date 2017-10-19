// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum BoostableCharacteristicEnum {
  BOOSTABLE_CHARAC_STRENGTH((byte) 10),

  BOOSTABLE_CHARAC_VITALITY((byte) 11),

  BOOSTABLE_CHARAC_WISDOM((byte) 12),

  BOOSTABLE_CHARAC_CHANCE((byte) 13),

  BOOSTABLE_CHARAC_AGILITY((byte) 14),

  BOOSTABLE_CHARAC_INTELLIGENCE((byte) 15),
  ;

  public final byte value;

  private BoostableCharacteristicEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<BoostableCharacteristicEnum> valueOf(byte value)
  {
    for (BoostableCharacteristicEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
