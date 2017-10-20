// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.subscription;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SubscriptionUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6616;
  // f64
  public double timestamp;

  public SubscriptionUpdateMessage() {}

  public SubscriptionUpdateMessage(double timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public int getProtocolId() {
    return 6616;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.timestamp);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.timestamp = reader.read_f64();
  }

  @Override
  public String toString() {

    return "SubscriptionUpdateMessage(" + "timestamp=" + this.timestamp + ')';
  }
}
