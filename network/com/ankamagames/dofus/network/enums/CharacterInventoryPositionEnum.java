// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum CharacterInventoryPositionEnum {
  ACCESSORY_POSITION_HAT((byte) 6),

  ACCESSORY_POSITION_CAPE((byte) 7),

  ACCESSORY_POSITION_BELT((byte) 3),

  ACCESSORY_POSITION_BOOTS((byte) 5),

  ACCESSORY_POSITION_AMULET((byte) 0),

  ACCESSORY_POSITION_SHIELD((byte) 15),

  ACCESSORY_POSITION_WEAPON((byte) 1),

  ACCESSORY_POSITION_PETS((byte) 8),

  ACCESSORY_POSITION_RIDE_HARNESS((byte) 29),

  INVENTORY_POSITION_RING_LEFT((byte) 2),

  INVENTORY_POSITION_RING_RIGHT((byte) 4),

  INVENTORY_POSITION_DOFUS_1((byte) 9),

  INVENTORY_POSITION_DOFUS_2((byte) 10),

  INVENTORY_POSITION_DOFUS_3((byte) 11),

  INVENTORY_POSITION_DOFUS_4((byte) 12),

  INVENTORY_POSITION_DOFUS_5((byte) 13),

  INVENTORY_POSITION_DOFUS_6((byte) 14),

  INVENTORY_POSITION_MOUNT((byte) 16),

  INVENTORY_POSITION_MUTATION((byte) 20),

  INVENTORY_POSITION_BOOST_FOOD((byte) 21),

  INVENTORY_POSITION_FIRST_BONUS((byte) 22),

  INVENTORY_POSITION_SECOND_BONUS((byte) 23),

  INVENTORY_POSITION_FIRST_MALUS((byte) 24),

  INVENTORY_POSITION_SECOND_MALUS((byte) 25),

  INVENTORY_POSITION_ROLEPLAY_BUFFER((byte) 26),

  INVENTORY_POSITION_FOLLOWER((byte) 27),

  INVENTORY_POSITION_COMPANION((byte) 28),

  INVENTORY_POSITION_COSTUME((byte) 30),

  INVENTORY_POSITION_NOT_EQUIPED((byte) 63),
  ;

  public final byte value;

  private CharacterInventoryPositionEnum(byte value) {
    this.value = value;
  }

  public static Optional<CharacterInventoryPositionEnum> valueOf(byte value) {
    for (CharacterInventoryPositionEnum it : values()) {
      if (it.value == value) {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
