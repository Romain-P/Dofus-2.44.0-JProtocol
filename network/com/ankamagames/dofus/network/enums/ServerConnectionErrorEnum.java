// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ServerConnectionErrorEnum {
  SERVER_CONNECTION_ERROR_DUE_TO_STATUS((byte) 0),

  SERVER_CONNECTION_ERROR_NO_REASON((byte) 1),

  SERVER_CONNECTION_ERROR_ACCOUNT_RESTRICTED((byte) 2),

  SERVER_CONNECTION_ERROR_COMMUNITY_RESTRICTED((byte) 3),

  SERVER_CONNECTION_ERROR_LOCATION_RESTRICTED((byte) 4),

  SERVER_CONNECTION_ERROR_SUBSCRIBERS_ONLY((byte) 5),

  SERVER_CONNECTION_ERROR_REGULAR_PLAYERS_ONLY((byte) 6),

  SERVER_CONNECTION_ERROR_MONOACCOUNT_CANNOT_VERIFY((byte) 7),

  SERVER_CONNECTION_ERROR_MONOACCOUNT_ONLY((byte) 8),
  ;

  public final byte value;

  private ServerConnectionErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<ServerConnectionErrorEnum> valueOf(byte value) {
    for (ServerConnectionErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
