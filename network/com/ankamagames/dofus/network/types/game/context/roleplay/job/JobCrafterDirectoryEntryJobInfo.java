// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryEntryJobInfo extends NetworkType {
  public static final int PROTOCOL_ID = 195;
  // i8
  public byte jobId;
  // ui8
  public short jobLevel;
  // bool
  public boolean free;
  // ui8
  public short minLevel;

  public JobCrafterDirectoryEntryJobInfo() {}

  public JobCrafterDirectoryEntryJobInfo(byte jobId, short jobLevel, boolean free, short minLevel) {
    this.jobId = jobId;
    this.jobLevel = jobLevel;
    this.free = free;
    this.minLevel = minLevel;
  }

  @Override
  public int getProtocolId() {
    return 195;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_ui8(this.jobLevel);
    writer.write_bool(this.free);
    writer.write_ui8(this.minLevel);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
    this.jobLevel = reader.read_ui8();
    this.free = reader.read_bool();
    this.minLevel = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryEntryJobInfo("
        + "jobId="
        + this.jobId
        + ", jobLevel="
        + this.jobLevel
        + ", free="
        + this.free
        + ", minLevel="
        + this.minLevel
        + ')';
  }
}
