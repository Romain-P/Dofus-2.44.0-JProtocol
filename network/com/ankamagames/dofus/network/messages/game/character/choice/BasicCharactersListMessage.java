// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicCharactersListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6475;
  // array,com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations
  public com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
      characters;

  public BasicCharactersListMessage() {}

  public BasicCharactersListMessage(
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
          characters) {
    this.characters = characters;
  }

  public BasicCharactersListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations>
          characters) {
    this.characters =
        characters.toArray(
            com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6475;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(characters.length);

    for (int i = 0; i < characters.length; i++) {

      writer.write_ui16(characters[i].getProtocolId());

      characters[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int characters_length = reader.read_ui16();
    this.characters =
        new com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations
            [characters_length];

    for (int i = 0; i < characters_length; i++) {

      int characters_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations
          characters_it =
              (com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations)
                  InternalProtocolTypeManager.get(characters_it_typeId);

      characters_it.deserialize(reader);
      this.characters[i] = characters_it;
    }
  }

  @Override
  public String toString() {

    return "BasicCharactersListMessage("
        + "characters="
        + java.util.Arrays.toString(this.characters)
        + ')';
  }
}
