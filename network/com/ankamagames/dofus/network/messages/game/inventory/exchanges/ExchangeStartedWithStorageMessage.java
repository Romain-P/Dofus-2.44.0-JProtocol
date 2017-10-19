// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartedWithStorageMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeStartedMessage {
  public static final int PROTOCOL_ID = 6236;
  // vi32
  public int storageMaxSlot;

  public ExchangeStartedWithStorageMessage()
  {}

  public ExchangeStartedWithStorageMessage(byte exchangeType, int storageMaxSlot)
  {

    super(exchangeType);
    this.storageMaxSlot = storageMaxSlot;
  }

  @Override
  public int getProtocolId()
  {
    return 6236;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.storageMaxSlot);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.storageMaxSlot = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ExchangeStartedWithStorageMessage("
        + "exchangeType="
        + this.exchangeType
        + ", storageMaxSlot="
        + this.storageMaxSlot
        + ')';
  }
}
