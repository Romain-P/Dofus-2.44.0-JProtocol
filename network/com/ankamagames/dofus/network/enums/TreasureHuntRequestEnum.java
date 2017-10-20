// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TreasureHuntRequestEnum {
  TREASURE_HUNT_ERROR_UNDEFINED((byte) 0),

  TREASURE_HUNT_ERROR_NO_QUEST_FOUND((byte) 2),

  TREASURE_HUNT_ERROR_ALREADY_HAVE_QUEST((byte) 3),

  TREASURE_HUNT_ERROR_NOT_AVAILABLE((byte) 4),

  TREASURE_HUNT_ERROR_DAILY_LIMIT_EXCEEDED((byte) 5),

  TREASURE_HUNT_OK((byte) 1),
  ;

  public final byte value;

  private TreasureHuntRequestEnum(byte value) {
    this.value = value;
  }

  public static Optional<TreasureHuntRequestEnum> valueOf(byte value) {
    for (TreasureHuntRequestEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
