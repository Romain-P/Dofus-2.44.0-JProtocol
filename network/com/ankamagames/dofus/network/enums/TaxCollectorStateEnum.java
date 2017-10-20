// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TaxCollectorStateEnum {
  STATE_COLLECTING((byte) 0),

  STATE_WAITING_FOR_HELP((byte) 1),

  STATE_FIGHTING((byte) 2),
  ;

  public final byte value;

  private TaxCollectorStateEnum(byte value) {
    this.value = value;
  }

  public static Optional<TaxCollectorStateEnum> valueOf(byte value) {
    for (TaxCollectorStateEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
