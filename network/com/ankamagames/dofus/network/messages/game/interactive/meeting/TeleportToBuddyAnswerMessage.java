// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportToBuddyAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6293;
  // vi16
  public short dungeonId;
  // vi64
  public long buddyId;
  // bool
  public boolean accept;

  public TeleportToBuddyAnswerMessage() {}

  public TeleportToBuddyAnswerMessage(short dungeonId, long buddyId, boolean accept) {
    this.dungeonId = dungeonId;
    this.buddyId = buddyId;
    this.accept = accept;
  }

  @Override
  public int getProtocolId() {
    return 6293;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.dungeonId);
    writer.write_vi64(this.buddyId);
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dungeonId = reader.read_vi16();
    this.buddyId = reader.read_vi64();
    this.accept = reader.read_bool();
  }

  @Override
  public String toString() {

    return "TeleportToBuddyAnswerMessage("
        + "dungeonId="
        + this.dungeonId
        + ", buddyId="
        + this.buddyId
        + ", accept="
        + this.accept
        + ')';
  }
}
