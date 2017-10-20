// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum HavenBagDailyLoteryErrorEnum {
  HAVENBAG_DAILY_LOTERY_OK((byte) 0),

  HAVENBAG_DAILY_LOTERY_ALREADYUSED((byte) 1),

  HAVENBAG_DAILY_LOTERY_ERROR((byte) 2),
  ;

  public final byte value;

  private HavenBagDailyLoteryErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<HavenBagDailyLoteryErrorEnum> valueOf(byte value) {
    for (HavenBagDailyLoteryErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
