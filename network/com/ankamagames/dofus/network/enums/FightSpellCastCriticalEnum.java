// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FightSpellCastCriticalEnum {
  NORMAL((byte) 1),

  CRITICAL_HIT((byte) 2),

  CRITICAL_FAIL((byte) 3),
  ;

  public final byte value;

  private FightSpellCastCriticalEnum(byte value) {
    this.value = value;
  }

  public static Optional<FightSpellCastCriticalEnum> valueOf(byte value) {
    for (FightSpellCastCriticalEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
