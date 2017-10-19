// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CharacterDeletionErrorEnum {
  DEL_ERR_NO_REASON((byte) 1),

  DEL_ERR_TOO_MANY_CHAR_DELETION((byte) 2),

  DEL_ERR_BAD_SECRET_ANSWER((byte) 3),

  DEL_ERR_RESTRICED_ZONE((byte) 4),
  ;

  public final byte value;

  private CharacterDeletionErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<CharacterDeletionErrorEnum> valueOf(byte value)
  {
    for (CharacterDeletionErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
