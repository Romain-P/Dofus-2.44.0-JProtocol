// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveElementSkill extends NetworkType {
  public static final int PROTOCOL_ID = 219;
  // vi32
  public int skillId;
  // i32
  public int skillInstanceUid;

  public InteractiveElementSkill()
  {}

  public InteractiveElementSkill(int skillId, int skillInstanceUid)
  {
    this.skillId = skillId;
    this.skillInstanceUid = skillInstanceUid;
  }

  @Override
  public int getProtocolId()
  {
    return 219;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.skillId);
    writer.write_i32(this.skillInstanceUid);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.skillId = reader.read_vi32();
    this.skillInstanceUid = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "InteractiveElementSkill("
        + "skillId="
        + this.skillId
        + ", skillInstanceUid="
        + this.skillInstanceUid
        + ')';
  }
}
