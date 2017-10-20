// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInstanceInformations extends NetworkType {
  public static final int PROTOCOL_ID = 511;
  // flag,_loc2_,0
  public boolean secondHand;
  // flag,_loc2_,1
  public boolean isLocked;
  // flag,_loc2_,2
  public boolean isSaleLocked;
  // i32
  public int instanceId;
  // str
  public java.lang.String ownerName;
  // vi64
  public long price;

  public HouseInstanceInformations() {}

  public HouseInstanceInformations(
      boolean secondHand,
      boolean isLocked,
      boolean isSaleLocked,
      int instanceId,
      java.lang.String ownerName,
      long price) {
    this.secondHand = secondHand;
    this.isLocked = isLocked;
    this.isSaleLocked = isSaleLocked;
    this.instanceId = instanceId;
    this.ownerName = ownerName;
    this.price = price;
  }

  @Override
  public int getProtocolId() {
    return 511;
  }

  @Override
  public void serialize(DataWriter writer) {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.secondHand, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isLocked, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isSaleLocked, 2);
    writer.write_i8(_loc2_);
    writer.write_i32(this.instanceId);
    writer.write_str(this.ownerName);
    writer.write_vi64(this.price);
  }

  @Override
  public void deserialize(DataReader reader) {

    int _loc2_ = reader.read_i8();
    this.secondHand = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.isLocked = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.isSaleLocked = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.instanceId = reader.read_i32();
    this.ownerName = reader.read_str();
    this.price = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "HouseInstanceInformations("
        + "secondHand="
        + this.secondHand
        + ", isLocked="
        + this.isLocked
        + ", isSaleLocked="
        + this.isSaleLocked
        + ", instanceId="
        + this.instanceId
        + ", ownerName="
        + this.ownerName
        + ", price="
        + this.price
        + ')';
  }
}
