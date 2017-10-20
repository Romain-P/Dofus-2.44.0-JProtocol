// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PresetSaveUpdateErrorEnum {
  PRESET_UPDATE_ERR_UNKNOWN((byte) 1),

  PRESET_UPDATE_ERR_BAD_PRESET_ID((byte) 2),

  PRESET_UPDATE_ERR_BAD_POSITION((byte) 3),

  PRESET_UPDATE_ERR_BAD_OBJECT_ID((byte) 4),
  ;

  public final byte value;

  private PresetSaveUpdateErrorEnum(byte value) {
    this.value = value;
  }

  public static Optional<PresetSaveUpdateErrorEnum> valueOf(byte value) {
    for (PresetSaveUpdateErrorEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
