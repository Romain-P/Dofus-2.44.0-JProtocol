// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableStateUpdateStorageMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
        .LockableStateUpdateAbstractMessage {
  public static final int PROTOCOL_ID = 5669;
  // f64
  public double mapId;
  // vi32
  public int elementId;

  public LockableStateUpdateStorageMessage()
  {}

  public LockableStateUpdateStorageMessage(boolean locked, double mapId, int elementId)
  {

    super(locked);
    this.mapId = mapId;
    this.elementId = elementId;
  }

  @Override
  public int getProtocolId()
  {
    return 5669;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.mapId);
    writer.write_vi32(this.elementId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.mapId = reader.read_f64();
    this.elementId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "LockableStateUpdateStorageMessage("
        + "locked="
        + this.locked
        + ", mapId="
        + this.mapId
        + ", elementId="
        + this.elementId
        + ')';
  }
}
