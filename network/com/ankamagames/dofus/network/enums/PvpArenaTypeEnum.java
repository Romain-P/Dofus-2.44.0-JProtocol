// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PvpArenaTypeEnum {
  ARENA_TYPE_1VS1((byte) 1),

  ARENA_TYPE_3VS3((byte) 3),
  ;

  public final byte value;

  private PvpArenaTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<PvpArenaTypeEnum> valueOf(byte value)
  {
    for (PvpArenaTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
