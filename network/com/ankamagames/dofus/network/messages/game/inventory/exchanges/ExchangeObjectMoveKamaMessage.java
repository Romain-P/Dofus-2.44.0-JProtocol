// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectMoveKamaMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5520;
  // vi64
  public long quantity;

  public ExchangeObjectMoveKamaMessage() {}

  public ExchangeObjectMoveKamaMessage(long quantity) {
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 5520;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.quantity = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeObjectMoveKamaMessage(" + "quantity=" + this.quantity + ')';
  }
}
