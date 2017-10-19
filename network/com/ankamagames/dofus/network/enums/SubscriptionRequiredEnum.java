// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SubscriptionRequiredEnum {
  LIMITED_TO_SUBSCRIBER((byte) 0),

  LIMIT_ON_JOB_XP((byte) 1),

  LIMIT_ON_JOB_USE((byte) 2),

  LIMIT_ON_MAP((byte) 3),

  LIMIT_ON_ITEM((byte) 4),

  LIMIT_ON_VENDOR((byte) 5),
  ;

  public final byte value;

  private SubscriptionRequiredEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<SubscriptionRequiredEnum> valueOf(byte value)
  {
    for (SubscriptionRequiredEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
