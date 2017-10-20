// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PlayerLifeStatusEnum {
  STATUS_ALIVE_AND_KICKING((byte) 0),

  STATUS_TOMBSTONE((byte) 1),

  STATUS_PHANTOM((byte) 2),
  ;

  public final byte value;

  private PlayerLifeStatusEnum(byte value) {
    this.value = value;
  }

  public static Optional<PlayerLifeStatusEnum> valueOf(byte value) {
    for (PlayerLifeStatusEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
