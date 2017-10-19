// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive.zaap;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportDestinationsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5960;
  // i8
  public byte teleporterType;
  // array,f64
  public double[] mapIds;
  // array,vi16
  public short[] subAreaIds;
  // array,vi16
  public short[] costs;
  // array,i8
  public byte[] destTeleporterType;

  public TeleportDestinationsListMessage()
  {}

  public TeleportDestinationsListMessage(
      byte teleporterType,
      double[] mapIds,
      short[] subAreaIds,
      short[] costs,
      byte[] destTeleporterType)
  {
    this.teleporterType = teleporterType;
    this.mapIds = mapIds;
    this.subAreaIds = subAreaIds;
    this.costs = costs;
    this.destTeleporterType = destTeleporterType;
  }

  @Override
  public int getProtocolId()
  {
    return 5960;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.teleporterType);
    writer.write_ui16(mapIds.length);
    writer.write_array_f64(this.mapIds);
    writer.write_ui16(subAreaIds.length);
    writer.write_array_vi16(this.subAreaIds);
    writer.write_ui16(costs.length);
    writer.write_array_vi16(this.costs);
    writer.write_ui16(destTeleporterType.length);
    writer.write_array_i8(this.destTeleporterType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.teleporterType = reader.read_i8();

    int mapIds_length = reader.read_ui16();
    this.mapIds = reader.read_array_f64(mapIds_length);

    int subAreaIds_length = reader.read_ui16();
    this.subAreaIds = reader.read_array_vi16(subAreaIds_length);

    int costs_length = reader.read_ui16();
    this.costs = reader.read_array_vi16(costs_length);

    int destTeleporterType_length = reader.read_ui16();
    this.destTeleporterType = reader.read_array_i8(destTeleporterType_length);
  }

  @Override
  public String toString()
  {

    return "TeleportDestinationsListMessage("
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
        + ')';
  }
}
