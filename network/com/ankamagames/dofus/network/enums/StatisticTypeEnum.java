// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum StatisticTypeEnum {
  STEP0000_CHOSE_NICKNAME((short) 78),

  STEP0100_CHOSE_SERVER((short) 79),

  STEP0200_CREATE_FIRST_CHARACTER((short) 80),

  STEP0300_LOADING_SCREEN((short) 81),

  STEP0400_DOFUS_TRAILER((short) 82),

  STEP0500_ARRIVES_ON_TUTORIAL((short) 83),

  STEP0550_QUITS_TUTORIAL((short) 84),

  STEP0600_TUTO1_MOVE_MAP((short) 85),

  STEP0700_TUTO2_TALK_TO_YAKASI((short) 86),

  STEP0800_TUTO3_EQUIP_RING((short) 87),

  STEP0820_CLIC_BAG((short) 88),

  STEP0840_CLIC_RING((short) 89),

  STEP0860_EQUIP_RING((short) 90),

  STEP0860_EXIT_BAG((short) 91),

  STEP0900_TUTO4_CHANGE_MAP((short) 92),

  STEP1000_TUTO5_START_FIRST_FIGHT((short) 93),

  STEP1100_TUTO6_CHOSE_START_POSITION((short) 94),

  STEP1130_CHOSE_POSITION((short) 95),

  STEP1160_CLIC_READY((short) 96),

  STEP1200_TUTO7_MOVE_IN_FIGHT((short) 97),

  STEP1900_TUTO8_USE_SPELL((short) 98),

  STEP1930_CHOSE_SPELL((short) 99),

  STEP1960_USE_SPELL((short) 100),

  STEP2000_TUTO9_END_TURN((short) 101),

  STEP2100_TUTO10_WIN_FIGHT((short) 102),

  STEP2050_TUTO10_LOSE_FIGHT((short) 103),

  STEP2200_TUTO11_START_FIRST_QUEST((short) 104),

  STEP2220_CLIC_YAKASI((short) 105),

  STEP2240_TALK_YAKASI((short) 106),

  STEP2260_ACCEPT_MISSION((short) 107),

  STEP2300_TUTO12_EQUIP_SET((short) 108),

  STEP2350_EXIT_BAG((short) 109),

  STEP2400_TUTO13_LETS_KILL_MONSTER((short) 110),

  STEP2430_GO_TO_NEXT_MAP((short) 111),

  STEP2460_CLIC_MONSTER((short) 112),

  STEP2500_TUTO14_END_SECOND_FIGHT((short) 113),

  STEP2600_TUTO15_END_TUTO((short) 114),

  STEP2620_CLIC_YAKASI((short) 115),

  STEP2640_END_DIALOG((short) 116),

  CLICK_ON_BUTTON((short) 151),

  DISPLAY_MENU((short) 152),

  CATEGORY_MAP_OPENED((short) 544),

  CATEGORY_MAP_PERSONALIZED_LANDMARK_PLACED((short) 546),

  CATEGORY_MAP_QUEST_LANDMARK_ACTIVATED((short) 547),

  CATEGORY_MAP_MOVED((short) 549),

  CATEGORY_MAP_ZOOM((short) 550),

  CATEGORY_MINIMAP_MOVED((short) 545),

  CATEGORY_MINIMAP_ZOOM((short) 548),
  ;

  public final short value;

  private StatisticTypeEnum(short value)
  {
    this.value = value;
  }

  public static Optional<StatisticTypeEnum> valueOf(short value)
  {
    for (StatisticTypeEnum it : values())
  {
      if (it.value == value)
  {
        return Optional.of(it);
      }
    }
    return Optional.empty();
  }
}
