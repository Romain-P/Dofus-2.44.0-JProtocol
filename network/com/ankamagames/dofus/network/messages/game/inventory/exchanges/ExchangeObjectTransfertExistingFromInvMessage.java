// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectTransfertExistingFromInvMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6325;

  public ExchangeObjectTransfertExistingFromInvMessage() {}

  public static final ExchangeObjectTransfertExistingFromInvMessage i =
      new ExchangeObjectTransfertExistingFromInvMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6325;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "ExchangeObjectTransfertExistingFromInvMessage";
  }
}
