// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeHandleMountsStableMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6562;
  // i8
  public byte actionType;
  // array,vi32
  public int[] ridesId;

  public ExchangeHandleMountsStableMessage()
  {}

  public ExchangeHandleMountsStableMessage(byte actionType, int[] ridesId)
  {
    this.actionType = actionType;
    this.ridesId = ridesId;
  }

  @Override
  public int getProtocolId()
  {
    return 6562;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.actionType);
    writer.write_ui16(ridesId.length);
    writer.write_array_vi32(this.ridesId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.actionType = reader.read_i8();

    int ridesId_length = reader.read_ui16();
    this.ridesId = reader.read_array_vi32(ridesId_length);
  }

  @Override
  public String toString()
  {

    return "ExchangeHandleMountsStableMessage("
        + "actionType="
        + this.actionType
        + ", ridesId="
        + java.util.Arrays.toString(this.ridesId)
        + ')';
  }
}
