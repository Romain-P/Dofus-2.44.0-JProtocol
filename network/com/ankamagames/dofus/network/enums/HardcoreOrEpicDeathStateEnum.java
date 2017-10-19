// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum HardcoreOrEpicDeathStateEnum {
  DEATH_STATE_ALIVE((byte) 0),

  DEATH_STATE_DEAD((byte) 1),

  DEATH_STATE_WAITING_CONFIRMATION((byte) 2),
  ;

  public final byte value;

  private HardcoreOrEpicDeathStateEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<HardcoreOrEpicDeathStateEnum> valueOf(byte value)
  {
    for (HardcoreOrEpicDeathStateEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
