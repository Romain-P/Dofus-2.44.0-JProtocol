// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PartyNameErrorEnum {
  PARTY_NAME_UNDEFINED_ERROR((byte) 0),

  PARTY_NAME_INVALID((byte) 1),

  PARTY_NAME_ALREADY_USED((byte) 2),

  PARTY_NAME_UNALLOWED_RIGHTS((byte) 3),

  PARTY_NAME_UNALLOWED_NOW((byte) 4),
  ;

  public final byte value;

  private PartyNameErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<PartyNameErrorEnum> valueOf(byte value) {
    for (PartyNameErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
