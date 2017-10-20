// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildEmblem extends NetworkType {
  public static final int PROTOCOL_ID = 87;
  // vi16
  public short symbolShape;
  // i32
  public int symbolColor;
  // i8
  public byte backgroundShape;
  // i32
  public int backgroundColor;

  public GuildEmblem() {}

  public GuildEmblem(
      short symbolShape, int symbolColor, byte backgroundShape, int backgroundColor) {
    this.symbolShape = symbolShape;
    this.symbolColor = symbolColor;
    this.backgroundShape = backgroundShape;
    this.backgroundColor = backgroundColor;
  }

  @Override
  public int getProtocolId() {
    return 87;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.symbolShape);
    writer.write_i32(this.symbolColor);
    writer.write_i8(this.backgroundShape);
    writer.write_i32(this.backgroundColor);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.symbolShape = reader.read_vi16();
    this.symbolColor = reader.read_i32();
    this.backgroundShape = reader.read_i8();
    this.backgroundColor = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GuildEmblem("
        + "symbolShape="
        + this.symbolShape
        + ", symbolColor="
        + this.symbolColor
        + ", backgroundShape="
        + this.backgroundShape
        + ", backgroundColor="
        + this.backgroundColor
        + ')';
  }
}
