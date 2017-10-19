// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareSubscribeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6666;
  // f64
  public double dareId;
  // bool
  public boolean subscribe;

  public DareSubscribeRequestMessage()
  {}

  public DareSubscribeRequestMessage(double dareId, boolean subscribe)
  {
    this.dareId = dareId;
    this.subscribe = subscribe;
  }

  @Override
  public int getProtocolId()
  {
    return 6666;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.dareId);
    writer.write_bool(this.subscribe);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dareId = reader.read_f64();
    this.subscribe = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "DareSubscribeRequestMessage("
        + "dareId="
        + this.dareId
        + ", subscribe="
        + this.subscribe
        + ')';
  }
}
