// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayShowActorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5632;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
      informations;

  public GameRolePlayShowActorMessage() {}

  public GameRolePlayShowActorMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
          informations) {
    this.informations = informations;
  }

  @Override
  public int getProtocolId() {
    return 5632;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.informations.getProtocolId());
    this.informations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    int informations_typeId = reader.read_ui16();
    this.informations =
        (com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations)
            InternalProtocolTypeManager.get(informations_typeId);
    this.informations.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameRolePlayShowActorMessage(" + "informations=" + this.informations + ')';
  }
}
