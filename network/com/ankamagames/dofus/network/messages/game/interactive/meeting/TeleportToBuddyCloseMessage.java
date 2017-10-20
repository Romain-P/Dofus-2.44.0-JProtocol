// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportToBuddyCloseMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6303;
  // vi16
  public short dungeonId;
  // vi64
  public long buddyId;

  public TeleportToBuddyCloseMessage() {}

  public TeleportToBuddyCloseMessage(short dungeonId, long buddyId) {
    this.dungeonId = dungeonId;
    this.buddyId = buddyId;
  }

  @Override
  public int getProtocolId() {
    return 6303;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.dungeonId);
    writer.write_vi64(this.buddyId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dungeonId = reader.read_vi16();
    this.buddyId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "TeleportToBuddyCloseMessage("
        + "dungeonId="
        + this.dungeonId
        + ", buddyId="
        + this.buddyId
        + ')';
  }
}
