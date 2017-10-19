// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SocialNoticeErrorEnum {
  SOCIAL_NOTICE_UNKNOWN_ERROR((byte) 0),

  SOCIAL_NOTICE_INVALID_RIGHTS((byte) 1),

  SOCIAL_NOTICE_COOLDOWN((byte) 2),
  ;

  public final byte value;

  private SocialNoticeErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<SocialNoticeErrorEnum> valueOf(byte value)
  {
    for (SocialNoticeErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
