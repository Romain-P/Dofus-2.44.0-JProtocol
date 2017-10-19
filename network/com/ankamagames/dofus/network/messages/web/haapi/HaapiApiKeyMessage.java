// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.web.haapi;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HaapiApiKeyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6649;
  // i8
  public byte returnType;
  // i8
  public byte keyType;
  // str
  public java.lang.String token;

  public HaapiApiKeyMessage()
  {}

  public HaapiApiKeyMessage(byte returnType, byte keyType, java.lang.String token)
  {
    this.returnType = returnType;
    this.keyType = keyType;
    this.token = token;
  }

  @Override
  public int getProtocolId()
  {
    return 6649;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.returnType);
    writer.write_i8(this.keyType);
    writer.write_str(this.token);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.returnType = reader.read_i8();
    this.keyType = reader.read_i8();
    this.token = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "HaapiApiKeyMessage("
        + "returnType="
        + this.returnType
        + ", keyType="
        + this.keyType
        + ", token="
        + this.token
        + ')';
  }
}
