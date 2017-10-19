// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum ObjectErrorEnum {
  INVENTORY_FULL((byte) 1),

  CANNOT_EQUIP_TWICE((byte) 2),

  NOT_TRADABLE((byte) 3),

  CANNOT_DROP((byte) 4),

  CANNOT_DROP_NO_PLACE((byte) 5),

  CANNOT_DESTROY((byte) 6),

  LEVEL_TOO_LOW((byte) 7),

  LIVING_OBJECT_REFUSED_FOOD((byte) 8),

  CANNOT_UNEQUIP((byte) 9),

  CANNOT_EQUIP_HERE((byte) 10),

  CRITERIONS((byte) 11),

  SYMBIOTIC_OBJECT_ERROR((byte) 12),
  ;

  public final byte value;

  private ObjectErrorEnum(byte value)
  {
    this.value = value;
  }

  public static Optional<ObjectErrorEnum> valueOf(byte value)
  {
    for (ObjectErrorEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
