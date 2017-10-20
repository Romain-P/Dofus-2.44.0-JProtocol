// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveElementNamedSkill
    extends com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill {
  public static final int PROTOCOL_ID = 220;
  // vi32
  public int nameId;

  public InteractiveElementNamedSkill() {}

  public InteractiveElementNamedSkill(int skillId, int skillInstanceUid, int nameId) {

    super(skillId, skillInstanceUid);
    this.nameId = nameId;
  }

  @Override
  public int getProtocolId() {
    return 220;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.nameId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.nameId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "InteractiveElementNamedSkill("
        + "skillId="
        + this.skillId
        + ", skillInstanceUid="
        + this.skillInstanceUid
        + ", nameId="
        + this.nameId
        + ')';
  }
}
