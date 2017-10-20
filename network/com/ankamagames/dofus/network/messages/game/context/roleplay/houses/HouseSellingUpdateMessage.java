// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSellingUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6727;
  // vi32
  public int houseId;
  // i32
  public int instanceId;
  // bool
  public boolean secondHand;
  // vi64
  public long realPrice;
  // str
  public java.lang.String buyerName;

  public HouseSellingUpdateMessage() {}

  public HouseSellingUpdateMessage(
      int houseId, int instanceId, boolean secondHand, long realPrice, java.lang.String buyerName) {
    this.houseId = houseId;
    this.instanceId = instanceId;
    this.secondHand = secondHand;
    this.realPrice = realPrice;
    this.buyerName = buyerName;
  }

  @Override
  public int getProtocolId() {
    return 6727;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
    writer.write_bool(this.secondHand);
    writer.write_vi64(this.realPrice);
    writer.write_str(this.buyerName);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
    this.secondHand = reader.read_bool();
    this.realPrice = reader.read_vi64();
    this.buyerName = reader.read_str();
  }

  @Override
  public String toString() {

    return "HouseSellingUpdateMessage("
        + "houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ", secondHand="
        + this.secondHand
        + ", realPrice="
        + this.realPrice
        + ", buyerName="
        + this.buyerName
        + ')';
  }
}
