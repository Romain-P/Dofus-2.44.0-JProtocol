// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DareCriteriaTypeEnum {
  MONSTER_ID((byte) 0),

  CHALLENGE_ID((byte) 1),

  IDOLS((byte) 2),

  IDOLS_SCORE((byte) 3),

  MAX_CHAR_LVL((byte) 4),

  MAX_FIGHT_TURNS((byte) 5),

  MAX_COUNT_CHAR((byte) 6),

  MIN_COUNT_CHAR((byte) 7),

  FORBIDDEN_BREEDS((byte) 8),

  MANDATORY_BREEDS((byte) 9),

  MIN_COUNT_MONSTERS((byte) 10),
  ;

  public final byte value;

  private DareCriteriaTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<DareCriteriaTypeEnum> valueOf(byte value)
  {
    for (DareCriteriaTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
