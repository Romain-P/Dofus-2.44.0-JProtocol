// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryDefineSettingsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5649;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
      settings;

  public JobCrafterDirectoryDefineSettingsMessage() {}

  public JobCrafterDirectoryDefineSettingsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
          settings) {
    this.settings = settings;
  }

  @Override
  public int getProtocolId() {
    return 5649;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.settings.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.settings =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
            .JobCrafterDirectorySettings();
    this.settings.deserialize(reader);
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryDefineSettingsMessage(" + "settings=" + this.settings + ')';
  }
}
