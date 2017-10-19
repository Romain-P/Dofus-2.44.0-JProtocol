// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRefreshMonsterBoostsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6618;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts
  public com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[] monsterBoosts;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts
  public com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[] familyBoosts;

  public GameRefreshMonsterBoostsMessage()
  {}

  public GameRefreshMonsterBoostsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[] monsterBoosts,
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[] familyBoosts)
  {
    this.monsterBoosts = monsterBoosts;
    this.familyBoosts = familyBoosts;
  }

  public GameRefreshMonsterBoostsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts>
          monsterBoosts,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts>
          familyBoosts)
  {
    this.monsterBoosts =
        monsterBoosts.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[]::new);
    this.familyBoosts =
        familyBoosts.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6618;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(monsterBoosts.length);

    for (int i = 0; i < monsterBoosts.length; i++)
  {

      monsterBoosts[i].serialize(writer);
    }
    writer.write_ui16(familyBoosts.length);

    for (int i = 0; i < familyBoosts.length; i++)
  {

      familyBoosts[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int monsterBoosts_length = reader.read_ui16();
    this.monsterBoosts =
        new com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts
            [monsterBoosts_length];

    for (int i = 0; i < monsterBoosts_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts monsterBoosts_it =
          new com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts();

      monsterBoosts_it.deserialize(reader);
      this.monsterBoosts[i] = monsterBoosts_it;
    }

    int familyBoosts_length = reader.read_ui16();
    this.familyBoosts =
        new com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts
            [familyBoosts_length];

    for (int i = 0; i < familyBoosts_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts familyBoosts_it =
          new com.ankamagames.dofus.network.types.game.context.roleplay.MonsterBoosts();

      familyBoosts_it.deserialize(reader);
      this.familyBoosts[i] = familyBoosts_it;
    }
  }

  @Override
  public String toString()
  {

    return "GameRefreshMonsterBoostsMessage("
        + "monsterBoosts="
        + java.util.Arrays.toString(this.monsterBoosts)
        + ", familyBoosts="
        + java.util.Arrays.toString(this.familyBoosts)
        + ')';
  }
}
