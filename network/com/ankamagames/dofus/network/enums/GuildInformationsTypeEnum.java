// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GuildInformationsTypeEnum {
  INFO_GENERAL((byte) 1),

  INFO_MEMBERS((byte) 2),

  INFO_BOOSTS((byte) 3),

  INFO_PADDOCKS((byte) 4),

  INFO_HOUSES((byte) 5),

  INFO_TAX_COLLECTOR_GUILD_ONLY((byte) 6),

  INFO_TAX_COLLECTOR_ALLIANCE((byte) 7),

  INFO_TAX_COLLECTOR_LEAVE((byte) 8),
  ;

  public final byte value;

  private GuildInformationsTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<GuildInformationsTypeEnum> valueOf(byte value) {
    for (GuildInformationsTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
