// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SkillActionDescription extends NetworkType {
  public static final int PROTOCOL_ID = 102;
  // vi16
  public short skillId;

  public SkillActionDescription()
  {}

  public SkillActionDescription(short skillId)
  {
    this.skillId = skillId;
  }

  @Override
  public int getProtocolId()
  {
    return 102;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.skillId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.skillId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "SkillActionDescription(" + "skillId=" + this.skillId + ')';
  }
}
