// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharactersListMessage
    extends com.ankamagames.dofus.network.messages.game.character.choice
        .BasicCharactersListMessage {
  public static final int PROTOCOL_ID = 151;
  // bool
  public boolean hasStartupActions;

  public CharactersListMessage()
  {}

  public CharactersListMessage(
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations[]
          characters,
      boolean hasStartupActions)
  {

    super(characters);
    this.hasStartupActions = hasStartupActions;
  }

  public CharactersListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations>
          characters,
      boolean hasStartupActions)
  {

    super(characters);
    this.hasStartupActions = hasStartupActions;
  }

  @Override
  public int getProtocolId()
  {
    return 151;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.hasStartupActions);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.hasStartupActions = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "CharactersListMessage("
        + "characters="
        + java.util.Arrays.toString(this.characters)
        + ", hasStartupActions="
        + this.hasStartupActions
        + ')';
  }
}
