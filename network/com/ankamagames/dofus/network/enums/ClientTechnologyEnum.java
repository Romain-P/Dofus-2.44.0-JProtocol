// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ClientTechnologyEnum {
  CLIENT_TECHNOLOGY_UNKNOWN((byte) 0),

  CLIENT_AIR((byte) 1),

  CLIENT_FLASH((byte) 2),
  ;

  public final byte value;

  private ClientTechnologyEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ClientTechnologyEnum> valueOf(byte value)
  {
    for (ClientTechnologyEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
