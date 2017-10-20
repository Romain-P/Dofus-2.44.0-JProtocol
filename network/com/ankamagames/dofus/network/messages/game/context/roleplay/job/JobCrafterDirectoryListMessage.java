// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6046;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry
          []
      listEntries;

  public JobCrafterDirectoryListMessage() {}

  public JobCrafterDirectoryListMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry[]
          listEntries) {
    this.listEntries = listEntries;
  }

  public JobCrafterDirectoryListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectoryListEntry>
          listEntries) {
    this.listEntries =
        listEntries.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job
                        .JobCrafterDirectoryListEntry
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6046;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(listEntries.length);

    for (int i = 0; i < listEntries.length; i++) {

      listEntries[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int listEntries_length = reader.read_ui16();
    this.listEntries =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job
                .JobCrafterDirectoryListEntry[listEntries_length];

    for (int i = 0; i < listEntries_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobCrafterDirectoryListEntry
          listEntries_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobCrafterDirectoryListEntry();

      listEntries_it.deserialize(reader);
      this.listEntries[i] = listEntries_it;
    }
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryListMessage("
        + "listEntries="
        + java.util.Arrays.toString(this.listEntries)
        + ')';
  }
}
