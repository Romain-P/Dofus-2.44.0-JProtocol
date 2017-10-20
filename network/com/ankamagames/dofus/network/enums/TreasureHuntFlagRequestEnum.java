// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TreasureHuntFlagRequestEnum {
  TREASURE_HUNT_FLAG_ERROR_UNDEFINED((byte) 0),

  TREASURE_HUNT_FLAG_OK((byte) 1),

  TREASURE_HUNT_FLAG_WRONG((byte) 2),

  TREASURE_HUNT_FLAG_TOO_MANY((byte) 3),

  TREASURE_HUNT_FLAG_ERROR_IMPOSSIBLE((byte) 4),

  TREASURE_HUNT_FLAG_WRONG_INDEX((byte) 5),

  TREASURE_HUNT_FLAG_SAME_MAP((byte) 6),
  ;

  public final byte value;

  private TreasureHuntFlagRequestEnum(byte value) {
    this.value = value;
  }

  public static Optional<TreasureHuntFlagRequestEnum> valueOf(byte value) {
    for (TreasureHuntFlagRequestEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
