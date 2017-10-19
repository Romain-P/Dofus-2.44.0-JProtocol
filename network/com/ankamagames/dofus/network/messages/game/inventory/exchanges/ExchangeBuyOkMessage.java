// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBuyOkMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5759;

  public ExchangeBuyOkMessage()
  {}

  public static final ExchangeBuyOkMessage i = new ExchangeBuyOkMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 5759;
  }

  @Override
  public void serialize(DataWriter writer)
  {}

  @Override
  public void deserialize(DataReader reader)
  {}

  @Override
  public String toString()
  {

    return "ExchangeBuyOkMessage";
  }
}