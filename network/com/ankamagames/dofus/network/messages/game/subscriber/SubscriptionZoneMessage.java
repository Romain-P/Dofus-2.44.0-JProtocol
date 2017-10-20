// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.subscriber;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SubscriptionZoneMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5573;
  // bool
  public boolean active;

  public SubscriptionZoneMessage() {}

  public SubscriptionZoneMessage(boolean active) {
    this.active = active;
  }

  @Override
  public int getProtocolId() {
    return 5573;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.active);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.active = reader.read_bool();
  }

  @Override
  public String toString() {

    return "SubscriptionZoneMessage(" + "active=" + this.active + ')';
  }
}
