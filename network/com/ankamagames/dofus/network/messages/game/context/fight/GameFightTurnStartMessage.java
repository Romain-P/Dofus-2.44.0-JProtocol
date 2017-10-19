// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnStartMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 714;
  // f64
  public double id;
  // vi32
  public int waitTime;

  public GameFightTurnStartMessage()
  {}

  public GameFightTurnStartMessage(double id, int waitTime)
  {
    this.id = id;
    this.waitTime = waitTime;
  }

  @Override
  public int getProtocolId()
  {
    return 714;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.id);
    writer.write_vi32(this.waitTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_f64();
    this.waitTime = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GameFightTurnStartMessage(" + "id=" + this.id + ", waitTime=" + this.waitTime + ')';
  }
}
