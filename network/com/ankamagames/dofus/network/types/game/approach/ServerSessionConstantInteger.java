// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSessionConstantInteger
    extends com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant {
  public static final int PROTOCOL_ID = 433;
  // i32
  public int value;

  public ServerSessionConstantInteger()
  {}

  public ServerSessionConstantInteger(short id, int value)
  {

    super(id);
    this.value = value;
  }

  @Override
  public int getProtocolId()
  {
    return 433;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.value);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.value = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ServerSessionConstantInteger(" + "id=" + this.id + ", value=" + this.value + ')';
  }
}
