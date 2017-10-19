// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ExchangeErrorEnum {
  REQUEST_IMPOSSIBLE((byte) 1),

  REQUEST_CHARACTER_OCCUPIED((byte) 2),

  REQUEST_CHARACTER_JOB_NOT_EQUIPED((byte) 3),

  REQUEST_CHARACTER_TOOL_TOO_FAR((byte) 4),

  REQUEST_CHARACTER_OVERLOADED((byte) 5),

  REQUEST_CHARACTER_NOT_SUSCRIBER((byte) 6),

  REQUEST_CHARACTER_RESTRICTED((byte) 7),

  REQUEST_CHARACTER_GUEST((byte) 8),

  SELL_ERROR((byte) 63),

  BUY_ERROR((byte) 64),

  MOUNT_PADDOCK_ERROR((byte) 10),

  BID_SEARCH_ERROR((byte) 11),
  ;

  public final byte value;

  private ExchangeErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ExchangeErrorEnum> valueOf(byte value)
  {
    for (ExchangeErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
