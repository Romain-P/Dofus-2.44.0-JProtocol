// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EntityTalkMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6110;
  // f64
  public double entityId;
  // vi16
  public short textId;
  // array,str
  public java.lang.String[] parameters;

  public EntityTalkMessage()
  {}

  public EntityTalkMessage(double entityId, short textId, java.lang.String[] parameters)
  {
    this.entityId = entityId;
    this.textId = textId;
    this.parameters = parameters;
  }

  @Override
  public int getProtocolId()
  {
    return 6110;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.entityId);
    writer.write_vi16(this.textId);
    writer.write_ui16(parameters.length);
    writer.write_array_str(this.parameters);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.entityId = reader.read_f64();
    this.textId = reader.read_vi16();

    int parameters_length = reader.read_ui16();
    this.parameters = reader.read_array_str(parameters_length);
  }

  @Override
  public String toString()
  {

    return "EntityTalkMessage("
        + "entityId="
        + this.entityId
        + ", textId="
        + this.textId
        + ", parameters="
        + java.util.Arrays.toString(this.parameters)
        + ')';
  }
}
