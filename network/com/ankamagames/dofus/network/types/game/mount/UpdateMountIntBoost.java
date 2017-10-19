// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateMountIntBoost
    extends com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost {
  public static final int PROTOCOL_ID = 357;
  // i32
  public int value;

  public UpdateMountIntBoost()
  {}

  public UpdateMountIntBoost(byte type, int value)
  {

    super(type);
    this.value = value;
  }

  @Override
  public int getProtocolId()
  {
    return 357;
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

    return "UpdateMountIntBoost(" + "type=" + this.type + ", value=" + this.value + ')';
  }
}
