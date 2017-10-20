// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismSubareaEmptyInfo extends NetworkType {
  public static final int PROTOCOL_ID = 438;
  // vi16
  public short subAreaId;
  // vi32
  public int allianceId;

  public PrismSubareaEmptyInfo() {}

  public PrismSubareaEmptyInfo(short subAreaId, int allianceId) {
    this.subAreaId = subAreaId;
    this.allianceId = allianceId;
  }

  @Override
  public int getProtocolId() {
    return 438;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.subAreaId);
    writer.write_vi32(this.allianceId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.subAreaId = reader.read_vi16();
    this.allianceId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "PrismSubareaEmptyInfo("
        + "subAreaId="
        + this.subAreaId
        + ", allianceId="
        + this.allianceId
        + ')';
  }
}
