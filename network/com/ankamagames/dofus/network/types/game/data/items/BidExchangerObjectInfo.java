// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BidExchangerObjectInfo extends NetworkType {
  public static final int PROTOCOL_ID = 122;
  // vi32
  public int objectUID;
  // array,com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
  public com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects;
  // array,ui64
  public java.math.BigInteger[] prices;

  public BidExchangerObjectInfo()
  {}

  public BidExchangerObjectInfo(
      int objectUID,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      java.math.BigInteger[] prices)
  {
    this.objectUID = objectUID;
    this.effects = effects;
    this.prices = prices;
  }

  public BidExchangerObjectInfo(
      int objectUID,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      java.math.BigInteger[] prices)
  {
    this.objectUID = objectUID;
    this.effects =
        effects.toArray(
            com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[]::new);
    this.prices = prices;
  }

  @Override
  public int getProtocolId()
  {
    return 122;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.objectUID);
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
    this.objectUID = reader.read_vi32();

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

    return "BidExchangerObjectInfo("
        + "objectUID="
        + this.objectUID
        + ", effects="
        + java.util.Arrays.toString(this.effects)
        + ", prices="
        + java.util.Arrays.toString(this.prices)
        + ')';
  }
}
