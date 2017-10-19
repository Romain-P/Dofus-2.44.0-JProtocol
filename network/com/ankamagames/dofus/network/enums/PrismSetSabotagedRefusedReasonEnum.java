// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum PrismSetSabotagedRefusedReasonEnum {
  SABOTAGE_INSUFFICIENT_RIGHTS((byte) 0),

  SABOTAGE_MEMBER_ACCOUNT_NEEDED((byte) 1),

  SABOTAGE_RESTRICTED_ACCOUNT((byte) 2),

  SABOTAGE_WRONG_ALLIANCE((byte) 3),

  SABOTAGE_NO_PRISM((byte) 4),

  SABOTAGE_WRONG_STATE((byte) 5),
  ;

  public final byte value;

  private PrismSetSabotagedRefusedReasonEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<PrismSetSabotagedRefusedReasonEnum> valueOf(byte value)
  {
    for (PrismSetSabotagedRefusedReasonEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
