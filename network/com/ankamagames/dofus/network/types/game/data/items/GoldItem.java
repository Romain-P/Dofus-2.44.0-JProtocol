// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GoldItem extends com.ankamagames.dofus.network.types.game.data.items.Item {
  public static final int PROTOCOL_ID = 123;
  // vi64
  public long sum;

  public GoldItem() {}

  public GoldItem(long sum) {

    super();
    this.sum = sum;
  }

  @Override
  public int getProtocolId() {
    return 123;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.sum);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.sum = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "GoldItem(" + "sum=" + this.sum + ')';
  }
}
