// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SocialGroupInvitationStateEnum {
  SOCIAL_GROUP_INVITATION_FAILED((byte) 0),

  SOCIAL_GROUP_INVITATION_SENT((byte) 1),

  SOCIAL_GROUP_INVITATION_CANCELED((byte) 2),

  SOCIAL_GROUP_INVITATION_OK((byte) 3),
  ;

  public final byte value;

  private SocialGroupInvitationStateEnum(byte value) {
    this.value = value;
  }

  public static Optional<SocialGroupInvitationStateEnum> valueOf(byte value) {
    for (SocialGroupInvitationStateEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
