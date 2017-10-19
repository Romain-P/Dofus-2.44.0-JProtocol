// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum AlignmentSideEnum {
  ALIGNMENT_NEUTRAL((byte) 0),

  ALIGNMENT_ANGEL((byte) 1),

  ALIGNMENT_EVIL((byte) 2),

  ALIGNMENT_MERCENARY((byte) 3),
  ;

  public final byte value;

  private AlignmentSideEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<AlignmentSideEnum> valueOf(byte value)
  {
    for (AlignmentSideEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
