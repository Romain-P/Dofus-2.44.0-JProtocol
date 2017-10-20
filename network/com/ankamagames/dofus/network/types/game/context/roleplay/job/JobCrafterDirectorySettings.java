// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectorySettings extends NetworkType {
  public static final int PROTOCOL_ID = 97;
  // i8
  public byte jobId;
  // ui8
  public short minLevel;
  // bool
  public boolean free;

  public JobCrafterDirectorySettings() {}

  public JobCrafterDirectorySettings(byte jobId, short minLevel, boolean free) {
    this.jobId = jobId;
    this.minLevel = minLevel;
    this.free = free;
  }

  @Override
  public int getProtocolId() {
    return 97;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_ui8(this.minLevel);
    writer.write_bool(this.free);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
    this.minLevel = reader.read_ui8();
    this.free = reader.read_bool();
  }

  @Override
  public String toString() {

    return "JobCrafterDirectorySettings("
        + "jobId="
        + this.jobId
        + ", minLevel="
        + this.minLevel
        + ", free="
        + this.free
        + ')';
  }
}
