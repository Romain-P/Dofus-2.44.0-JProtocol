// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismInformation extends NetworkType {
  public static final int PROTOCOL_ID = 428;
  // i8
  public byte typeId;
  // i8
  public byte state;
  // i32
  public int nextVulnerabilityDate;
  // i32
  public int placementDate;
  // vi32
  public int rewardTokenCount;

  public PrismInformation() {}

  public PrismInformation(
      byte typeId, byte state, int nextVulnerabilityDate, int placementDate, int rewardTokenCount) {
    this.typeId = typeId;
    this.state = state;
    this.nextVulnerabilityDate = nextVulnerabilityDate;
    this.placementDate = placementDate;
    this.rewardTokenCount = rewardTokenCount;
  }

  @Override
  public int getProtocolId() {
    return 428;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.typeId);
    writer.write_i8(this.state);
    writer.write_i32(this.nextVulnerabilityDate);
    writer.write_i32(this.placementDate);
    writer.write_vi32(this.rewardTokenCount);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.typeId = reader.read_i8();
    this.state = reader.read_i8();
    this.nextVulnerabilityDate = reader.read_i32();
    this.placementDate = reader.read_i32();
    this.rewardTokenCount = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "PrismInformation("
        + "typeId="
        + this.typeId
        + ", state="
        + this.state
        + ", nextVulnerabilityDate="
        + this.nextVulnerabilityDate
        + ", placementDate="
        + this.placementDate
        + ", rewardTokenCount="
        + this.rewardTokenCount
        + ')';
  }
}
