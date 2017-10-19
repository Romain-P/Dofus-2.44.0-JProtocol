// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FightOptionsEnum {
  FIGHT_OPTION_SET_SECRET((byte) 0),

  FIGHT_OPTION_SET_TO_PARTY_ONLY((byte) 1),

  FIGHT_OPTION_SET_CLOSED((byte) 2),

  FIGHT_OPTION_ASK_FOR_HELP((byte) 3),
  ;

  public final byte value;

  private FightOptionsEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<FightOptionsEnum> valueOf(byte value)
  {
    for (FightOptionsEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
