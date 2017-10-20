// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionMarkedCell extends NetworkType {
  public static final int PROTOCOL_ID = 85;
  // vi16
  public short cellId;
  // i8
  public byte zoneSize;
  // i32
  public int cellColor;
  // i8
  public byte cellsType;

  public GameActionMarkedCell() {}

  public GameActionMarkedCell(short cellId, byte zoneSize, int cellColor, byte cellsType) {
    this.cellId = cellId;
    this.zoneSize = zoneSize;
    this.cellColor = cellColor;
    this.cellsType = cellsType;
  }

  @Override
  public int getProtocolId() {
    return 85;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cellId);
    writer.write_i8(this.zoneSize);
    writer.write_i32(this.cellColor);
    writer.write_i8(this.cellsType);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cellId = reader.read_vi16();
    this.zoneSize = reader.read_i8();
    this.cellColor = reader.read_i32();
    this.cellsType = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameActionMarkedCell("
        + "cellId="
        + this.cellId
        + ", zoneSize="
        + this.zoneSize
        + ", cellColor="
        + this.cellColor
        + ", cellsType="
        + this.cellsType
        + ')';
  }
}
