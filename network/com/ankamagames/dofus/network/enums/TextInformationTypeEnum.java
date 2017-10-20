// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum TextInformationTypeEnum {
  TEXT_INFORMATION_MESSAGE((byte) 0),

  TEXT_INFORMATION_ERROR((byte) 1),

  TEXT_INFORMATION_PVP((byte) 2),

  TEXT_INFORMATION_FIGHT_LOG((byte) 3),

  TEXT_INFORMATION_POPUP((byte) 4),

  TEXT_LIVING_OBJECT((byte) 5),

  TEXT_ENTITY_TALK((byte) 6),

  TEXT_INFORMATION_FIGHT((byte) 7),
  ;

  public final byte value;

  private TextInformationTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<TextInformationTypeEnum> valueOf(byte value) {
    for (TextInformationTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
