// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightLoot extends NetworkType {
  public static final int PROTOCOL_ID = 41;
  // array,vi16
  public short[] objects;
  // ui64
  public java.math.BigInteger kamas;

  public FightLoot()
  {}

  public FightLoot(short[] objects, java.math.BigInteger kamas)
  {
    this.objects = objects;
    this.kamas = kamas;
  }

  @Override
  public int getProtocolId()
  {
    return 41;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objects.length);
    writer.write_array_vi16(this.objects);
    writer.write_ui64(this.kamas);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objects_length = reader.read_ui16();
    this.objects = reader.read_array_vi16(objects_length);
    this.kamas = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "FightLoot("
        + "objects="
        + java.util.Arrays.toString(this.objects)
        + ", kamas="
        + this.kamas
        + ')';
  }
}
