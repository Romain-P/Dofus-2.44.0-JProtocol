// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LivingObjectMessageRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6066;
  // vi16
  public short msgId;
  // array,str
  public java.lang.String[] parameters;
  // vi32
  public int livingObject;

  public LivingObjectMessageRequestMessage()
  {}

  public LivingObjectMessageRequestMessage(
      short msgId, java.lang.String[] parameters, int livingObject)
  {
    this.msgId = msgId;
    this.parameters = parameters;
    this.livingObject = livingObject;
  }

  @Override
  public int getProtocolId()
  {
    return 6066;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.msgId);
    writer.write_ui16(parameters.length);
    writer.write_array_str(this.parameters);
    writer.write_vi32(this.livingObject);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.msgId = reader.read_vi16();

    int parameters_length = reader.read_ui16();
    this.parameters = reader.read_array_str(parameters_length);
    this.livingObject = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "LivingObjectMessageRequestMessage("
        + "msgId="
        + this.msgId
        + ", parameters="
        + java.util.Arrays.toString(this.parameters)
        + ", livingObject="
        + this.livingObject
        + ')';
  }
}
