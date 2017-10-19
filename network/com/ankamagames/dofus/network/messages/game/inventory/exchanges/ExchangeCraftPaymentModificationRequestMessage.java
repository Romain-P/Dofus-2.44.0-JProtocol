// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftPaymentModificationRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6579;
  // ui64
  public java.math.BigInteger quantity;

  public ExchangeCraftPaymentModificationRequestMessage()
  {}

  public ExchangeCraftPaymentModificationRequestMessage(java.math.BigInteger quantity)
  {
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId()
  {
    return 6579;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.quantity = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftPaymentModificationRequestMessage(" + "quantity=" + this.quantity + ')';
  }
}
