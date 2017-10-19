// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FightDispellableEnum {
  DISPELLABLE((byte) 1),

  DISPELLABLE_BY_DEATH((byte) 2),

  DISPELLABLE_BY_STRONG_DISPEL((byte) 3),

  REALLY_NOT_DISPELLABLE((byte) 4),
  ;

  public final byte value;

  private FightDispellableEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<FightDispellableEnum> valueOf(byte value)
  {
    for (FightDispellableEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
