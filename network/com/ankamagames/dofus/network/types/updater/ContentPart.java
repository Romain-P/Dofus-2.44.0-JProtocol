// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.updater;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContentPart extends NetworkType {
  public static final int PROTOCOL_ID = 350;
  // str
  public java.lang.String id;
  // i8
  public byte state;

  public ContentPart()
  {}

  public ContentPart(java.lang.String id, byte state)
  {
    this.id = id;
    this.state = state;
  }

  @Override
  public int getProtocolId()
  {
    return 350;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.id);
    writer.write_i8(this.state);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_str();
    this.state = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ContentPart(" + "id=" + this.id + ", state=" + this.state + ')';
  }
}
