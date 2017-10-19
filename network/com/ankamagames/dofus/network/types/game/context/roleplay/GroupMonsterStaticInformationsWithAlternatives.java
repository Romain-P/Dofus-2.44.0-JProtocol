// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GroupMonsterStaticInformationsWithAlternatives
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GroupMonsterStaticInformations {
  public static final int PROTOCOL_ID = 396;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.AlternativeMonstersInGroupLightInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay
          .AlternativeMonstersInGroupLightInformations[]
      alternatives;

  public GroupMonsterStaticInformationsWithAlternatives()
  {}

  public GroupMonsterStaticInformationsWithAlternatives(
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
          mainCreatureLightInfos,
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations[]
          underlings,
      com.ankamagames.dofus.network.types.game.context.roleplay
                  .AlternativeMonstersInGroupLightInformations
              []
          alternatives)
  {

    super(mainCreatureLightInfos, underlings);
    this.alternatives = alternatives;
  }

  public GroupMonsterStaticInformationsWithAlternatives(
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
          mainCreatureLightInfos,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations>
          underlings,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay
                  .AlternativeMonstersInGroupLightInformations>
          alternatives)
  {

    super(mainCreatureLightInfos, underlings);
    this.alternatives =
        alternatives.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay
                        .AlternativeMonstersInGroupLightInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 396;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(alternatives.length);

    for (int i = 0; i < alternatives.length; i++)
  {

      alternatives[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int alternatives_length = reader.read_ui16();
    this.alternatives =
        new com.ankamagames.dofus.network.types.game.context.roleplay
                .AlternativeMonstersInGroupLightInformations[alternatives_length];

    for (int i = 0; i < alternatives_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay
              .AlternativeMonstersInGroupLightInformations
          alternatives_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay
                  .AlternativeMonstersInGroupLightInformations();

      alternatives_it.deserialize(reader);
      this.alternatives[i] = alternatives_it;
    }
  }

  @Override
  public String toString()
  {

    return "GroupMonsterStaticInformationsWithAlternatives("
        + "mainCreatureLightInfos="
        + this.mainCreatureLightInfos
        + ", underlings="
        + java.util.Arrays.toString(this.underlings)
        + ", alternatives="
        + java.util.Arrays.toString(this.alternatives)
        + ')';
  }
}
