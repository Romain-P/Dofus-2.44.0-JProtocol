// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum AllianceRightsBitEnum {
  ALLIANCE_RIGHT_NONE((byte) 0),

  ALLIANCE_RIGHT_BOSS((byte) 1),

  ALLIANCE_RIGHT_MANAGE_PRISMS((byte) 2),

  ALLIANCE_RIGHT_TALK_IN_CHAN((byte) 4),

  ALLIANCE_RIGHT_RECRUIT_GUILDS((byte) 8),

  ALLIANCE_RIGHT_KICK_GUILDS((byte) 16),

  ALLIANCE_RIGHT_MANAGE_RIGHTS((byte) 32),
  ;

  public final byte value;

  private AllianceRightsBitEnum(byte value) {
    this.value = value;
  }

  public static Optional<AllianceRightsBitEnum> valueOf(byte value) {
    for (AllianceRightsBitEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
