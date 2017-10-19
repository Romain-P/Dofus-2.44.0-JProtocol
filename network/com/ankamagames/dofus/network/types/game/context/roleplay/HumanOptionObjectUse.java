// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionObjectUse
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 449;
  // i8
  public byte delayTypeId;
  // f64
  public double delayEndTime;
  // vi16
  public short objectGID;

  public HumanOptionObjectUse()
  {}

  public HumanOptionObjectUse(byte delayTypeId, double delayEndTime, short objectGID)
  {

    super();
    this.delayTypeId = delayTypeId;
    this.delayEndTime = delayEndTime;
    this.objectGID = objectGID;
  }

  @Override
  public int getProtocolId()
  {
    return 449;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.delayTypeId);
    writer.write_f64(this.delayEndTime);
    writer.write_vi16(this.objectGID);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.delayTypeId = reader.read_i8();
    this.delayEndTime = reader.read_f64();
    this.objectGID = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "HumanOptionObjectUse("
        + "delayTypeId="
        + this.delayTypeId
        + ", delayEndTime="
        + this.delayEndTime
        + ", objectGID="
        + this.objectGID
        + ')';
  }
}
