// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum HaapiTokenTypeEnum {
  HAAPI_APIKEY_GENERIC((byte) 0),

  HAAPI_APIKEY_SHOP((byte) 1),
  ;

  public final byte value;

  private HaapiTokenTypeEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<HaapiTokenTypeEnum> valueOf(byte value)
  {
    for (HaapiTokenTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
