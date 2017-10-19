// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightSpectatePlayerRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6474;
  // ui64
  public java.math.BigInteger playerId;

  public GameFightSpectatePlayerRequestMessage()
  {}

  public GameFightSpectatePlayerRequestMessage(java.math.BigInteger playerId)
  {
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6474;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GameFightSpectatePlayerRequestMessage(" + "playerId=" + this.playerId + ')';
  }
}
