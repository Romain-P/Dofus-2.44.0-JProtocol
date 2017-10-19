// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseInListUpdatedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeBidHouseInListAddedMessage {
  public static final int PROTOCOL_ID = 6337;

  public ExchangeBidHouseInListUpdatedMessage()
  {}

  public ExchangeBidHouseInListUpdatedMessage(
      int itemUID,
      int objGenericId,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      java.math.BigInteger[] prices)
  {

    super(itemUID, objGenericId, effects, prices);
  }

  public ExchangeBidHouseInListUpdatedMessage(
      int itemUID,
      int objGenericId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      java.math.BigInteger[] prices)
  {

    super(itemUID, objGenericId, effects, prices);
  }

  @Override
  public int getProtocolId()
  {
    return 6337;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseInListUpdatedMessage("
        + "itemUID="
        + this.itemUID
        + ", objGenericId="
        + this.objGenericId
        + ", effects="
        + java.util.Arrays.toString(this.effects)
        + ", prices="
        + java.util.Arrays.toString(this.prices)
        + ')';
  }
}
