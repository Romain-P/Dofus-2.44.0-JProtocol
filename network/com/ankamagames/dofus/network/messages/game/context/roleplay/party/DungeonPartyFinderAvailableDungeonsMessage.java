// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderAvailableDungeonsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6242;
  // array,vi16
  public short[] dungeonIds;

  public DungeonPartyFinderAvailableDungeonsMessage()
  {}

  public DungeonPartyFinderAvailableDungeonsMessage(short[] dungeonIds)
  {
    this.dungeonIds = dungeonIds;
  }

  @Override
  public int getProtocolId()
  {
    return 6242;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(dungeonIds.length);
    writer.write_array_vi16(this.dungeonIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int dungeonIds_length = reader.read_ui16();
    this.dungeonIds = reader.read_array_vi16(dungeonIds_length);
  }

  @Override
  public String toString()
  {

    return "DungeonPartyFinderAvailableDungeonsMessage("
        + "dungeonIds="
        + java.util.Arrays.toString(this.dungeonIds)
        + ')';
  }
}
