// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionSkillUse
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 495;
  // vi32
  public int elementId;
  // vi16
  public short skillId;
  // f64
  public double skillEndTime;

  public HumanOptionSkillUse()
  {}

  public HumanOptionSkillUse(int elementId, short skillId, double skillEndTime)
  {

    super();
    this.elementId = elementId;
    this.skillId = skillId;
    this.skillEndTime = skillEndTime;
  }

  @Override
  public int getProtocolId()
  {
    return 495;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.elementId);
    writer.write_vi16(this.skillId);
    writer.write_f64(this.skillEndTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.elementId = reader.read_vi32();
    this.skillId = reader.read_vi16();
    this.skillEndTime = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "HumanOptionSkillUse("
        + "elementId="
        + this.elementId
        + ", skillId="
        + this.skillId
        + ", skillEndTime="
        + this.skillEndTime
        + ')';
  }
}
