// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnResumeMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnStartMessage {
  public static final int PROTOCOL_ID = 6307;
  // vi32
  public int remainingTime;

  public GameFightTurnResumeMessage()
  {}

  public GameFightTurnResumeMessage(double id, int waitTime, int remainingTime)
  {

    super(id, waitTime);
    this.remainingTime = remainingTime;
  }

  @Override
  public int getProtocolId()
  {
    return 6307;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.remainingTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.remainingTime = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GameFightTurnResumeMessage("
        + "id="
        + this.id
        + ", waitTime="
        + this.waitTime
        + ", remainingTime="
        + this.remainingTime
        + ')';
  }
}
