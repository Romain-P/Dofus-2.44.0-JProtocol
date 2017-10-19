// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5505;
  // i8
  public byte exchangeType;

  public ExchangeRequestMessage()
  {}

  public ExchangeRequestMessage(byte exchangeType)
  {
    this.exchangeType = exchangeType;
  }

  @Override
  public int getProtocolId()
  {
    return 5505;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.exchangeType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.exchangeType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ExchangeRequestMessage(" + "exchangeType=" + this.exchangeType + ')';
  }
}
