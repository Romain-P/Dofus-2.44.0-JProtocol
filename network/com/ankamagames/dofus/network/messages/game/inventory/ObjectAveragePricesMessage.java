// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectAveragePricesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6335;
  // array,vi16
  public short[] ids;
  // array,ui64
  public java.math.BigInteger[] avgPrices;

  public ObjectAveragePricesMessage()
  {}

  public ObjectAveragePricesMessage(short[] ids, java.math.BigInteger[] avgPrices)
  {
    this.ids = ids;
    this.avgPrices = avgPrices;
  }

  @Override
  public int getProtocolId()
  {
    return 6335;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(ids.length);
    writer.write_array_vi16(this.ids);
    writer.write_ui16(avgPrices.length);
    writer.write_array_ui64(this.avgPrices);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int ids_length = reader.read_ui16();
    this.ids = reader.read_array_vi16(ids_length);

    int avgPrices_length = reader.read_ui16();
    this.avgPrices = reader.read_array_ui64(avgPrices_length);
  }

  @Override
  public String toString()
  {

    return "ObjectAveragePricesMessage("
        + "ids="
        + java.util.Arrays.toString(this.ids)
        + ", avgPrices="
        + java.util.Arrays.toString(this.avgPrices)
        + ')';
  }
}
