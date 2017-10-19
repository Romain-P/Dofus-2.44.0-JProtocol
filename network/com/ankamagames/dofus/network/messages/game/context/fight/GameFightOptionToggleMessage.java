// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightOptionToggleMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 707;
  // i8
  public byte option;

  public GameFightOptionToggleMessage()
  {}

  public GameFightOptionToggleMessage(byte option)
  {
    this.option = option;
  }

  @Override
  public int getProtocolId()
  {
    return 707;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.option);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.option = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameFightOptionToggleMessage(" + "option=" + this.option + ')';
  }
}
