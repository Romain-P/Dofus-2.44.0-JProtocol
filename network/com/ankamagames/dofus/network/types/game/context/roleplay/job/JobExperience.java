// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobExperience extends NetworkType {
  public static final int PROTOCOL_ID = 98;
  // i8
  public byte jobId;
  // ui8
  public short jobLevel;
  // vi64
  public long jobXP;
  // vi64
  public long jobXpLevelFloor;
  // vi64
  public long jobXpNextLevelFloor;

  public JobExperience() {}

  public JobExperience(
      byte jobId, short jobLevel, long jobXP, long jobXpLevelFloor, long jobXpNextLevelFloor) {
    this.jobId = jobId;
    this.jobLevel = jobLevel;
    this.jobXP = jobXP;
    this.jobXpLevelFloor = jobXpLevelFloor;
    this.jobXpNextLevelFloor = jobXpNextLevelFloor;
  }

  @Override
  public int getProtocolId() {
    return 98;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_ui8(this.jobLevel);
    writer.write_vi64(this.jobXP);
    writer.write_vi64(this.jobXpLevelFloor);
    writer.write_vi64(this.jobXpNextLevelFloor);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
    this.jobLevel = reader.read_ui8();
    this.jobXP = reader.read_vi64();
    this.jobXpLevelFloor = reader.read_vi64();
    this.jobXpNextLevelFloor = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "JobExperience("
        + "jobId="
        + this.jobId
        + ", jobLevel="
        + this.jobLevel
        + ", jobXP="
        + this.jobXP
        + ", jobXpLevelFloor="
        + this.jobXpLevelFloor
        + ", jobXpNextLevelFloor="
        + this.jobXpNextLevelFloor
        + ')';
  }
}
