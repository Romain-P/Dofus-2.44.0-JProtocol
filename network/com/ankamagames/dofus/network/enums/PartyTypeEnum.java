// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PartyTypeEnum {
  PARTY_TYPE_UNDEFINED((byte) 0),

  PARTY_TYPE_CLASSICAL((byte) 1),

  PARTY_TYPE_DUNGEON((byte) 2),

  PARTY_TYPE_ARENA((byte) 3),
  ;

  public final byte value;

  private PartyTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<PartyTypeEnum> valueOf(byte value) {
    for (PartyTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
