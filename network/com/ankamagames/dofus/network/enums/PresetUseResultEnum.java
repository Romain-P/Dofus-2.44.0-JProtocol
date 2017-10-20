// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PresetUseResultEnum {
  PRESET_USE_OK((byte) 1),

  PRESET_USE_OK_PARTIAL((byte) 2),

  PRESET_USE_ERR_UNKNOWN((byte) 3),

  PRESET_USE_ERR_CRITERION((byte) 4),

  PRESET_USE_ERR_BAD_PRESET_ID((byte) 5),

  PRESET_USE_ERR_COOLDOWN((byte) 6),
  ;

  public final byte value;

  private PresetUseResultEnum(byte value) {
    this.value = value;
  }

  public static Optional<PresetUseResultEnum> valueOf(byte value) {
    for (PresetUseResultEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
