// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterReplayWithRemodelRequestMessage
    extends com.ankamagames.dofus.network.messages.game.character.replay
        .CharacterReplayRequestMessage {
  public static final int PROTOCOL_ID = 6551;
  // com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation
  public com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation remodel;

  public CharacterReplayWithRemodelRequestMessage()
  {}

  public CharacterReplayWithRemodelRequestMessage(
      java.math.BigInteger characterId,
      com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation remodel)
  {

    super(characterId);
    this.remodel = remodel;
  }

  @Override
  public int getProtocolId()
  {
    return 6551;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.remodel.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.remodel =
        new com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation();
    this.remodel.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "CharacterReplayWithRemodelRequestMessage("
        + "characterId="
        + this.characterId
        + ", remodel="
        + this.remodel
        + ')';
  }
}
