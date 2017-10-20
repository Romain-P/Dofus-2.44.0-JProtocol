// Created by Heat the 2017-10-20 01:53:21+02:00
package com.ankamagames.dofus.network.messages.authorized;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ConsoleMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 75;
  // i8
  public byte type;
  // str
  public java.lang.String content;

  public ConsoleMessage() {}

  public ConsoleMessage(byte type, java.lang.String content) {
    this.type = type;
    this.content = content;
  }

  @Override
  public int getProtocolId() {
    return 75;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.type);
    writer.write_str(this.content);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type = reader.read_i8();
    this.content = reader.read_str();
  }

  @Override
  public String toString() {

    return "ConsoleMessage(" + "type=" + this.type + ", content=" + this.content + ')';
  }
}
