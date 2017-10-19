// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnReadyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 716;
  // bool
  public boolean isReady;

  public GameFightTurnReadyMessage()
  {}

  public GameFightTurnReadyMessage(boolean isReady)
  {
    this.isReady = isReady;
  }

  @Override
  public int getProtocolId()
  {
    return 716;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.isReady);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.isReady = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GameFightTurnReadyMessage(" + "isReady=" + this.isReady + ')';
  }
}
