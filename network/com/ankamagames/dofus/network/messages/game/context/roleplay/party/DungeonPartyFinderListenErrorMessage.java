// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderListenErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6248;
  // vi16
  public short dungeonId;

  public DungeonPartyFinderListenErrorMessage()
  {}

  public DungeonPartyFinderListenErrorMessage(short dungeonId)
  {
    this.dungeonId = dungeonId;
  }

  @Override
  public int getProtocolId()
  {
    return 6248;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.dungeonId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dungeonId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "DungeonPartyFinderListenErrorMessage(" + "dungeonId=" + this.dungeonId + ')';
  }
}
