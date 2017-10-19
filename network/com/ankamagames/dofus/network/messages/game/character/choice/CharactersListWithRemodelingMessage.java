// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharactersListWithRemodelingMessage
    extends com.ankamagames.dofus.network.messages.game.character.choice.CharactersListMessage {
  public static final int PROTOCOL_ID = 6550;
  // array,com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations
  public com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations[]
      charactersToRemodel;

  public CharactersListWithRemodelingMessage()
  {}

  public CharactersListWithRemodelingMessage(
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
          characters,
      boolean hasStartupActions,
      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations[]
          charactersToRemodel)
  {

    super(characters, hasStartupActions);
    this.charactersToRemodel = charactersToRemodel;
  }

  public CharactersListWithRemodelingMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations>
          characters,
      boolean hasStartupActions,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRemodelInformations>
          charactersToRemodel)
  {

    super(characters, hasStartupActions);
    this.charactersToRemodel =
        charactersToRemodel.toArray(
            com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6550;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(charactersToRemodel.length);

    for (int i = 0; i < charactersToRemodel.length; i++)
  {

      charactersToRemodel[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int charactersToRemodel_length = reader.read_ui16();
    this.charactersToRemodel =
        new com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations
            [charactersToRemodel_length];

    for (int i = 0; i < charactersToRemodel_length; i++)
  {

      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRemodelInformations
          charactersToRemodel_it =
              new com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRemodelInformations();

      charactersToRemodel_it.deserialize(reader);
      this.charactersToRemodel[i] = charactersToRemodel_it;
    }
  }

  @Override
  public String toString()
  {

    return "CharactersListWithRemodelingMessage("
        + "characters="
        + java.util.Arrays.toString(this.characters)
        + ", hasStartupActions="
        + this.hasStartupActions
        + ", charactersToRemodel="
        + java.util.Arrays.toString(this.charactersToRemodel)
        + ')';
  }
}
