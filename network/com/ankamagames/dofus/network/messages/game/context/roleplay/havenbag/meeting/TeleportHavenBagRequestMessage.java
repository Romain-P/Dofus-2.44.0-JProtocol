// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportHavenBagRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6647;
  // vi64
  public long guestId;

  public TeleportHavenBagRequestMessage() {}

  public TeleportHavenBagRequestMessage(long guestId) {
    this.guestId = guestId;
  }

  @Override
  public int getProtocolId() {
    return 6647;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.guestId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guestId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "TeleportHavenBagRequestMessage(" + "guestId=" + this.guestId + ')';
  }
}
