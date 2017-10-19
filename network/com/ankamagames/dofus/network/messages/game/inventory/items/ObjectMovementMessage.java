// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectMovementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3010;
  // vi32
  public int objectUID;
  // ui8
  public short position;

  public ObjectMovementMessage()
  {}

  public ObjectMovementMessage(int objectUID, short position)
  {
    this.objectUID = objectUID;
    this.position = position;
  }

  @Override
  public int getProtocolId()
  {
    return 3010;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.objectUID);
    writer.write_ui8(this.position);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.objectUID = reader.read_vi32();
    this.position = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "ObjectMovementMessage("
        + "objectUID="
        + this.objectUID
        + ", position="
        + this.position
        + ')';
  }
}
