// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EntityDispositionInformations extends NetworkType {
  public static final int PROTOCOL_ID = 60;
  // i16
  public short cellId;
  // i8
  public byte direction;

  public EntityDispositionInformations() {}

  public EntityDispositionInformations(short cellId, byte direction) {
    this.cellId = cellId;
    this.direction = direction;
  }

  @Override
  public int getProtocolId() {
    return 60;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.cellId);
    writer.write_i8(this.direction);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cellId = reader.read_i16();
    this.direction = reader.read_i8();
  }

  @Override
  public String toString() {

    return "EntityDispositionInformations("
        + "cellId="
        + this.cellId
        + ", direction="
        + this.direction
        + ')';
  }
}
