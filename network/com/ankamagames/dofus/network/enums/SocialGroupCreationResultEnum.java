// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SocialGroupCreationResultEnum {
  SOCIAL_GROUP_CREATE_OK((byte) 1),

  SOCIAL_GROUP_CREATE_ERROR_NAME_INVALID((byte) 2),

  SOCIAL_GROUP_CREATE_ERROR_ALREADY_IN_GROUP((byte) 3),

  SOCIAL_GROUP_CREATE_ERROR_NAME_ALREADY_EXISTS((byte) 4),

  SOCIAL_GROUP_CREATE_ERROR_EMBLEM_ALREADY_EXISTS((byte) 5),

  SOCIAL_GROUP_CREATE_ERROR_LEAVE((byte) 6),

  SOCIAL_GROUP_CREATE_ERROR_CANCEL((byte) 7),

  SOCIAL_GROUP_CREATE_ERROR_REQUIREMENT_UNMET((byte) 8),

  SOCIAL_GROUP_CREATE_ERROR_EMBLEM_INVALID((byte) 9),

  SOCIAL_GROUP_CREATE_ERROR_TAG_INVALID((byte) 10),

  SOCIAL_GROUP_CREATE_ERROR_TAG_ALREADY_EXISTS((byte) 11),

  SOCIAL_GROUP_CREATE_ERROR_NEEDS_SUBGROUP((byte) 12),

  SOCIAL_GROUP_CREATE_ERROR_UNKNOWN((byte) 99),
  ;

  public final byte value;

  private SocialGroupCreationResultEnum(byte value) {
    this.value = value;
  }

  public static Optional<SocialGroupCreationResultEnum> valueOf(byte value) {
    for (SocialGroupCreationResultEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
