// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InviteInHavenBagOfferMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6643;
  // com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
      hostInformations;
  // vi32
  public int timeLeftBeforeCancel;

  public InviteInHavenBagOfferMessage()
  {}

  public InviteInHavenBagOfferMessage(
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
          hostInformations,
      int timeLeftBeforeCancel)
  {
    this.hostInformations = hostInformations;
    this.timeLeftBeforeCancel = timeLeftBeforeCancel;
  }

  @Override
  public int getProtocolId()
  {
    return 6643;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.hostInformations.serialize(writer);
    writer.write_vi32(this.timeLeftBeforeCancel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.hostInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations();
    this.hostInformations.deserialize(reader);
    this.timeLeftBeforeCancel = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "InviteInHavenBagOfferMessage("
        + "hostInformations="
        + this.hostInformations
        + ", timeLeftBeforeCancel="
        + this.timeLeftBeforeCancel
        + ')';
  }
}
