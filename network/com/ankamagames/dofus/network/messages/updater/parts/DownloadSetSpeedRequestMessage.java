// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DownloadSetSpeedRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1512;
  // i8
  public byte downloadSpeed;

  public DownloadSetSpeedRequestMessage() {}

  public DownloadSetSpeedRequestMessage(byte downloadSpeed) {
    this.downloadSpeed = downloadSpeed;
  }

  @Override
  public int getProtocolId() {
    return 1512;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.downloadSpeed);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.downloadSpeed = reader.read_i8();
  }

  @Override
  public String toString() {

    return "DownloadSetSpeedRequestMessage(" + "downloadSpeed=" + this.downloadSpeed + ')';
  }
}
