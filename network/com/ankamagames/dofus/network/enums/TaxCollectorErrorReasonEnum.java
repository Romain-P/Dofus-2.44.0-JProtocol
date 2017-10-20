// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TaxCollectorErrorReasonEnum {
  TAX_COLLECTOR_ERROR_UNKNOWN((byte) 0),

  TAX_COLLECTOR_NOT_FOUND((byte) 1),

  TAX_COLLECTOR_NOT_OWNED((byte) 2),

  TAX_COLLECTOR_NO_RIGHTS((byte) 3),

  TAX_COLLECTOR_MAX_REACHED((byte) 4),

  TAX_COLLECTOR_ALREADY_ONE((byte) 5),

  TAX_COLLECTOR_CANT_HIRE_YET((byte) 6),

  TAX_COLLECTOR_CANT_HIRE_HERE((byte) 7),

  TAX_COLLECTOR_NOT_ENOUGH_KAMAS((byte) 8),
  ;

  public final byte value;

  private TaxCollectorErrorReasonEnum(byte value) {
    this.value = value;
  }

  public static Optional<TaxCollectorErrorReasonEnum> valueOf(byte value) {
    for (TaxCollectorErrorReasonEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
