// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeRequestedTradeMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeRequestedMessage {
  public static final int PROTOCOL_ID = 5523;
  // ui64
  public java.math.BigInteger source;
  // ui64
  public java.math.BigInteger target;

  public ExchangeRequestedTradeMessage()
  {}

  public ExchangeRequestedTradeMessage(
      byte exchangeType, java.math.BigInteger source, java.math.BigInteger target)
  {

    super(exchangeType);
    this.source = source;
    this.target = target;
  }

  @Override
  public int getProtocolId()
  {
    return 5523;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.source);
    writer.write_ui64(this.target);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.source = reader.read_ui64();
    this.target = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "ExchangeRequestedTradeMessage("
        + "exchangeType="
        + this.exchangeType
        + ", source="
        + this.source
        + ", target="
        + this.target
        + ')';
  }
}
