// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSessionConstantLong
    extends com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant {
  public static final int PROTOCOL_ID = 429;
  // f64
  public double value;

  public ServerSessionConstantLong()
  {}

  public ServerSessionConstantLong(short id, double value)
  {

    super(id);
    this.value = value;
  }

  @Override
  public int getProtocolId()
  {
    return 429;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.value);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.value = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "ServerSessionConstantLong(" + "id=" + this.id + ", value=" + this.value + ')';
  }
}
