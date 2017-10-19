// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CheckFileMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6156;
  // str
  public java.lang.String filenameHash;
  // i8
  public byte type;
  // str
  public java.lang.String value;

  public CheckFileMessage()
  {}

  public CheckFileMessage(java.lang.String filenameHash, byte type, java.lang.String value)
  {
    this.filenameHash = filenameHash;
    this.type = type;
    this.value = value;
  }

  @Override
  public int getProtocolId()
  {
    return 6156;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.filenameHash);
    writer.write_i8(this.type);
    writer.write_str(this.value);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.filenameHash = reader.read_str();
    this.type = reader.read_i8();
    this.value = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "CheckFileMessage("
        + "filenameHash="
        + this.filenameHash
        + ", type="
        + this.type
        + ", value="
        + this.value
        + ')';
  }
}
