// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum BuildTypeEnum {
  RELEASE((byte) 0),

  BETA((byte) 1),

  ALPHA((byte) 2),

  TESTING((byte) 3),

  INTERNAL((byte) 4),

  DEBUG((byte) 5),

  EXPERIMENTAL((byte) 6),
  ;

  public final byte value;

  private BuildTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<BuildTypeEnum> valueOf(byte value) {
    for (BuildTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
