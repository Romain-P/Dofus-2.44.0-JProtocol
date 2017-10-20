// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.interactive.zaap;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ZaapListMessage
    extends com.ankamagames.dofus.network.messages.game.interactive.zaap
        .TeleportDestinationsListMessage {
  public static final int PROTOCOL_ID = 1604;
  // f64
  public double spawnMapId;

  public ZaapListMessage() {}

  public ZaapListMessage(
      byte teleporterType,
      double[] mapIds,
      short[] subAreaIds,
      short[] costs,
      byte[] destTeleporterType,
      double spawnMapId) {

    super(teleporterType, mapIds, subAreaIds, costs, destTeleporterType);
    this.spawnMapId = spawnMapId;
  }

  @Override
  public int getProtocolId() {
    return 1604;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.spawnMapId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.spawnMapId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "ZaapListMessage("
        + "teleporterType="
        + this.teleporterType
        + ", mapIds="
        + java.util.Arrays.toString(this.mapIds)
        + ", subAreaIds="
        + java.util.Arrays.toString(this.subAreaIds)
        + ", costs="
        + java.util.Arrays.toString(this.costs)
        + ", destTeleporterType="
        + +this.destTeleporterType.length
        + "b"
        + ", spawnMapId="
        + this.spawnMapId
        + ')';
  }
}
