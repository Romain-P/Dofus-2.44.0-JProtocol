// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicPongMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 183;
  // bool
  public boolean quiet;

  public BasicPongMessage()
  {}

  public BasicPongMessage(boolean quiet)
  {
    this.quiet = quiet;
  }

  @Override
  public int getProtocolId()
  {
    return 183;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.quiet);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.quiet = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "BasicPongMessage(" + "quiet=" + this.quiet + ')';
  }
}
