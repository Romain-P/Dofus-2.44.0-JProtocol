// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftResultWithObjectDescMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeCraftResultMessage {
  public static final int PROTOCOL_ID = 5999;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer objectInfo;

  public ExchangeCraftResultWithObjectDescMessage()
  {}

  public ExchangeCraftResultWithObjectDescMessage(
      byte craftResult,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer objectInfo)
  {

    super(craftResult);
    this.objectInfo = objectInfo;
  }

  @Override
  public int getProtocolId()
  {
    return 5999;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.objectInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.objectInfo =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer();
    this.objectInfo.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftResultWithObjectDescMessage("
        + "craftResult="
        + this.craftResult
        + ", objectInfo="
        + this.objectInfo
        + ')';
  }
}
