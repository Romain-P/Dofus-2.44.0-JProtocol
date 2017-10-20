// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticDataShort
    extends com.ankamagames.dofus.network.types.common.basic.StatisticData {
  public static final int PROTOCOL_ID = 488;
  // i16
  public short value;

  public StatisticDataShort() {}

  public StatisticDataShort(short value) {

    super();
    this.value = value;
  }

  @Override
  public int getProtocolId() {
    return 488;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.value);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.value = reader.read_i16();
  }

  @Override
  public String toString() {

    return "StatisticDataShort(" + "value=" + this.value + ')';
  }
}
