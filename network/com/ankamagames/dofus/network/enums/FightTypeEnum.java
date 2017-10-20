// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FightTypeEnum {
  FIGHT_TYPE_CHALLENGE((byte) 0),

  FIGHT_TYPE_AGRESSION((byte) 1),

  FIGHT_TYPE_PvMA((byte) 2),

  FIGHT_TYPE_MXvM((byte) 3),

  FIGHT_TYPE_PvM((byte) 4),

  FIGHT_TYPE_PvT((byte) 5),

  FIGHT_TYPE_PvMU((byte) 6),

  FIGHT_TYPE_PVP_ARENA((byte) 7),

  FIGHT_TYPE_Koh((byte) 8),

  FIGHT_TYPE_PvPr((byte) 9),
  ;

  public final byte value;

  private FightTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<FightTypeEnum> valueOf(byte value) {
    for (FightTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
