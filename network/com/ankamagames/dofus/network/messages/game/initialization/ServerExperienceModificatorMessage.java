// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.initialization;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerExperienceModificatorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6237;
  // vi16
  public short experiencePercent;

  public ServerExperienceModificatorMessage() {}

  public ServerExperienceModificatorMessage(short experiencePercent) {
    this.experiencePercent = experiencePercent;
  }

  @Override
  public int getProtocolId() {
    return 6237;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.experiencePercent);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.experiencePercent = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ServerExperienceModificatorMessage("
        + "experiencePercent="
        + this.experiencePercent
        + ')';
  }
}
