// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseSearchMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5806;
  // vi32
  public int type;
  // vi16
  public short genId;

  public ExchangeBidHouseSearchMessage()
  {}

  public ExchangeBidHouseSearchMessage(int type, short genId)
  {
    this.type = type;
    this.genId = genId;
  }

  @Override
  public int getProtocolId()
  {
    return 5806;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.type);
    writer.write_vi16(this.genId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.type = reader.read_vi32();
    this.genId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseSearchMessage(" + "type=" + this.type + ", genId=" + this.genId + ')';
  }
}
