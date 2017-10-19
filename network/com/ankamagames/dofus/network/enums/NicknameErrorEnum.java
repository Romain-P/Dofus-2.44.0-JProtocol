// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum NicknameErrorEnum {
  ALREADY_USED((byte) 1),

  SAME_AS_LOGIN((byte) 2),

  TOO_SIMILAR_TO_LOGIN((byte) 3),

  INVALID_NICK((byte) 4),

  UNKNOWN_NICK_ERROR((byte) 99),
  ;

  public final byte value;

  private NicknameErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<NicknameErrorEnum> valueOf(byte value)
  {
    for (NicknameErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
