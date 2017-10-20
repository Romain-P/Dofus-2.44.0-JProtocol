// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapRunningFightDetailsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5750;
  // i32
  public int fightId;

  public MapRunningFightDetailsRequestMessage() {}

  public MapRunningFightDetailsRequestMessage(int fightId) {
    this.fightId = fightId;
  }

  @Override
  public int getProtocolId() {
    return 5750;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "MapRunningFightDetailsRequestMessage(" + "fightId=" + this.fightId + ')';
  }
}
