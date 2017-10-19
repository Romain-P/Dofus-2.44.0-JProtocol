// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ChatChannelsMultiEnum {
  CHANNEL_GLOBAL((byte) 0),

  CHANNEL_TEAM((byte) 1),

  CHANNEL_GUILD((byte) 2),

  CHANNEL_ALLIANCE((byte) 3),

  CHANNEL_PARTY((byte) 4),

  CHANNEL_SALES((byte) 5),

  CHANNEL_SEEK((byte) 6),

  CHANNEL_NOOB((byte) 7),

  CHANNEL_ADMIN((byte) 8),

  CHANNEL_ADS((byte) 12),

  CHANNEL_ARENA((byte) 13),

  CHANNEL_COMMUNITY((byte) 14),
  ;

  public final byte value;

  private ChatChannelsMultiEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ChatChannelsMultiEnum> valueOf(byte value)
  {
    for (ChatChannelsMultiEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
