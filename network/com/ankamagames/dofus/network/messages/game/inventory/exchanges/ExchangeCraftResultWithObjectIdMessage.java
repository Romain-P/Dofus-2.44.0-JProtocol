// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftResultWithObjectIdMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeCraftResultMessage {
  public static final int PROTOCOL_ID = 6000;
  // vi16
  public short objectGenericId;

  public ExchangeCraftResultWithObjectIdMessage()
  {}

  public ExchangeCraftResultWithObjectIdMessage(byte craftResult, short objectGenericId)
  {

    super(craftResult);
    this.objectGenericId = objectGenericId;
  }

  @Override
  public int getProtocolId()
  {
    return 6000;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.objectGenericId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.objectGenericId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftResultWithObjectIdMessage("
        + "craftResult="
        + this.craftResult
        + ", objectGenericId="
        + this.objectGenericId
        + ')';
  }
}
