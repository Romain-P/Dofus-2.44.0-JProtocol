// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TaxCollectorMovementTypeEnum {
  TAX_COLLECTOR_UNKNOWN_ACTION((byte) 0),

  TAX_COLLECTOR_HIRED((byte) 1),

  TAX_COLLECTOR_HARVESTED((byte) 2),

  TAX_COLLECTOR_DEFEATED((byte) 3),

  TAX_COLLECTOR_DESTROYED((byte) 4),
  ;

  public final byte value;

  private TaxCollectorMovementTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<TaxCollectorMovementTypeEnum> valueOf(byte value)
  {
    for (TaxCollectorMovementTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
