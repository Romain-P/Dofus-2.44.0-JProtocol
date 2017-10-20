// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectTransfertListWithQuantityToInvMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6470;
  // array,vi32
  public int[] ids;
  // array,vi32
  public int[] qtys;

  public ExchangeObjectTransfertListWithQuantityToInvMessage() {}

  public ExchangeObjectTransfertListWithQuantityToInvMessage(int[] ids, int[] qtys) {
    this.ids = ids;
    this.qtys = qtys;
  }

  @Override
  public int getProtocolId() {
    return 6470;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(ids.length);
    writer.write_array_vi32(this.ids);
    writer.write_ui16(qtys.length);
    writer.write_array_vi32(this.qtys);
  }

  @Override
  public void deserialize(DataReader reader) {

    int ids_length = reader.read_ui16();
    this.ids = reader.read_array_vi32(ids_length);

    int qtys_length = reader.read_ui16();
    this.qtys = reader.read_array_vi32(qtys_length);
  }

  @Override
  public String toString() {

    return "ExchangeObjectTransfertListWithQuantityToInvMessage("
        + "ids="
        + java.util.Arrays.toString(this.ids)
        + ", qtys="
        + java.util.Arrays.toString(this.qtys)
        + ')';
  }
}
