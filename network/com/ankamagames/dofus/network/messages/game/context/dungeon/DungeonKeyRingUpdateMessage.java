// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.dungeon;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonKeyRingUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6296;
  // vi16
  public short dungeonId;
  // bool
  public boolean available;

  public DungeonKeyRingUpdateMessage()
  {}

  public DungeonKeyRingUpdateMessage(short dungeonId, boolean available)
  {
    this.dungeonId = dungeonId;
    this.available = available;
  }

  @Override
  public int getProtocolId()
  {
    return 6296;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.dungeonId);
    writer.write_bool(this.available);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dungeonId = reader.read_vi16();
    this.available = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "DungeonKeyRingUpdateMessage("
        + "dungeonId="
        + this.dungeonId
        + ", available="
        + this.available
        + ')';
  }
}
