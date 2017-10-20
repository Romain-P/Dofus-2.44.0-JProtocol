// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeReadyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5511;
  // bool
  public boolean ready;
  // vi16
  public short step;

  public ExchangeReadyMessage() {}

  public ExchangeReadyMessage(boolean ready, short step) {
    this.ready = ready;
    this.step = step;
  }

  @Override
  public int getProtocolId() {
    return 5511;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.ready);
    writer.write_vi16(this.step);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.ready = reader.read_bool();
    this.step = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ExchangeReadyMessage(" + "ready=" + this.ready + ", step=" + this.step + ')';
  }
}
