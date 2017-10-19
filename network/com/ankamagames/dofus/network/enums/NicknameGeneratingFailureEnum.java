// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum NicknameGeneratingFailureEnum {
  NICKNAME_GENERATOR_RETRY_TOO_SHORT((byte) 1),

  NICKNAME_GENERATOR_UNAVAILABLE((byte) 2),
  ;

  public final byte value;

  private NicknameGeneratingFailureEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<NicknameGeneratingFailureEnum> valueOf(byte value)
  {
    for (NicknameGeneratingFailureEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
