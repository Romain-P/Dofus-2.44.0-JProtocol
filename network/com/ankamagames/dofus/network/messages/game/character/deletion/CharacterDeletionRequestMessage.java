// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.deletion;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterDeletionRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 165;
  // ui64
  public java.math.BigInteger characterId;
  // str
  public java.lang.String secretAnswerHash;

  public CharacterDeletionRequestMessage()
  {}

  public CharacterDeletionRequestMessage(
      java.math.BigInteger characterId, java.lang.String secretAnswerHash)
  {
    this.characterId = characterId;
    this.secretAnswerHash = secretAnswerHash;
  }

  @Override
  public int getProtocolId()
  {
    return 165;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.characterId);
    writer.write_str(this.secretAnswerHash);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.characterId = reader.read_ui64();
    this.secretAnswerHash = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "CharacterDeletionRequestMessage("
        + "characterId="
        + this.characterId
        + ", secretAnswerHash="
        + this.secretAnswerHash
        + ')';
  }
}
