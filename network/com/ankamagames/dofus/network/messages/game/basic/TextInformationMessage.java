// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TextInformationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 780;
  // i8
  public byte msgType;
  // vi16
  public short msgId;
  // array,str
  public java.lang.String[] parameters;

  public TextInformationMessage()
  {}

  public TextInformationMessage(byte msgType, short msgId, java.lang.String[] parameters)
  {
    this.msgType = msgType;
    this.msgId = msgId;
    this.parameters = parameters;
  }

  @Override
  public int getProtocolId()
  {
    return 780;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.msgType);
    writer.write_vi16(this.msgId);
    writer.write_ui16(parameters.length);
    writer.write_array_str(this.parameters);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.msgType = reader.read_i8();
    this.msgId = reader.read_vi16();

    int parameters_length = reader.read_ui16();
    this.parameters = reader.read_array_str(parameters_length);
  }

  @Override
  public String toString()
  {

    return "TextInformationMessage("
        + "msgType="
        + this.msgType
        + ", msgId="
        + this.msgId
        + ", parameters="
        + java.util.Arrays.toString(this.parameters)
        + ')';
  }
}
