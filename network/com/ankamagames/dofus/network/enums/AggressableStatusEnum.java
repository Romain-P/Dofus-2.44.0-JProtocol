// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum AggressableStatusEnum {
  NON_AGGRESSABLE((byte) 0),

  PvP_ENABLED_AGGRESSABLE((byte) 10),

  PvP_ENABLED_NON_AGGRESSABLE((byte) 11),

  AvA_ENABLED_AGGRESSABLE((byte) 20),

  AvA_ENABLED_NON_AGGRESSABLE((byte) 21),

  AvA_DISQUALIFIED((byte) 22),

  AvA_PREQUALIFIED_AGGRESSABLE((byte) 23),
  ;

  public final byte value;

  private AggressableStatusEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<AggressableStatusEnum> valueOf(byte value)
  {
    for (AggressableStatusEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
