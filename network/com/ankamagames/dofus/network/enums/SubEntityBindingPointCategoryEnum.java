// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum SubEntityBindingPointCategoryEnum {
  HOOK_POINT_CATEGORY_UNUSED((byte) 0),

  HOOK_POINT_CATEGORY_PET((byte) 1),

  HOOK_POINT_CATEGORY_MOUNT_DRIVER((byte) 2),

  HOOK_POINT_CATEGORY_LIFTED_ENTITY((byte) 3),

  HOOK_POINT_CATEGORY_BASE_BACKGROUND((byte) 4),

  HOOK_POINT_CATEGORY_MERCHANT_BAG((byte) 5),

  HOOK_POINT_CATEGORY_BASE_FOREGROUND((byte) 6),

  HOOK_POINT_CATEGORY_PET_FOLLOWER((byte) 7),

  HOOK_POINT_CATEGORY_UNDERWATER_BUBBLES((byte) 8),
  ;

  public final byte value;

  private SubEntityBindingPointCategoryEnum(byte value) {
    this.value = value;
  }

  public static Optional<SubEntityBindingPointCategoryEnum> valueOf(byte value) {
    for (SubEntityBindingPointCategoryEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
