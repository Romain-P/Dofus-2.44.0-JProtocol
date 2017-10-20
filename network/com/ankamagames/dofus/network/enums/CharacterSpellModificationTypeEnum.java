// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CharacterSpellModificationTypeEnum {
  INVALID_MODIFICATION((byte) 0),

  RANGEABLE((byte) 1),

  DAMAGE((byte) 2),

  BASE_DAMAGE((byte) 3),

  HEAL_BONUS((byte) 4),

  AP_COST((byte) 5),

  CAST_INTERVAL((byte) 6),

  CAST_INTERVAL_SET((byte) 7),

  CRITICAL_HIT_BONUS((byte) 8),

  CAST_LINE((byte) 9),

  LOS((byte) 10),

  MAX_CAST_PER_TURN((byte) 11),

  MAX_CAST_PER_TARGET((byte) 12),

  RANGE((byte) 13),
  ;

  public final byte value;

  private CharacterSpellModificationTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<CharacterSpellModificationTypeEnum> valueOf(byte value) {
    for (CharacterSpellModificationTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
