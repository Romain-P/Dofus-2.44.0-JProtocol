// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DareErrorEnum {
  UKNOWN_ERROR((byte) 0),

  DARE_CREATION_FAILED((byte) 1),

  DARE_UNKNOWN((byte) 2),

  DARE_CANT_CANCEL((byte) 3),

  DARE_REWARD_UNKNOWN((byte) 4),
  ;

  public final byte value;

  private DareErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<DareErrorEnum> valueOf(byte value) {
    for (DareErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
