// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DirectionsEnum {
  DIRECTION_EAST((byte) 0),

  DIRECTION_SOUTH_EAST((byte) 1),

  DIRECTION_SOUTH((byte) 2),

  DIRECTION_SOUTH_WEST((byte) 3),

  DIRECTION_WEST((byte) 4),

  DIRECTION_NORTH_WEST((byte) 5),

  DIRECTION_NORTH((byte) 6),

  DIRECTION_NORTH_EAST((byte) 7),
  ;

  public final byte value;

  private DirectionsEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<DirectionsEnum> valueOf(byte value)
  {
    for (DirectionsEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
