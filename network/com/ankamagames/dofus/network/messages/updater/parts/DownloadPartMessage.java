// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DownloadPartMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1503;
  // str
  public java.lang.String id;

  public DownloadPartMessage() {}

  public DownloadPartMessage(java.lang.String id) {
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 1503;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_str();
  }

  @Override
  public String toString() {

    return "DownloadPartMessage(" + "id=" + this.id + ')';
  }
}
