// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum StatsUpgradeResultEnum {
  SUCCESS((byte) 0),

  RESTRICTED((byte) 1),

  GUEST((byte) 2),

  IN_FIGHT((byte) 3),

  NOT_ENOUGH_POINT((byte) 4),
  ;

  public final byte value;

  private StatsUpgradeResultEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<StatsUpgradeResultEnum> valueOf(byte value)
  {
    for (StatsUpgradeResultEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
