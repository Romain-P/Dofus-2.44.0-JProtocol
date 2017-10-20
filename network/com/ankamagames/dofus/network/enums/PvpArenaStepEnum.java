// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PvpArenaStepEnum {
  ARENA_STEP_REGISTRED((byte) 0),

  ARENA_STEP_WAITING_FIGHT((byte) 1),

  ARENA_STEP_STARTING_FIGHT((byte) 2),

  ARENA_STEP_UNREGISTER((byte) 3),
  ;

  public final byte value;

  private PvpArenaStepEnum(byte value) {
    this.value = value;
  }

  public static Optional<PvpArenaStepEnum> valueOf(byte value) {
    for (PvpArenaStepEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
