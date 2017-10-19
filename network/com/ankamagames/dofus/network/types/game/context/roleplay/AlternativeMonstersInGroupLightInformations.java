// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlternativeMonstersInGroupLightInformations extends NetworkType {
  public static final int PROTOCOL_ID = 394;
  // i32
  public int playerCount;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations[]
      monsters;

  public AlternativeMonstersInGroupLightInformations()
  {}

  public AlternativeMonstersInGroupLightInformations(
      int playerCount,
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations[]
          monsters)
  {
    this.playerCount = playerCount;
    this.monsters = monsters;
  }

  public AlternativeMonstersInGroupLightInformations(
      int playerCount,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay
                  .MonsterInGroupLightInformations>
          monsters)
  {
    this.playerCount = playerCount;
    this.monsters =
        monsters.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay
                        .MonsterInGroupLightInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 394;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.playerCount);
    writer.write_ui16(monsters.length);

    for (int i = 0; i < monsters.length; i++)
  {

      monsters[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerCount = reader.read_i32();

    int monsters_length = reader.read_ui16();
    this.monsters =
        new com.ankamagames.dofus.network.types.game.context.roleplay
                .MonsterInGroupLightInformations[monsters_length];

    for (int i = 0; i < monsters_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
          monsters_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay
                  .MonsterInGroupLightInformations();

      monsters_it.deserialize(reader);
      this.monsters[i] = monsters_it;
    }
  }

  @Override
  public String toString()
  {

    return "AlternativeMonstersInGroupLightInformations("
        + "playerCount="
        + this.playerCount
        + ", monsters="
        + java.util.Arrays.toString(this.monsters)
        + ')';
  }
}
