// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FightOutcomeEnum {
  RESULT_LOST((byte) 0),

  RESULT_DRAW((byte) 1),

  RESULT_VICTORY((byte) 2),

  RESULT_TAX((byte) 5),

  RESULT_DEFENDER_GROUP((byte) 6),
  ;

  public final byte value;

  private FightOutcomeEnum(byte value) {
    this.value = value;
  }

  public static Optional<FightOutcomeEnum> valueOf(byte value) {
    for (FightOutcomeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
