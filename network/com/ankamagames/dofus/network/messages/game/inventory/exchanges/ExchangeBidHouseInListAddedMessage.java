// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseInListAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5949;
  // i32
  public int itemUID;
  // i32
  public int objGenericId;
  // array,com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
  public com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects;
  // array,ui64
  public java.math.BigInteger[] prices;

  public ExchangeBidHouseInListAddedMessage()
  {}

  public ExchangeBidHouseInListAddedMessage(
      int itemUID,
      int objGenericId,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      java.math.BigInteger[] prices)
  {
    this.itemUID = itemUID;
    this.objGenericId = objGenericId;
    this.effects = effects;
    this.prices = prices;
  }

  public ExchangeBidHouseInListAddedMessage(
      int itemUID,
      int objGenericId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      java.math.BigInteger[] prices)
  {
    this.itemUID = itemUID;
    this.objGenericId = objGenericId;
    this.effects =
        effects.toArray(
            com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[]::new);
    this.prices = prices;
  }

  @Override
  public int getProtocolId()
  {
    return 5949;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.itemUID);
    writer.write_i32(this.objGenericId);
    writer.write_ui16(effects.length);

    for (int i = 0; i < effects.length; i++)
  {

      writer.write_ui16(effects[i].getProtocolId());

      effects[i].serialize(writer);
    }
    writer.write_ui16(prices.length);
    writer.write_array_ui64(this.prices);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.itemUID = reader.read_i32();
    this.objGenericId = reader.read_i32();

    int effects_length = reader.read_ui16();
    this.effects =
        new com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
            [effects_length];

    for (int i = 0; i < effects_length; i++)
  {

      int effects_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect effects_it =
          (com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect)
              InternalProtocolTypeManager.get(effects_it_typeId);

      effects_it.deserialize(reader);
      this.effects[i] = effects_it;
    }

    int prices_length = reader.read_ui16();
    this.prices = reader.read_array_ui64(prices_length);
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseInListAddedMessage("
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
