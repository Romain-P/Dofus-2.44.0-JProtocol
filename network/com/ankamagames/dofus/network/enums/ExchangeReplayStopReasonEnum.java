// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ExchangeReplayStopReasonEnum {
  STOPPED_REASON_OK((byte) 1),

  STOPPED_REASON_USER((byte) 2),

  STOPPED_REASON_MISSING_RESSOURCE((byte) 3),

  STOPPED_REASON_IMPOSSIBLE_MODIFICATION((byte) 4),
  ;

  public final byte value;

  private ExchangeReplayStopReasonEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ExchangeReplayStopReasonEnum> valueOf(byte value)
  {
    for (ExchangeReplayStopReasonEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
