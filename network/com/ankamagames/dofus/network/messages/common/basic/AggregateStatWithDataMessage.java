// Created by Heat the 2017-10-20 01:53:21+02:00
package com.ankamagames.dofus.network.messages.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AggregateStatWithDataMessage
    extends com.ankamagames.dofus.network.messages.common.basic.AggregateStatMessage {
  public static final int PROTOCOL_ID = 6662;
  // array,com.ankamagames.dofus.network.types.common.basic.StatisticData
  public com.ankamagames.dofus.network.types.common.basic.StatisticData[] datas;

  public AggregateStatWithDataMessage() {}

  public AggregateStatWithDataMessage(
      short statId, com.ankamagames.dofus.network.types.common.basic.StatisticData[] datas) {

    super(statId);
    this.datas = datas;
  }

  public AggregateStatWithDataMessage(
      short statId,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.common.basic.StatisticData>
          datas) {

    super(statId);
    this.datas =
        datas.toArray(com.ankamagames.dofus.network.types.common.basic.StatisticData[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6662;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(datas.length);

    for (int i = 0; i < datas.length; i++) {

      writer.write_ui16(datas[i].getProtocolId());

      datas[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int datas_length = reader.read_ui16();
    this.datas = new com.ankamagames.dofus.network.types.common.basic.StatisticData[datas_length];

    for (int i = 0; i < datas_length; i++) {

      int datas_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.common.basic.StatisticData datas_it =
          (com.ankamagames.dofus.network.types.common.basic.StatisticData)
              InternalProtocolTypeManager.get(datas_it_typeId);

      datas_it.deserialize(reader);
      this.datas[i] = datas_it;
    }
  }

  @Override
  public String toString() {

    return "AggregateStatWithDataMessage("
        + "statId="
        + this.statId
        + ", datas="
        + java.util.Arrays.toString(this.datas)
        + ')';
  }
}
