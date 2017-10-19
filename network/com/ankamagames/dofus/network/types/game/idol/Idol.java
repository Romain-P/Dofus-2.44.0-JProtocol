// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class Idol extends NetworkType {
  public static final int PROTOCOL_ID = 489;
  // vi16
  public short id;
  // vi16
  public short xpBonusPercent;
  // vi16
  public short dropBonusPercent;

  public Idol()
  {}

  public Idol(short id, short xpBonusPercent, short dropBonusPercent)
  {
    this.id = id;
    this.xpBonusPercent = xpBonusPercent;
    this.dropBonusPercent = dropBonusPercent;
  }

  @Override
  public int getProtocolId()
  {
    return 489;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.id);
    writer.write_vi16(this.xpBonusPercent);
    writer.write_vi16(this.dropBonusPercent);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi16();
    this.xpBonusPercent = reader.read_vi16();
    this.dropBonusPercent = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "Idol("
        + "id="
        + this.id
        + ", xpBonusPercent="
        + this.xpBonusPercent
        + ", dropBonusPercent="
        + this.dropBonusPercent
        + ')';
  }
}
