// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PresetDeleteResultEnum {
  PRESET_DEL_OK((byte) 1),

  PRESET_DEL_ERR_UNKNOWN((byte) 2),

  PRESET_DEL_ERR_BAD_PRESET_ID((byte) 3),
  ;

  public final byte value;

  private PresetDeleteResultEnum(byte value) {
    this.value = value;
  }

  public static Optional<PresetDeleteResultEnum> valueOf(byte value) {
    for (PresetDeleteResultEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
