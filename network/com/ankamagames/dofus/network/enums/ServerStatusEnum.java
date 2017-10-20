// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ServerStatusEnum {
  STATUS_UNKNOWN((byte) 0),

  OFFLINE((byte) 1),

  STARTING((byte) 2),

  ONLINE((byte) 3),

  NOJOIN((byte) 4),

  SAVING((byte) 5),

  STOPING((byte) 6),

  FULL((byte) 7),
  ;

  public final byte value;

  private ServerStatusEnum(byte value) {
    this.value = value;
  }

  public static Optional<ServerStatusEnum> valueOf(byte value) {
    for (ServerStatusEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
