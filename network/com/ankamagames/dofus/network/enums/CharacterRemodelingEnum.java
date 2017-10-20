// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CharacterRemodelingEnum {
  CHARACTER_REMODELING_NOT_APPLICABLE((byte) 0),

  CHARACTER_REMODELING_NAME((byte) 1),

  CHARACTER_REMODELING_COLORS((byte) 2),

  CHARACTER_REMODELING_COSMETIC((byte) 4),

  CHARACTER_REMODELING_BREED((byte) 8),

  CHARACTER_REMODELING_GENDER((byte) 16),

  CHARACTER_OPT_REMODELING_NAME((byte) 32),
  ;

  public final byte value;

  private CharacterRemodelingEnum(byte value) {
    this.value = value;
  }

  public static Optional<CharacterRemodelingEnum> valueOf(byte value) {
    for (CharacterRemodelingEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
