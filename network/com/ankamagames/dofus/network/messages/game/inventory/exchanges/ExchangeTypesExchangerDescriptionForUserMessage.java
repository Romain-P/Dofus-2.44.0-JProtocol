// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeTypesExchangerDescriptionForUserMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5765;
  // array,vi32
  public int[] typeDescription;

  public ExchangeTypesExchangerDescriptionForUserMessage()
  {}

  public ExchangeTypesExchangerDescriptionForUserMessage(int[] typeDescription)
  {
    this.typeDescription = typeDescription;
  }

  @Override
  public int getProtocolId()
  {
    return 5765;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(typeDescription.length);
    writer.write_array_vi32(this.typeDescription);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int typeDescription_length = reader.read_ui16();
    this.typeDescription = reader.read_array_vi32(typeDescription_length);
  }

  @Override
  public String toString()
  {

    return "ExchangeTypesExchangerDescriptionForUserMessage("
        + "typeDescription="
        + java.util.Arrays.toString(this.typeDescription)
        + ')';
  }
}
