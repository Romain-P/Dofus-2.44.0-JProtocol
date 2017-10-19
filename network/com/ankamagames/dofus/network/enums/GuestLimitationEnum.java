// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GuestLimitationEnum {
  LIMITED_TO_REGISTERED((byte) 0),

  GUEST_LIMIT_ON_JOB_XP((byte) 1),

  GUEST_LIMIT_ON_JOB_USE((byte) 2),

  GUEST_LIMIT_ON_MAP((byte) 3),

  GUEST_LIMIT_ON_ITEM((byte) 4),

  GUEST_LIMIT_ON_VENDOR((byte) 5),

  GUEST_LIMIT_ON_CHAT((byte) 6),

  GUEST_LIMIT_ON_GUILD((byte) 7),
  ;

  public final byte value;

  private GuestLimitationEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<GuestLimitationEnum> valueOf(byte value)
  {
    for (GuestLimitationEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
