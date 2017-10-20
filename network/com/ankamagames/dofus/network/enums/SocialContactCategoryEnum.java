// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SocialContactCategoryEnum {
  SOCIAL_CONTACT_FRIEND((byte) 0),

  SOCIAL_CONTACT_SPOUSE((byte) 1),

  SOCIAL_CONTACT_PARTY((byte) 2),

  SOCIAL_CONTACT_GUILD((byte) 3),

  SOCIAL_CONTACT_ALLIANCE((byte) 4),

  SOCIAL_CONTACT_CRAFTER((byte) 5),

  SOCIAL_CONTACT_INTERLOCUTOR((byte) 6),

  SOCIAL_CONTACT_FIGHT((byte) 7),
  ;

  public final byte value;

  private SocialContactCategoryEnum(byte value) {
    this.value = value;
  }

  public static Optional<SocialContactCategoryEnum> valueOf(byte value) {
    for (SocialContactCategoryEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
