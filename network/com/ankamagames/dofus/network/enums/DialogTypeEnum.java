// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum DialogTypeEnum {
  DIALOG_BOOK((byte) 0),

  DIALOG_DIALOG((byte) 1),

  DIALOG_LOCKABLE((byte) 2),

  DIALOG_PURCHASABLE((byte) 3),

  DIALOG_GUILD_INVITATION((byte) 4),

  DIALOG_GUILD_CREATE((byte) 5),

  DIALOG_GUILD_RENAME((byte) 6),

  DIALOG_MARRIAGE((byte) 7),

  DIALOG_DUNGEON_MEETING((byte) 8),

  DIALOG_SPELL_FORGET((byte) 9),

  DIALOG_TELEPORTER((byte) 10),

  DIALOG_EXCHANGE((byte) 11),

  DIALOG_ALLIANCE_INVITATION((byte) 12),

  DIALOG_ALLIANCE_CREATE((byte) 13),

  DIALOG_ALLIANCE_RENAME((byte) 14),

  DIALOG_HAVENBAG_MEETING((byte) 15),
  ;

  public final byte value;

  private DialogTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<DialogTypeEnum> valueOf(byte value) {
    for (DialogTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
