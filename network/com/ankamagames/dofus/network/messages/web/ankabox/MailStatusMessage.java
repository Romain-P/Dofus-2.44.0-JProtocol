// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.ankabox;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MailStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6275;
  // vi16
  public short unread;
  // vi16
  public short total;

  public MailStatusMessage() {}

  public MailStatusMessage(short unread, short total) {
    this.unread = unread;
    this.total = total;
  }

  @Override
  public int getProtocolId() {
    return 6275;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.unread);
    writer.write_vi16(this.total);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.unread = reader.read_vi16();
    this.total = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "MailStatusMessage(" + "unread=" + this.unread + ", total=" + this.total + ')';
  }
}
