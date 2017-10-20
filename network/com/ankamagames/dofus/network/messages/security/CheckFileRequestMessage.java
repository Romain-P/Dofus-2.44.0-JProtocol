// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CheckFileRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6154;
  // str
  public java.lang.String filename;
  // i8
  public byte type;

  public CheckFileRequestMessage() {}

  public CheckFileRequestMessage(java.lang.String filename, byte type) {
    this.filename = filename;
    this.type = type;
  }

  @Override
  public int getProtocolId() {
    return 6154;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.filename);
    writer.write_i8(this.type);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.filename = reader.read_str();
    this.type = reader.read_i8();
  }

  @Override
  public String toString() {

    return "CheckFileRequestMessage(" + "filename=" + this.filename + ", type=" + this.type + ')';
  }
}
