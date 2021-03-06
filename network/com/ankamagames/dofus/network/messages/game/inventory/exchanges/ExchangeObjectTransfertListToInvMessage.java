// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectTransfertListToInvMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6039;
  // array,vi32
  public int[] ids;

  public ExchangeObjectTransfertListToInvMessage() {}

  public ExchangeObjectTransfertListToInvMessage(int[] ids) {
    this.ids = ids;
  }

  @Override
  public int getProtocolId() {
    return 6039;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(ids.length);
    writer.write_array_vi32(this.ids);
  }

  @Override
  public void deserialize(DataReader reader) {

    int ids_length = reader.read_ui16();
    this.ids = reader.read_array_vi32(ids_length);
  }

  @Override
  public String toString() {

    return "ExchangeObjectTransfertListToInvMessage("
        + "ids="
        + java.util.Arrays.toString(this.ids)
        + ')';
  }
}
