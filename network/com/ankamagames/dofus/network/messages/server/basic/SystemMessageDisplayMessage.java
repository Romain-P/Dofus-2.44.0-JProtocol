// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.server.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SystemMessageDisplayMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 189;
  // bool
  public boolean hangUp;
  // vi16
  public short msgId;
  // array,str
  public java.lang.String[] parameters;

  public SystemMessageDisplayMessage()
  {}

  public SystemMessageDisplayMessage(boolean hangUp, short msgId, java.lang.String[] parameters)
  {
    this.hangUp = hangUp;
    this.msgId = msgId;
    this.parameters = parameters;
  }

  @Override
  public int getProtocolId()
  {
    return 189;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.hangUp);
    writer.write_vi16(this.msgId);
    writer.write_ui16(parameters.length);
    writer.write_array_str(this.parameters);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.hangUp = reader.read_bool();
    this.msgId = reader.read_vi16();

    int parameters_length = reader.read_ui16();
    this.parameters = reader.read_array_str(parameters_length);
  }

  @Override
  public String toString()
  {

    return "SystemMessageDisplayMessage("
        + "hangUp="
        + this.hangUp
        + ", msgId="
        + this.msgId
        + ", parameters="
        + java.util.Arrays.toString(this.parameters)
        + ')';
  }
}
