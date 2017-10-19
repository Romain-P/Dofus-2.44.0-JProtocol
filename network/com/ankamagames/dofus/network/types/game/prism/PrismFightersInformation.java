// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightersInformation extends NetworkType {
  public static final int PROTOCOL_ID = 443;
  // vi16
  public short subAreaId;
  // com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
  public com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
      waitingForHelpInfo;
  // array,com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
      allyCharactersInformations;
  // array,com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
      enemyCharactersInformations;

  public PrismFightersInformation()
  {}

  public PrismFightersInformation(
      short subAreaId,
      com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
          waitingForHelpInfo,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
          allyCharactersInformations,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
          enemyCharactersInformations)
  {
    this.subAreaId = subAreaId;
    this.waitingForHelpInfo = waitingForHelpInfo;
    this.allyCharactersInformations = allyCharactersInformations;
    this.enemyCharactersInformations = enemyCharactersInformations;
  }

  public PrismFightersInformation(
      short subAreaId,
      com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
          waitingForHelpInfo,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character
                  .CharacterMinimalPlusLookInformations>
          allyCharactersInformations,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character
                  .CharacterMinimalPlusLookInformations>
          enemyCharactersInformations)
  {
    this.subAreaId = subAreaId;
    this.waitingForHelpInfo = waitingForHelpInfo;
    this.allyCharactersInformations =
        allyCharactersInformations.toArray(
            com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
                    []
                ::new);
    this.enemyCharactersInformations =
        enemyCharactersInformations.toArray(
            com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 443;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.subAreaId);
    this.waitingForHelpInfo.serialize(writer);
    writer.write_ui16(allyCharactersInformations.length);

    for (int i = 0; i < allyCharactersInformations.length; i++)
  {

      writer.write_ui16(allyCharactersInformations[i].getProtocolId());

      allyCharactersInformations[i].serialize(writer);
    }
    writer.write_ui16(enemyCharactersInformations.length);

    for (int i = 0; i < enemyCharactersInformations.length; i++)
  {

      writer.write_ui16(enemyCharactersInformations[i].getProtocolId());

      enemyCharactersInformations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.subAreaId = reader.read_vi16();
    this.waitingForHelpInfo =
        new com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo();
    this.waitingForHelpInfo.deserialize(reader);

    int allyCharactersInformations_length = reader.read_ui16();
    this.allyCharactersInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
            [allyCharactersInformations_length];

    for (int i = 0; i < allyCharactersInformations_length; i++)
  {

      int allyCharactersInformations_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
          allyCharactersInformations_it =
              (com.ankamagames.dofus.network.types.game.character
                      .CharacterMinimalPlusLookInformations)
                  InternalProtocolTypeManager.get(allyCharactersInformations_it_typeId);

      allyCharactersInformations_it.deserialize(reader);
      this.allyCharactersInformations[i] = allyCharactersInformations_it;
    }

    int enemyCharactersInformations_length = reader.read_ui16();
    this.enemyCharactersInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
            [enemyCharactersInformations_length];

    for (int i = 0; i < enemyCharactersInformations_length; i++)
  {

      int enemyCharactersInformations_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
          enemyCharactersInformations_it =
              (com.ankamagames.dofus.network.types.game.character
                      .CharacterMinimalPlusLookInformations)
                  InternalProtocolTypeManager.get(enemyCharactersInformations_it_typeId);

      enemyCharactersInformations_it.deserialize(reader);
      this.enemyCharactersInformations[i] = enemyCharactersInformations_it;
    }
  }

  @Override
  public String toString()
  {

    return "PrismFightersInformation("
        + "subAreaId="
        + this.subAreaId
        + ", waitingForHelpInfo="
        + this.waitingForHelpInfo
        + ", allyCharactersInformations="
        + java.util.Arrays.toString(this.allyCharactersInformations)
        + ", enemyCharactersInformations="
        + java.util.Arrays.toString(this.enemyCharactersInformations)
        + ')';
  }
}
