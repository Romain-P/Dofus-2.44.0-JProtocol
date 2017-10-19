// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DelayedActionTypeEnum {
  DELAYED_ACTION_DISCONNECT((byte) 0),

  DELAYED_ACTION_OBJECT_USE((byte) 1),

  DELAYED_ACTION_JOIN_CHARACTER((byte) 2),

  DELAYED_ACTION_AGGRESSION_IMMUNE((byte) 3),
  ;

  public final byte value;

  private DelayedActionTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<DelayedActionTypeEnum> valueOf(byte value)
  {
    for (DelayedActionTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
