// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionsAllAttributionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6537;
  // ui64
  public java.math.BigInteger characterId;

  public StartupActionsAllAttributionMessage()
  {}

  public StartupActionsAllAttributionMessage(java.math.BigInteger characterId)
  {
    this.characterId = characterId;
  }

  @Override
  public int getProtocolId()
  {
    return 6537;
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

    return "StartupActionsAllAttributionMessage(" + "characterId=" + this.characterId + ')';
  }
}
