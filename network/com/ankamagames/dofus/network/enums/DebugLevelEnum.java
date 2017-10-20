// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DebugLevelEnum {
  LEVEL_TRACE((byte) 0),

  LEVEL_DEBUG((byte) 1),

  LEVEL_INFO((byte) 2),

  LEVEL_WARN((byte) 3),

  LEVEL_ERROR((byte) 4),

  LEVEL_FATAL((byte) 5),
  ;

  public final byte value;

  private DebugLevelEnum(byte value) {
    this.value = value;
  }

  public static Optional<DebugLevelEnum> valueOf(byte value) {
    for (DebugLevelEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
