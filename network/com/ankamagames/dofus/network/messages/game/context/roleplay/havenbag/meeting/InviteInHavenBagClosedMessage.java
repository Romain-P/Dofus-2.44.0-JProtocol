// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InviteInHavenBagClosedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6645;
  // com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
      hostInformations;

  public InviteInHavenBagClosedMessage()
  {}

  public InviteInHavenBagClosedMessage(
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
          hostInformations)
  {
    this.hostInformations = hostInformations;
  }

  @Override
  public int getProtocolId()
  {
    return 6645;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.hostInformations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.hostInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations();
    this.hostInformations.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "InviteInHavenBagClosedMessage(" + "hostInformations=" + this.hostInformations + ')';
  }
}
