// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ItemDurability extends NetworkType {
  public static final int PROTOCOL_ID = 168;
  // i16
  public short durability;
  // i16
  public short durabilityMax;

  public ItemDurability()
  {}

  public ItemDurability(short durability, short durabilityMax)
  {
    this.durability = durability;
    this.durabilityMax = durabilityMax;
  }

  @Override
  public int getProtocolId()
  {
    return 168;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i16(this.durability);
    writer.write_i16(this.durabilityMax);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.durability = reader.read_i16();
    this.durabilityMax = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "ItemDurability("
        + "durability="
        + this.durability
        + ", durabilityMax="
        + this.durabilityMax
        + ')';
  }
}
