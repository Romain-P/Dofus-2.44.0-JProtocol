// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightHumanReadyStateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 740;
  // ui64
  public java.math.BigInteger characterId;
  // bool
  public boolean isReady;

  public GameFightHumanReadyStateMessage()
  {}

  public GameFightHumanReadyStateMessage(java.math.BigInteger characterId, boolean isReady)
  {
    this.characterId = characterId;
    this.isReady = isReady;
  }

  @Override
  public int getProtocolId()
  {
    return 740;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.characterId);
    writer.write_bool(this.isReady);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.characterId = reader.read_ui64();
    this.isReady = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GameFightHumanReadyStateMessage("
        + "characterId="
        + this.characterId
        + ", isReady="
        + this.isReady
        + ')';
  }
}
