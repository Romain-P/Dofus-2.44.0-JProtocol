// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameServerInformations extends NetworkType {
  public static final int PROTOCOL_ID = 25;
  // vi16
  public short id;
  // i8
  public byte type;
  // i8
  public byte status;
  // i8
  public byte completion;
  // bool
  public boolean isSelectable;
  // i8
  public byte charactersCount;
  // i8
  public byte charactersSlots;
  // f64
  public double date;

  public GameServerInformations() {}

  public GameServerInformations(
      short id,
      byte type,
      byte status,
      byte completion,
      boolean isSelectable,
      byte charactersCount,
      byte charactersSlots,
      double date) {
    this.id = id;
    this.type = type;
    this.status = status;
    this.completion = completion;
    this.isSelectable = isSelectable;
    this.charactersCount = charactersCount;
    this.charactersSlots = charactersSlots;
    this.date = date;
  }

  @Override
  public int getProtocolId() {
    return 25;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.id);
    writer.write_i8(this.type);
    writer.write_i8(this.status);
    writer.write_i8(this.completion);
    writer.write_bool(this.isSelectable);
    writer.write_i8(this.charactersCount);
    writer.write_i8(this.charactersSlots);
    writer.write_f64(this.date);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_vi16();
    this.type = reader.read_i8();
    this.status = reader.read_i8();
    this.completion = reader.read_i8();
    this.isSelectable = reader.read_bool();
    this.charactersCount = reader.read_i8();
    this.charactersSlots = reader.read_i8();
    this.date = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameServerInformations("
        + "id="
        + this.id
        + ", type="
        + this.type
        + ", status="
        + this.status
        + ", completion="
        + this.completion
        + ", isSelectable="
        + this.isSelectable
        + ", charactersCount="
        + this.charactersCount
        + ", charactersSlots="
        + this.charactersSlots
        + ", date="
        + this.date
        + ')';
  }
}
