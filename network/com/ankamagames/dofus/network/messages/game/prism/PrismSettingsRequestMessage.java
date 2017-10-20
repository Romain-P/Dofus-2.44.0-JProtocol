// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismSettingsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6437;
  // vi16
  public short subAreaId;
  // i8
  public byte startDefenseTime;

  public PrismSettingsRequestMessage() {}

  public PrismSettingsRequestMessage(short subAreaId, byte startDefenseTime) {
    this.subAreaId = subAreaId;
    this.startDefenseTime = startDefenseTime;
  }

  @Override
  public int getProtocolId() {
    return 6437;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.subAreaId);
    writer.write_i8(this.startDefenseTime);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.subAreaId = reader.read_vi16();
    this.startDefenseTime = reader.read_i8();
  }

  @Override
  public String toString() {

    return "PrismSettingsRequestMessage("
        + "subAreaId="
        + this.subAreaId
        + ", startDefenseTime="
        + this.startDefenseTime
        + ')';
  }
}
