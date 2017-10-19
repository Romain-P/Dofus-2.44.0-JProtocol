// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5807;
  // vi16
  public short id;

  public ExchangeBidHouseListMessage()
  {}

  public ExchangeBidHouseListMessage(short id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 5807;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseListMessage(" + "id=" + this.id + ')';
  }
}
