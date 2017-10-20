// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectorySettingsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5652;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings[]
      craftersSettings;

  public JobCrafterDirectorySettingsMessage() {}

  public JobCrafterDirectorySettingsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings[]
          craftersSettings) {
    this.craftersSettings = craftersSettings;
  }

  public JobCrafterDirectorySettingsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectorySettings>
          craftersSettings) {
    this.craftersSettings =
        craftersSettings.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job
                        .JobCrafterDirectorySettings
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5652;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(craftersSettings.length);

    for (int i = 0; i < craftersSettings.length; i++) {

      craftersSettings[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int craftersSettings_length = reader.read_ui16();
    this.craftersSettings =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
                .JobCrafterDirectorySettings[craftersSettings_length];

    for (int i = 0; i < craftersSettings_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectorySettings
          craftersSettings_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectorySettings();

      craftersSettings_it.deserialize(reader);
      this.craftersSettings[i] = craftersSettings_it;
    }
  }

  @Override
  public String toString() {

    return "JobCrafterDirectorySettingsMessage("
        + "craftersSettings="
        + java.util.Arrays.toString(this.craftersSettings)
        + ')';
  }
}
