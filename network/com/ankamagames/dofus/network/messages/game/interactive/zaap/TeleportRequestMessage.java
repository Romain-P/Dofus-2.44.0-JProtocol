// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.interactive.zaap;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5961;
  // i8
  public byte teleporterType;
  // f64
  public double mapId;

  public TeleportRequestMessage() {}

  public TeleportRequestMessage(byte teleporterType, double mapId) {
    this.teleporterType = teleporterType;
    this.mapId = mapId;
  }

  @Override
  public int getProtocolId() {
    return 5961;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.teleporterType);
    writer.write_f64(this.mapId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.teleporterType = reader.read_i8();
    this.mapId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "TeleportRequestMessage("
        + "teleporterType="
        + this.teleporterType
        + ", mapId="
        + this.mapId
        + ')';
  }
}
