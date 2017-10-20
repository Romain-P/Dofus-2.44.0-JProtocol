// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeIsReadyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5509;
  // f64
  public double id;
  // bool
  public boolean ready;

  public ExchangeIsReadyMessage() {}

  public ExchangeIsReadyMessage(double id, boolean ready) {
    this.id = id;
    this.ready = ready;
  }

  @Override
  public int getProtocolId() {
    return 5509;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.id);
    writer.write_bool(this.ready);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_f64();
    this.ready = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ExchangeIsReadyMessage(" + "id=" + this.id + ", ready=" + this.ready + ')';
  }
}
