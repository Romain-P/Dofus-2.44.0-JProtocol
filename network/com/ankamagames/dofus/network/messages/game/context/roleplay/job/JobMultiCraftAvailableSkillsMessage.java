// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobMultiCraftAvailableSkillsMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.job
        .JobAllowMultiCraftRequestMessage {
  public static final int PROTOCOL_ID = 5747;
  // vi64
  public long playerId;
  // array,vi16
  public short[] skills;

  public JobMultiCraftAvailableSkillsMessage() {}

  public JobMultiCraftAvailableSkillsMessage(boolean enabled, long playerId, short[] skills) {

    super(enabled);
    this.playerId = playerId;
    this.skills = skills;
  }

  @Override
  public int getProtocolId() {
    return 5747;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.playerId);
    writer.write_ui16(skills.length);
    writer.write_array_vi16(this.skills);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerId = reader.read_vi64();

    int skills_length = reader.read_ui16();
    this.skills = reader.read_array_vi16(skills_length);
  }

  @Override
  public String toString() {

    return "JobMultiCraftAvailableSkillsMessage("
        + "enabled="
        + this.enabled
        + ", playerId="
        + this.playerId
        + ", skills="
        + java.util.Arrays.toString(this.skills)
        + ')';
  }
}
