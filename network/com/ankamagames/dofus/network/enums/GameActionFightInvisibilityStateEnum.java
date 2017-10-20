// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GameActionFightInvisibilityStateEnum {
  INVISIBLE((byte) 1),

  DETECTED((byte) 2),

  VISIBLE((byte) 3),
  ;

  public final byte value;

  private GameActionFightInvisibilityStateEnum(byte value) {
    this.value = value;
  }

  public static Optional<GameActionFightInvisibilityStateEnum> valueOf(byte value) {
    for (GameActionFightInvisibilityStateEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
