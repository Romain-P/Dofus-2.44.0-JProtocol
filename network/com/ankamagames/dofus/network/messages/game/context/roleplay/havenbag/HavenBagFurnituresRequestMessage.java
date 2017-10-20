// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagFurnituresRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6637;
  // array,vi16
  public short[] cellIds;
  // array,i32
  public int[] funitureIds;
  // array,i8
  public byte[] orientations;

  public HavenBagFurnituresRequestMessage() {}

  public HavenBagFurnituresRequestMessage(short[] cellIds, int[] funitureIds, byte[] orientations) {
    this.cellIds = cellIds;
    this.funitureIds = funitureIds;
    this.orientations = orientations;
  }

  @Override
  public int getProtocolId() {
    return 6637;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(cellIds.length);
    writer.write_array_vi16(this.cellIds);
    writer.write_ui16(funitureIds.length);
    writer.write_array_i32(this.funitureIds);
    writer.write_ui16(orientations.length);
    writer.write_array_i8(this.orientations);
  }

  @Override
  public void deserialize(DataReader reader) {

    int cellIds_length = reader.read_ui16();
    this.cellIds = reader.read_array_vi16(cellIds_length);

    int funitureIds_length = reader.read_ui16();
    this.funitureIds = reader.read_array_i32(funitureIds_length);

    int orientations_length = reader.read_ui16();
    this.orientations = reader.read_array_i8(orientations_length);
  }

  @Override
  public String toString() {

    return "HavenBagFurnituresRequestMessage("
        + "cellIds="
        + java.util.Arrays.toString(this.cellIds)
        + ", funitureIds="
        + java.util.Arrays.toString(this.funitureIds)
        + ", orientations="
        + +this.orientations.length
        + "b"
        + ')';
  }
}
