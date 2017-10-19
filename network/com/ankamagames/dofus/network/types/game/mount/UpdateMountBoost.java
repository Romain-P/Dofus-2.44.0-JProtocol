// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateMountBoost extends NetworkType {
  public static final int PROTOCOL_ID = 356;
  // i8
  public byte type;

  public UpdateMountBoost()
  {}

  public UpdateMountBoost(byte type)
  {
    this.type = type;
  }

  @Override
  public int getProtocolId()
  {
    return 356;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.type);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.type = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "UpdateMountBoost(" + "type=" + this.type + ')';
  }
}
