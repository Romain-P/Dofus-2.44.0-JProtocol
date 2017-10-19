// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSessionConstant extends NetworkType {
  public static final int PROTOCOL_ID = 430;
  // vi16
  public short id;

  public ServerSessionConstant()
  {}

  public ServerSessionConstant(short id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 430;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ServerSessionConstant(" + "id=" + this.id + ')';
  }
}
