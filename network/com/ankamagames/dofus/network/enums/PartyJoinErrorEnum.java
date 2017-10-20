// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PartyJoinErrorEnum {
  PARTY_JOIN_ERROR_UNKNOWN((byte) 0),

  PARTY_JOIN_ERROR_PLAYER_NOT_FOUND((byte) 1),

  PARTY_JOIN_ERROR_PARTY_NOT_FOUND((byte) 2),

  PARTY_JOIN_ERROR_PARTY_FULL((byte) 3),

  PARTY_JOIN_ERROR_PLAYER_BUSY((byte) 4),

  PARTY_JOIN_ERROR_PLAYER_ALREADY_INVITED((byte) 6),

  PARTY_JOIN_ERROR_PLAYER_TOO_SOLLICITED((byte) 7),

  PARTY_JOIN_ERROR_PLAYER_LOYAL((byte) 8),

  PARTY_JOIN_ERROR_UNMODIFIABLE((byte) 9),

  PARTY_JOIN_ERROR_UNMET_CRITERION((byte) 10),

  PARTY_JOIN_ERROR_NOT_ENOUGH_ROOM((byte) 11),

  PARTY_JOIN_ERROR_COMPOSITION_CHANGED((byte) 12),

  PARTY_JOIN_ERROR_PLAYER_IN_TUTORIAL((byte) 13),
  ;

  public final byte value;

  private PartyJoinErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<PartyJoinErrorEnum> valueOf(byte value) {
    for (PartyJoinErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
