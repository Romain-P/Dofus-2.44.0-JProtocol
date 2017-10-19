// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismInfoJoinLeaveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5844;
  // bool
  public boolean join;

  public PrismInfoJoinLeaveRequestMessage()
  {}

  public PrismInfoJoinLeaveRequestMessage(boolean join)
  {
    this.join = join;
  }

  @Override
  public int getProtocolId()
  {
    return 5844;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.join);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.join = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "PrismInfoJoinLeaveRequestMessage(" + "join=" + this.join + ')';
  }
}
