// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ChatErrorEnum {
  CHAT_ERROR_UNKNOWN((byte) 0),

  CHAT_ERROR_RECEIVER_NOT_FOUND((byte) 1),

  CHAT_ERROR_INTERIOR_MONOLOGUE((byte) 2),

  CHAT_ERROR_NO_GUILD((byte) 3),

  CHAT_ERROR_NO_PARTY((byte) 4),

  CHAT_ERROR_ALLIANCE((byte) 5),

  CHAT_ERROR_INVALID_MAP((byte) 6),

  CHAT_ERROR_NO_PARTY_ARENA((byte) 7),

  CHAT_ERROR_NO_TEAM((byte) 8),

  CHAT_ERROR_MALFORMED_CONTENT((byte) 9),

  CHAT_ERROR_NO_CHANNEL_COMMUNITY((byte) 10),
  ;

  public final byte value;

  private ChatErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ChatErrorEnum> valueOf(byte value)
  {
    for (ChatErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
