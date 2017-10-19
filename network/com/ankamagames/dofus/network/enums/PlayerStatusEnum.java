// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PlayerStatusEnum {
  PLAYER_STATUS_OFFLINE((byte) 0),

  PLAYER_STATUS_UNKNOWN((byte) 1),

  PLAYER_STATUS_AVAILABLE((byte) 10),

  PLAYER_STATUS_IDLE((byte) 20),

  PLAYER_STATUS_AFK((byte) 21),

  PLAYER_STATUS_PRIVATE((byte) 30),

  PLAYER_STATUS_SOLO((byte) 40),
  ;

  public final byte value;

  private PlayerStatusEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<PlayerStatusEnum> valueOf(byte value)
  {
    for (PlayerStatusEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
