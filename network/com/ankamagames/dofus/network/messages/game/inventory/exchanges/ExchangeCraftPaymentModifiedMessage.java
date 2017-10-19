// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftPaymentModifiedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6578;
  // ui64
  public java.math.BigInteger goldSum;

  public ExchangeCraftPaymentModifiedMessage()
  {}

  public ExchangeCraftPaymentModifiedMessage(java.math.BigInteger goldSum)
  {
    this.goldSum = goldSum;
  }

  @Override
  public int getProtocolId()
  {
    return 6578;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.goldSum);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.goldSum = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftPaymentModifiedMessage(" + "goldSum=" + this.goldSum + ')';
  }
}
