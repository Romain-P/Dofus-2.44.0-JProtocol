// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ServerCompletionEnum {
  COMPLETION_RECOMANDATED((byte) 0),

  COMPLETION_AVERAGE((byte) 1),

  COMPLETION_HIGH((byte) 2),

  COMPLETION_COMING_SOON((byte) 3),

  COMPLETION_FULL((byte) 4),
  ;

  public final byte value;

  private ServerCompletionEnum(byte value) {
    this.value = value;
  }

  public static Optional<ServerCompletionEnum> valueOf(byte value) {
    for (ServerCompletionEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
