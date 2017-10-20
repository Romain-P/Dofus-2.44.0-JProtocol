// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.queues;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QueueStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6100;
  // ui16
  public int position;
  // ui16
  public int total;

  public QueueStatusMessage() {}

  public QueueStatusMessage(int position, int total) {
    this.position = position;
    this.total = total;
  }

  @Override
  public int getProtocolId() {
    return 6100;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.position);
    writer.write_ui16(this.total);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.position = reader.read_ui16();
    this.total = reader.read_ui16();
  }

  @Override
  public String toString() {

    return "QueueStatusMessage(" + "position=" + this.position + ", total=" + this.total + ')';
  }
}
