// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum FighterRefusedReasonEnum {
  FIGHTER_ACCEPTED((byte) 0),

  CHALLENGE_FULL((byte) 1),

  TEAM_FULL((byte) 2),

  WRONG_ALIGNMENT((byte) 3),

  WRONG_GUILD((byte) 4),

  TOO_LATE((byte) 5),

  MUTANT_REFUSED((byte) 6),

  WRONG_MAP((byte) 7),

  JUST_RESPAWNED((byte) 8),

  IM_OCCUPIED((byte) 9),

  OPPONENT_OCCUPIED((byte) 10),

  FIGHT_MYSELF((byte) 11),

  INSUFFICIENT_RIGHTS((byte) 12),

  MEMBER_ACCOUNT_NEEDED((byte) 13),

  OPPONENT_NOT_MEMBER((byte) 14),

  TEAM_LIMITED_BY_MAINCHARACTER((byte) 15),

  MULTIACCOUNT_NOT_ALLOWED((byte) 16),

  GHOST_REFUSED((byte) 17),

  RESTRICTED_ACCOUNT((byte) 19),

  WRONG_ALLIANCE((byte) 20),

  AVA_ZONE((byte) 21),

  COMPANION_REFUSED((byte) 22),

  NOT_ENOUGH_ROOM((byte) 23),

  GUEST_ACCOUNT((byte) 24),
  ;

  public final byte value;

  private FighterRefusedReasonEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<FighterRefusedReasonEnum> valueOf(byte value)
  {
    for (FighterRefusedReasonEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
