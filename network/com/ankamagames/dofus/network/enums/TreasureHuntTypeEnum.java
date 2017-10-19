// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TreasureHuntTypeEnum {
  TREASURE_HUNT_CLASSIC((byte) 0),

  TREASURE_HUNT_PORTAL((byte) 1),

  TREASURE_HUNT_LEGENDARY((byte) 2),
  ;

  public final byte value;

  private TreasureHuntTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<TreasureHuntTypeEnum> valueOf(byte value)
  {
    for (TreasureHuntTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
