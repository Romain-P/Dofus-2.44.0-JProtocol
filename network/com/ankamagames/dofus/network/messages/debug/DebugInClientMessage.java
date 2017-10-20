// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.debug;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DebugInClientMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6028;
  // i8
  public byte level;
  // str
  public java.lang.String message;

  public DebugInClientMessage() {}

  public DebugInClientMessage(byte level, java.lang.String message) {
    this.level = level;
    this.message = message;
  }

  @Override
  public int getProtocolId() {
    return 6028;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.level);
    writer.write_str(this.message);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.level = reader.read_i8();
    this.message = reader.read_str();
  }

  @Override
  public String toString() {

    return "DebugInClientMessage(" + "level=" + this.level + ", message=" + this.message + ')';
  }
}
