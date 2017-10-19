// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ClientInstallTypeEnum {
  CLIENT_INSTALL_UNKNOWN((byte) 0),

  CLIENT_BUNDLE((byte) 1),

  CLIENT_STREAMING((byte) 2),
  ;

  public final byte value;

  private ClientInstallTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ClientInstallTypeEnum> valueOf(byte value)
  {
    for (ClientInstallTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
