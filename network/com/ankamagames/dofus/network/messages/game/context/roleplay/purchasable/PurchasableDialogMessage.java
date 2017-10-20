// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.purchasable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PurchasableDialogMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5739;
  // flag,_loc2_,0
  public boolean buyOrSell;
  // flag,_loc2_,1
  public boolean secondHand;
  // f64
  public double purchasableId;
  // i32
  public int purchasableInstanceId;
  // vi64
  public long price;

  public PurchasableDialogMessage() {}

  public PurchasableDialogMessage(
      boolean buyOrSell,
      boolean secondHand,
      double purchasableId,
      int purchasableInstanceId,
      long price) {
    this.buyOrSell = buyOrSell;
    this.secondHand = secondHand;
    this.purchasableId = purchasableId;
    this.purchasableInstanceId = purchasableInstanceId;
    this.price = price;
  }

  @Override
  public int getProtocolId() {
    return 5739;
  }

  @Override
  public void serialize(DataWriter writer) {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.buyOrSell, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.secondHand, 1);
    writer.write_i8(_loc2_);
    writer.write_f64(this.purchasableId);
    writer.write_i32(this.purchasableInstanceId);
    writer.write_vi64(this.price);
  }

  @Override
  public void deserialize(DataReader reader) {

    int _loc2_ = reader.read_i8();
    this.buyOrSell = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.secondHand = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.purchasableId = reader.read_f64();
    this.purchasableInstanceId = reader.read_i32();
    this.price = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PurchasableDialogMessage("
        + "buyOrSell="
        + this.buyOrSell
        + ", secondHand="
        + this.secondHand
        + ", purchasableId="
        + this.purchasableId
        + ", purchasableInstanceId="
        + this.purchasableInstanceId
        + ", price="
        + this.price
        + ')';
  }
}
