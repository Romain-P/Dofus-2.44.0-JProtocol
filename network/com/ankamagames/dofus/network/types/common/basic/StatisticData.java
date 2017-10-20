// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatisticData extends NetworkType {
  public static final int PROTOCOL_ID = 484;

  public StatisticData() {}

  @Override
  public int getProtocolId() {
    return 484;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "StatisticData";
  }
}
