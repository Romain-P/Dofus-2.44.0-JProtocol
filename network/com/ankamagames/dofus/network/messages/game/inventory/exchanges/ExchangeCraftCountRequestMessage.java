// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftCountRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6597;
  // vi32
  public int count;

  public ExchangeCraftCountRequestMessage()
  {}

  public ExchangeCraftCountRequestMessage(int count)
  {
    this.count = count;
  }

  @Override
  public int getProtocolId()
  {
    return 6597;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.count);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.count = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftCountRequestMessage(" + "count=" + this.count + ')';
  }
}
