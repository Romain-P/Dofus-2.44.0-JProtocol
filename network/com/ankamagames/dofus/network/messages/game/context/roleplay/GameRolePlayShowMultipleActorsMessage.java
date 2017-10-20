// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayShowMultipleActorsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6712;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations[]
      informationsList;

  public GameRolePlayShowMultipleActorsMessage() {}

  public GameRolePlayShowMultipleActorsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations[]
          informationsList) {
    this.informationsList = informationsList;
  }

  public GameRolePlayShowMultipleActorsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay
                  .GameRolePlayActorInformations>
          informationsList) {
    this.informationsList =
        informationsList.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6712;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(informationsList.length);

    for (int i = 0; i < informationsList.length; i++) {

      writer.write_ui16(informationsList[i].getProtocolId());

      informationsList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int informationsList_length = reader.read_ui16();
    this.informationsList =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
            [informationsList_length];

    for (int i = 0; i < informationsList_length; i++) {

      int informationsList_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
          informationsList_it =
              (com.ankamagames.dofus.network.types.game.context.roleplay
                      .GameRolePlayActorInformations)
                  InternalProtocolTypeManager.get(informationsList_it_typeId);

      informationsList_it.deserialize(reader);
      this.informationsList[i] = informationsList_it;
    }
  }

  @Override
  public String toString() {

    return "GameRolePlayShowMultipleActorsMessage("
        + "informationsList="
        + java.util.Arrays.toString(this.informationsList)
        + ')';
  }
}
