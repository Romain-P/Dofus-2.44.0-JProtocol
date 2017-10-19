// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapChangeOrientationRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 945;
  // i8
  public byte direction;

  public GameMapChangeOrientationRequestMessage()
  {}

  public GameMapChangeOrientationRequestMessage(byte direction)
  {
    this.direction = direction;
  }

  @Override
  public int getProtocolId()
  {
    return 945;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.direction);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.direction = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameMapChangeOrientationRequestMessage(" + "direction=" + this.direction + ')';
  }
}
