// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SequenceTypeEnum {
  SEQUENCE_SPELL((byte) 1),

  SEQUENCE_WEAPON((byte) 2),

  SEQUENCE_GLYPH_TRAP((byte) 3),

  SEQUENCE_TRIGGERED((byte) 4),

  SEQUENCE_MOVE((byte) 5),

  SEQUENCE_CHARACTER_DEATH((byte) 6),

  SEQUENCE_TURN_START((byte) 7),

  SEQUENCE_TURN_END((byte) 8),

  SEQUENCE_FIGHT_START((byte) 9),
  ;

  public final byte value;

  private SequenceTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<SequenceTypeEnum> valueOf(byte value)
  {
    for (SequenceTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
