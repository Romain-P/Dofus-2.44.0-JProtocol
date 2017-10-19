// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HelloConnectMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3;
  // str
  public java.lang.String salt;
  // array,i8
  public byte[] key;

  public HelloConnectMessage()
  {}

  public HelloConnectMessage(java.lang.String salt, byte[] key)
  {
    this.salt = salt;
    this.key = key;
  }

  @Override
  public int getProtocolId()
  {
    return 3;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.salt);
    writer.write_ui16(key.length);
    writer.write_array_i8(this.key);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.salt = reader.read_str();

    int key_length = reader.read_ui16();
    this.key = reader.read_array_i8(key_length);
  }

  @Override
  public String toString()
  {

    return "HelloConnectMessage(" + "salt=" + this.salt + ", key=" + +this.key.length + "b" + ')';
  }
}
