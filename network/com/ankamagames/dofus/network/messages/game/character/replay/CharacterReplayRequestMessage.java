// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.replay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterReplayRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 167;
  // ui64
  public java.math.BigInteger characterId;

  public CharacterReplayRequestMessage()
  {}

  public CharacterReplayRequestMessage(java.math.BigInteger characterId)
  {
    this.characterId = characterId;
  }

  @Override
  public int getProtocolId()
  {
    return 167;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.characterId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.characterId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "CharacterReplayRequestMessage(" + "characterId=" + this.characterId + ')';
  }
}
