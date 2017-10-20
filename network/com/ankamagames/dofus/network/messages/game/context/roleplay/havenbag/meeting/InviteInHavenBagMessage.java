// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InviteInHavenBagMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6642;
  // com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
      guestInformations;
  // bool
  public boolean accept;

  public InviteInHavenBagMessage() {}

  public InviteInHavenBagMessage(
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
          guestInformations,
      boolean accept) {
    this.guestInformations = guestInformations;
    this.accept = accept;
  }

  @Override
  public int getProtocolId() {
    return 6642;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.guestInformations.serialize(writer);
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guestInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations();
    this.guestInformations.deserialize(reader);
    this.accept = reader.read_bool();
  }

  @Override
  public String toString() {

    return "InviteInHavenBagMessage("
        + "guestInformations="
        + this.guestInformations
        + ", accept="
        + this.accept
        + ')';
  }
}
