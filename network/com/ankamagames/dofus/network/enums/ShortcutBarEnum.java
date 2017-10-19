// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ShortcutBarEnum {
  GENERAL_SHORTCUT_BAR((byte) 0),

  SPELL_SHORTCUT_BAR((byte) 1),
  ;

  public final byte value;

  private ShortcutBarEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ShortcutBarEnum> valueOf(byte value)
  {
    for (ShortcutBarEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
