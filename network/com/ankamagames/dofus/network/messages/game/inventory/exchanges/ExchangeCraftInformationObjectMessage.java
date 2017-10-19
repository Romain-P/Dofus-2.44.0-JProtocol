// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftInformationObjectMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeCraftResultWithObjectIdMessage {
  public static final int PROTOCOL_ID = 5794;
  // ui64
  public java.math.BigInteger playerId;

  public ExchangeCraftInformationObjectMessage()
  {}

  public ExchangeCraftInformationObjectMessage(
      byte craftResult, short objectGenericId, java.math.BigInteger playerId)
  {

    super(craftResult, objectGenericId);
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 5794;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftInformationObjectMessage("
        + "craftResult="
        + this.craftResult
        + ", objectGenericId="
        + this.objectGenericId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
