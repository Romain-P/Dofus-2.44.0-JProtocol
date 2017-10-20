// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountsPaddockRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6559;
  // array,vi32
  public int[] mountsId;

  public ExchangeMountsPaddockRemoveMessage() {}

  public ExchangeMountsPaddockRemoveMessage(int[] mountsId) {
    this.mountsId = mountsId;
  }

  @Override
  public int getProtocolId() {
    return 6559;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(mountsId.length);
    writer.write_array_vi32(this.mountsId);
  }

  @Override
  public void deserialize(DataReader reader) {

    int mountsId_length = reader.read_ui16();
    this.mountsId = reader.read_array_vi32(mountsId_length);
  }

  @Override
  public String toString() {

    return "ExchangeMountsPaddockRemoveMessage("
        + "mountsId="
        + java.util.Arrays.toString(this.mountsId)
        + ')';
  }
}
