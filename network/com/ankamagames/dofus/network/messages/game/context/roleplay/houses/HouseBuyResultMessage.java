// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseBuyResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5735;
  // flag,_loc2_,0
  public boolean secondHand;
  // flag,_loc2_,1
  public boolean bought;
  // vi32
  public int houseId;
  // i32
  public int instanceId;
  // ui64
  public java.math.BigInteger realPrice;

  public HouseBuyResultMessage()
  {}

  public HouseBuyResultMessage(
      boolean secondHand,
      boolean bought,
      int houseId,
      int instanceId,
      java.math.BigInteger realPrice)
  {
    this.secondHand = secondHand;
    this.bought = bought;
    this.houseId = houseId;
    this.instanceId = instanceId;
    this.realPrice = realPrice;
  }

  @Override
  public int getProtocolId()
  {
    return 5735;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.secondHand, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.bought, 1);
    writer.write_i8(_loc2_);
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
    writer.write_ui64(this.realPrice);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.secondHand = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.bought = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
    this.realPrice = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "HouseBuyResultMessage("
        + "secondHand="
        + this.secondHand
        + ", bought="
        + this.bought
        + ", houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ", realPrice="
        + this.realPrice
        + ')';
  }
}
