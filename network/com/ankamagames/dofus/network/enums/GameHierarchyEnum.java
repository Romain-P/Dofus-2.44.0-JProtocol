// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GameHierarchyEnum {
  PLAYER((byte) 0),

  MODERATOR((byte) 10),

  GAMEMASTER_PADAWAN((byte) 20),

  GAMEMASTER((byte) 30),

  ADMIN((byte) 40),
  ;

  public final byte value;

  private GameHierarchyEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<GameHierarchyEnum> valueOf(byte value)
  {
    for (GameHierarchyEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
