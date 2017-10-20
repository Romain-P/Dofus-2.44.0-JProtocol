// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharactersListWithModificationsMessage
    extends com.ankamagames.dofus.network.messages.game.character.choice.CharactersListMessage {
  public static final int PROTOCOL_ID = 6120;
  // array,com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation
  public com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation[]
      charactersToRecolor;
  // array,i32
  public int[] charactersToRename;
  // array,i32
  public int[] unusableCharacters;
  // array,com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation
  public com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation[]
      charactersToRelook;

  public CharactersListWithModificationsMessage() {}

  public CharactersListWithModificationsMessage(
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
          characters,
      boolean hasStartupActions,
      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation[]
          charactersToRecolor,
      int[] charactersToRename,
      int[] unusableCharacters,
      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation[]
          charactersToRelook) {

    super(characters, hasStartupActions);
    this.charactersToRecolor = charactersToRecolor;
    this.charactersToRename = charactersToRename;
    this.unusableCharacters = unusableCharacters;
    this.charactersToRelook = charactersToRelook;
  }

  public CharactersListWithModificationsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations>
          characters,
      boolean hasStartupActions,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRecolorInformation>
          charactersToRecolor,
      int[] charactersToRename,
      int[] unusableCharacters,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRelookInformation>
          charactersToRelook) {

    super(characters, hasStartupActions);
    this.charactersToRecolor =
        charactersToRecolor.toArray(
            com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation
                    []
                ::new);
    this.charactersToRename = charactersToRename;
    this.unusableCharacters = unusableCharacters;
    this.charactersToRelook =
        charactersToRelook.toArray(
            com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6120;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(charactersToRecolor.length);

    for (int i = 0; i < charactersToRecolor.length; i++) {

      charactersToRecolor[i].serialize(writer);
    }
    writer.write_ui16(charactersToRename.length);
    writer.write_array_i32(this.charactersToRename);
    writer.write_ui16(unusableCharacters.length);
    writer.write_array_i32(this.unusableCharacters);
    writer.write_ui16(charactersToRelook.length);

    for (int i = 0; i < charactersToRelook.length; i++) {

      charactersToRelook[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int charactersToRecolor_length = reader.read_ui16();
    this.charactersToRecolor =
        new com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation
            [charactersToRecolor_length];

    for (int i = 0; i < charactersToRecolor_length; i++) {

      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRecolorInformation
          charactersToRecolor_it =
              new com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRecolorInformation();

      charactersToRecolor_it.deserialize(reader);
      this.charactersToRecolor[i] = charactersToRecolor_it;
    }

    int charactersToRename_length = reader.read_ui16();
    this.charactersToRename = reader.read_array_i32(charactersToRename_length);

    int unusableCharacters_length = reader.read_ui16();
    this.unusableCharacters = reader.read_array_i32(unusableCharacters_length);

    int charactersToRelook_length = reader.read_ui16();
    this.charactersToRelook =
        new com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation
            [charactersToRelook_length];

    for (int i = 0; i < charactersToRelook_length; i++) {

      com.ankamagames.dofus.network.types.game.character.choice.CharacterToRelookInformation
          charactersToRelook_it =
              new com.ankamagames.dofus.network.types.game.character.choice
                  .CharacterToRelookInformation();

      charactersToRelook_it.deserialize(reader);
      this.charactersToRelook[i] = charactersToRelook_it;
    }
  }

  @Override
  public String toString() {

    return "CharactersListWithModificationsMessage("
        + "characters="
        + java.util.Arrays.toString(this.characters)
        + ", hasStartupActions="
        + this.hasStartupActions
        + ", charactersToRecolor="
        + java.util.Arrays.toString(this.charactersToRecolor)
        + ", charactersToRename="
        + java.util.Arrays.toString(this.charactersToRename)
        + ", unusableCharacters="
        + java.util.Arrays.toString(this.unusableCharacters)
        + ", charactersToRelook="
        + java.util.Arrays.toString(this.charactersToRelook)
        + ')';
  }
}
