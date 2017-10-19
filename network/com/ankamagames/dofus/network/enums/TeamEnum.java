// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TeamEnum {
  TEAM_CHALLENGER((byte) 0),

  TEAM_DEFENDER((byte) 1),

  TEAM_SPECTATOR((byte) 2),
  ;

  public final byte value;

  private TeamEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<TeamEnum> valueOf(byte value)
  {
    for (TeamEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
