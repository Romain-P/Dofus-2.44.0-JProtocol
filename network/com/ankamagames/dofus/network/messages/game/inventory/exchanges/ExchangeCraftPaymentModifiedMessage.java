// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftPaymentModifiedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6578;
  // vi64
  public long goldSum;

  public ExchangeCraftPaymentModifiedMessage() {}

  public ExchangeCraftPaymentModifiedMessage(long goldSum) {
    this.goldSum = goldSum;
  }

  @Override
  public int getProtocolId() {
    return 6578;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.goldSum);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.goldSum = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeCraftPaymentModifiedMessage(" + "goldSum=" + this.goldSum + ')';
  }
}
