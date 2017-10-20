// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderRegisterRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6249;
  // array,vi16
  public short[] dungeonIds;

  public DungeonPartyFinderRegisterRequestMessage() {}

  public DungeonPartyFinderRegisterRequestMessage(short[] dungeonIds) {
    this.dungeonIds = dungeonIds;
  }

  @Override
  public int getProtocolId() {
    return 6249;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(dungeonIds.length);
    writer.write_array_vi16(this.dungeonIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    int dungeonIds_length = reader.read_ui16();
    this.dungeonIds = reader.read_array_vi16(dungeonIds_length);
  }

  @Override
  public String toString() {

    return "DungeonPartyFinderRegisterRequestMessage("
        + "dungeonIds="
        + java.util.Arrays.toString(this.dungeonIds)
        + ')';
  }
}
