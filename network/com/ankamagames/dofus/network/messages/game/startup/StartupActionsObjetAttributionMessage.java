// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionsObjetAttributionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1303;
  // i32
  public int actionId;
  // ui64
  public java.math.BigInteger characterId;

  public StartupActionsObjetAttributionMessage()
  {}

  public StartupActionsObjetAttributionMessage(int actionId, java.math.BigInteger characterId)
  {
    this.actionId = actionId;
    this.characterId = characterId;
  }

  @Override
  public int getProtocolId()
  {
    return 1303;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.actionId);
    writer.write_ui64(this.characterId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.actionId = reader.read_i32();
    this.characterId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "StartupActionsObjetAttributionMessage("
        + "actionId="
        + this.actionId
        + ", characterId="
        + this.characterId
        + ')';
  }
}
