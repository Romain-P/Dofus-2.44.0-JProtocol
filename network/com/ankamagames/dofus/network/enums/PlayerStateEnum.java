// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PlayerStateEnum {
  NOT_CONNECTED((byte) 0),

  GAME_TYPE_ROLEPLAY((byte) 1),

  GAME_TYPE_FIGHT((byte) 2),

  UNKNOWN_STATE((byte) 99),
  ;

  public final byte value;

  private PlayerStateEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<PlayerStateEnum> valueOf(byte value)
  {
    for (PlayerStateEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
