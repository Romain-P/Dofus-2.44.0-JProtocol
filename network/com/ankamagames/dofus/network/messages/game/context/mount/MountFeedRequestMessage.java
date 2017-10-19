// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountFeedRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6189;
  // vi32
  public int mountUid;
  // i8
  public byte mountLocation;
  // vi32
  public int mountFoodUid;
  // vi32
  public int quantity;

  public MountFeedRequestMessage()
  {}

  public MountFeedRequestMessage(int mountUid, byte mountLocation, int mountFoodUid, int quantity)
  {
    this.mountUid = mountUid;
    this.mountLocation = mountLocation;
    this.mountFoodUid = mountFoodUid;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId()
  {
    return 6189;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.mountUid);
    writer.write_i8(this.mountLocation);
    writer.write_vi32(this.mountFoodUid);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.mountUid = reader.read_vi32();
    this.mountLocation = reader.read_i8();
    this.mountFoodUid = reader.read_vi32();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "MountFeedRequestMessage("
        + "mountUid="
        + this.mountUid
        + ", mountLocation="
        + this.mountLocation
        + ", mountFoodUid="
        + this.mountFoodUid
        + ", quantity="
        + this.quantity
        + ')';
  }
}
