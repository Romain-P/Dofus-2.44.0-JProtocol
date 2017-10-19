// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemToSellInBid
    extends com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell {
  public static final int PROTOCOL_ID = 164;
  // i32
  public int unsoldDelay;

  public ObjectItemToSellInBid()
  {}

  public ObjectItemToSellInBid(
      short objectGID,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      int objectUID,
      int quantity,
      java.math.BigInteger objectPrice,
      int unsoldDelay)
  {

    super(objectGID, effects, objectUID, quantity, objectPrice);
    this.unsoldDelay = unsoldDelay;
  }

  public ObjectItemToSellInBid(
      short objectGID,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      int objectUID,
      int quantity,
      java.math.BigInteger objectPrice,
      int unsoldDelay)
  {

    super(objectGID, effects, objectUID, quantity, objectPrice);
    this.unsoldDelay = unsoldDelay;
  }

  @Override
  public int getProtocolId()
  {
    return 164;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.unsoldDelay);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.unsoldDelay = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ObjectItemToSellInBid("
        + "objectGID="
        + this.objectGID
        + ", effects="
        + java.util.Arrays.toString(this.effects)
        + ", objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ", objectPrice="
        + this.objectPrice
        + ", unsoldDelay="
        + this.unsoldDelay
        + ')';
  }
}
