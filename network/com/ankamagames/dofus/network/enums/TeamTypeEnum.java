// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TeamTypeEnum {
  TEAM_TYPE_PLAYER((byte) 0),

  TEAM_TYPE_MONSTER((byte) 1),

  TEAM_TYPE_MUTANT((byte) 2),

  TEAM_TYPE_TAXCOLLECTOR((byte) 3),

  TEAM_TYPE_BAD_PLAYER((byte) 4),

  TEAM_TYPE_PRISM((byte) 5),
  ;

  public final byte value;

  private TeamTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<TeamTypeEnum> valueOf(byte value)
  {
    for (TeamTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
