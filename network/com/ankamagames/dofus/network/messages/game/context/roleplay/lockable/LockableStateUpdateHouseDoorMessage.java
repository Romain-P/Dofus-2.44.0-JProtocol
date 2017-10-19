// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableStateUpdateHouseDoorMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
        .LockableStateUpdateAbstractMessage {
  public static final int PROTOCOL_ID = 5668;
  // vi32
  public int houseId;
  // i32
  public int instanceId;
  // bool
  public boolean secondHand;

  public LockableStateUpdateHouseDoorMessage()
  {}

  public LockableStateUpdateHouseDoorMessage(
      boolean locked, int houseId, int instanceId, boolean secondHand)
  {

    super(locked);
    this.houseId = houseId;
    this.instanceId = instanceId;
    this.secondHand = secondHand;
  }

  @Override
  public int getProtocolId()
  {
    return 5668;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
    writer.write_bool(this.secondHand);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
    this.secondHand = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "LockableStateUpdateHouseDoorMessage("
        + "locked="
        + this.locked
        + ", houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ", secondHand="
        + this.secondHand
        + ')';
  }
}
