// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SequenceNumberMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6317;
  // ui16
  public int number;

  public SequenceNumberMessage()
  {}

  public SequenceNumberMessage(int number)
  {
    this.number = number;
  }

  @Override
  public int getProtocolId()
  {
    return 6317;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.number);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.number = reader.read_ui16();
  }

  @Override
  public String toString()
  {

    return "SequenceNumberMessage(" + "number=" + this.number + ')';
  }
}
