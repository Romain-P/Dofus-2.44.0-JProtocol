// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseInformationsForSell extends NetworkType {
  public static final int PROTOCOL_ID = 221;
  // i32
  public int instanceId;
  // bool
  public boolean secondHand;
  // vi32
  public int modelId;
  // str
  public java.lang.String ownerName;
  // bool
  public boolean ownerConnected;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // vi16
  public short subAreaId;
  // i8
  public byte nbRoom;
  // i8
  public byte nbChest;
  // array,i32
  public int[] skillListIds;
  // bool
  public boolean isLocked;
  // ui64
  public java.math.BigInteger price;

  public HouseInformationsForSell()
  {}

  public HouseInformationsForSell(
      int instanceId,
      boolean secondHand,
      int modelId,
      java.lang.String ownerName,
      boolean ownerConnected,
      short worldX,
      short worldY,
      short subAreaId,
      byte nbRoom,
      byte nbChest,
      int[] skillListIds,
      boolean isLocked,
      java.math.BigInteger price)
  {
    this.instanceId = instanceId;
    this.secondHand = secondHand;
    this.modelId = modelId;
    this.ownerName = ownerName;
    this.ownerConnected = ownerConnected;
    this.worldX = worldX;
    this.worldY = worldY;
    this.subAreaId = subAreaId;
    this.nbRoom = nbRoom;
    this.nbChest = nbChest;
    this.skillListIds = skillListIds;
    this.isLocked = isLocked;
    this.price = price;
  }

  @Override
  public int getProtocolId()
  {
    return 221;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.instanceId);
    writer.write_bool(this.secondHand);
    writer.write_vi32(this.modelId);
    writer.write_str(this.ownerName);
    writer.write_bool(this.ownerConnected);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_vi16(this.subAreaId);
    writer.write_i8(this.nbRoom);
    writer.write_i8(this.nbChest);
    writer.write_ui16(skillListIds.length);
    writer.write_array_i32(this.skillListIds);
    writer.write_bool(this.isLocked);
    writer.write_ui64(this.price);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.instanceId = reader.read_i32();
    this.secondHand = reader.read_bool();
    this.modelId = reader.read_vi32();
    this.ownerName = reader.read_str();
    this.ownerConnected = reader.read_bool();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.subAreaId = reader.read_vi16();
    this.nbRoom = reader.read_i8();
    this.nbChest = reader.read_i8();

    int skillListIds_length = reader.read_ui16();
    this.skillListIds = reader.read_array_i32(skillListIds_length);
    this.isLocked = reader.read_bool();
    this.price = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "HouseInformationsForSell("
        + "instanceId="
        + this.instanceId
        + ", secondHand="
        + this.secondHand
        + ", modelId="
        + this.modelId
        + ", ownerName="
        + this.ownerName
        + ", ownerConnected="
        + this.ownerConnected
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", subAreaId="
        + this.subAreaId
        + ", nbRoom="
        + this.nbRoom
        + ", nbChest="
        + this.nbChest
        + ", skillListIds="
        + java.util.Arrays.toString(this.skillListIds)
        + ", isLocked="
        + this.isLocked
        + ", price="
        + this.price
        + ')';
  }
}
