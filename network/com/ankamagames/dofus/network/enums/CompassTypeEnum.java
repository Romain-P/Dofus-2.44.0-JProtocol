// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CompassTypeEnum {
  COMPASS_TYPE_SIMPLE((byte) 0),

  COMPASS_TYPE_SPOUSE((byte) 1),

  COMPASS_TYPE_PARTY((byte) 2),

  COMPASS_TYPE_PVP_SEEK((byte) 3),

  COMPASS_TYPE_QUEST((byte) 4),
  ;

  public final byte value;

  private CompassTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<CompassTypeEnum> valueOf(byte value)
  {
    for (CompassTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
