// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ListAddFailureEnum {
  LIST_ADD_FAILURE_UNKNOWN((byte) 0),

  LIST_ADD_FAILURE_OVER_QUOTA((byte) 1),

  LIST_ADD_FAILURE_NOT_FOUND((byte) 2),

  LIST_ADD_FAILURE_EGOCENTRIC((byte) 3),

  LIST_ADD_FAILURE_IS_DOUBLE((byte) 4),
  ;

  public final byte value;

  private ListAddFailureEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ListAddFailureEnum> valueOf(byte value)
  {
    for (ListAddFailureEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
