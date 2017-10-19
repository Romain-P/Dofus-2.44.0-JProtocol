// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CheckIntegrityMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6372;
  // array,i8
  public byte[] data;

  public CheckIntegrityMessage()
  {}

  public CheckIntegrityMessage(byte[] data)
  {
    this.data = data;
  }

  @Override
  public int getProtocolId()
  {
    return 6372;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(data.length);
    writer.write_array_i8(this.data);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int data_length = reader.read_ui16();
    this.data = reader.read_array_i8(data_length);
  }

  @Override
  public String toString()
  {

    return "CheckIntegrityMessage(" + "data=" + +this.data.length + "b" + ')';
  }
}
