// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveElementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 251;
  // f64
  public double id;

  public GameContextRemoveElementMessage()
  {}

  public GameContextRemoveElementMessage(double id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 251;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameContextRemoveElementMessage(" + "id=" + this.id + ')';
  }
}
