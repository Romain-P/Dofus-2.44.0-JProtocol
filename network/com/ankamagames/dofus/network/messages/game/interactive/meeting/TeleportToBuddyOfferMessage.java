// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportToBuddyOfferMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6287;
  // vi16
  public short dungeonId;
  // vi64
  public long buddyId;
  // vi32
  public int timeLeft;

  public TeleportToBuddyOfferMessage() {}

  public TeleportToBuddyOfferMessage(short dungeonId, long buddyId, int timeLeft) {
    this.dungeonId = dungeonId;
    this.buddyId = buddyId;
    this.timeLeft = timeLeft;
  }

  @Override
  public int getProtocolId() {
    return 6287;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.dungeonId);
    writer.write_vi64(this.buddyId);
    writer.write_vi32(this.timeLeft);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dungeonId = reader.read_vi16();
    this.buddyId = reader.read_vi64();
    this.timeLeft = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "TeleportToBuddyOfferMessage("
        + "dungeonId="
        + this.dungeonId
        + ", buddyId="
        + this.buddyId
        + ", timeLeft="
        + this.timeLeft
        + ')';
  }
}
