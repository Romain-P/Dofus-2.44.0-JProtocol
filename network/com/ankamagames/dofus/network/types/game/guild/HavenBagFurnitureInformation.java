// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagFurnitureInformation extends NetworkType {
  public static final int PROTOCOL_ID = 498;
  // vi16
  public short cellId;
  // i32
  public int funitureId;
  // i8
  public byte orientation;

  public HavenBagFurnitureInformation() {}

  public HavenBagFurnitureInformation(short cellId, int funitureId, byte orientation) {
    this.cellId = cellId;
    this.funitureId = funitureId;
    this.orientation = orientation;
  }

  @Override
  public int getProtocolId() {
    return 498;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cellId);
    writer.write_i32(this.funitureId);
    writer.write_i8(this.orientation);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cellId = reader.read_vi16();
    this.funitureId = reader.read_i32();
    this.orientation = reader.read_i8();
  }

  @Override
  public String toString() {

    return "HavenBagFurnitureInformation("
        + "cellId="
        + this.cellId
        + ", funitureId="
        + this.funitureId
        + ", orientation="
        + this.orientation
        + ')';
  }
}
