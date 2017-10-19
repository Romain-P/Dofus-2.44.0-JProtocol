// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextKickMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6081;
  // f64
  public double targetId;

  public GameContextKickMessage()
  {}

  public GameContextKickMessage(double targetId)
  {
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 6081;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.targetId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameContextKickMessage(" + "targetId=" + this.targetId + ')';
  }
}
