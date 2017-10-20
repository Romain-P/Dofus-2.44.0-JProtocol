// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TreasureHuntDigRequestEnum {
  TREASURE_HUNT_DIG_ERROR_UNDEFINED((byte) 0),

  TREASURE_HUNT_DIG_NEW_HINT((byte) 1),

  TREASURE_HUNT_DIG_FINISHED((byte) 2),

  TREASURE_HUNT_DIG_WRONG((byte) 3),

  TREASURE_HUNT_DIG_LOST((byte) 4),

  TREASURE_HUNT_DIG_ERROR_IMPOSSIBLE((byte) 5),

  TREASURE_HUNT_DIG_WRONG_AND_YOU_KNOW_IT((byte) 6),
  ;

  public final byte value;

  private TreasureHuntDigRequestEnum(byte value) {
    this.value = value;
  }

  public static Optional<TreasureHuntDigRequestEnum> valueOf(byte value) {
    for (TreasureHuntDigRequestEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
