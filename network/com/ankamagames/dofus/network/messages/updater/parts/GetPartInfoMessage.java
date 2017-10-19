// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GetPartInfoMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1506;
  // str
  public java.lang.String id;

  public GetPartInfoMessage()
  {}

  public GetPartInfoMessage(java.lang.String id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 1506;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "GetPartInfoMessage(" + "id=" + this.id + ')';
  }
}
