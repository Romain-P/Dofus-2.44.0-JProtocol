// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ExchangeTypeEnum {
  NPC_SHOP((byte) 0),

  PLAYER_TRADE((byte) 1),

  NPC_TRADE((byte) 2),

  CRAFT((byte) 3),

  DISCONNECTED_VENDOR((byte) 4),

  STORAGE((byte) 5),

  SHOP_STOCK((byte) 6),

  TAXCOLLECTOR((byte) 8),

  NPC_MODIFY_TRADE((byte) 9),

  BIDHOUSE_SELL((byte) 10),

  BIDHOUSE_BUY((byte) 11),

  MULTICRAFT_CRAFTER((byte) 12),

  MULTICRAFT_CUSTOMER((byte) 13),

  JOB_INDEX((byte) 14),

  MOUNT((byte) 15),

  MOUNT_STABLE((byte) 16),

  NPC_RESURECT_PET((byte) 17),

  NPC_TRADE_RIDE((byte) 18),

  REALESTATE_HOUSE((byte) 19),

  REALESTATE_FARM((byte) 20),

  RUNES_TRADE((byte) 21),

  RECYCLE_TRADE((byte) 22),

  BANK((byte) 23),

  TRASHBIN((byte) 24),

  ALLIANCE_PRISM((byte) 25),

  HAVENBAG((byte) 26),

  NPC_TRADE_MULDO((byte) 27),
  ;

  public final byte value;

  private ExchangeTypeEnum(byte value) {
    this.value = value;
  }

  public static Optional<ExchangeTypeEnum> valueOf(byte value) {
    for (ExchangeTypeEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
