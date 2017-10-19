// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectDate
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 72;
  // vi16
  public short year;
  // i8
  public byte month;
  // i8
  public byte day;
  // i8
  public byte hour;
  // i8
  public byte minute;

  public ObjectEffectDate()
  {}

  public ObjectEffectDate(
      short actionId, short year, byte month, byte day, byte hour, byte minute)
  {

    super(actionId);
    this.year = year;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
  }

  @Override
  public int getProtocolId()
  {
    return 72;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.year);
    writer.write_i8(this.month);
    writer.write_i8(this.day);
    writer.write_i8(this.hour);
    writer.write_i8(this.minute);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.year = reader.read_vi16();
    this.month = reader.read_i8();
    this.day = reader.read_i8();
    this.hour = reader.read_i8();
    this.minute = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ObjectEffectDate("
        + "actionId="
        + this.actionId
        + ", year="
        + this.year
        + ", month="
        + this.month
        + ", day="
        + this.day
        + ", hour="
        + this.hour
        + ", minute="
        + this.minute
        + ')';
  }
}
