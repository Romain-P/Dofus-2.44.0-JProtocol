// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PresetSaveResultEnum {
  PRESET_SAVE_OK((byte) 1),

  PRESET_SAVE_ERR_UNKNOWN((byte) 2),

  PRESET_SAVE_ERR_TOO_MANY((byte) 3),
  ;

  public final byte value;

  private PresetSaveResultEnum(byte value) {
    this.value = value;
  }

  public static Optional<PresetSaveResultEnum> valueOf(byte value) {
    for (PresetSaveResultEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
