// Created by Heat the 2017-10-20 01:53:21+02:00
package com.ankamagames.dofus.network.messages.authorized;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AdminCommandMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 76;
  // str
  public java.lang.String content;

  public AdminCommandMessage() {}

  public AdminCommandMessage(java.lang.String content) {
    this.content = content;
  }

  @Override
  public int getProtocolId() {
    return 76;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.content);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.content = reader.read_str();
  }

  @Override
  public String toString() {

    return "AdminCommandMessage(" + "content=" + this.content + ')';
  }
}
