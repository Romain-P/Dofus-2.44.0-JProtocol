// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkNpcTradeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5785;
  // f64
  public double npcId;

  public ExchangeStartOkNpcTradeMessage()
  {}

  public ExchangeStartOkNpcTradeMessage(double npcId)
  {
    this.npcId = npcId;
  }

  @Override
  public int getProtocolId()
  {
    return 5785;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.npcId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.npcId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "ExchangeStartOkNpcTradeMessage(" + "npcId=" + this.npcId + ')';
  }
}
