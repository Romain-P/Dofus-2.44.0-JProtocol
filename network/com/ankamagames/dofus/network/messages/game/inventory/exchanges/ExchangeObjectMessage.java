// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5515;
  // bool
  public boolean remote;

  public ExchangeObjectMessage() {}

  public ExchangeObjectMessage(boolean remote) {
    this.remote = remote;
  }

  @Override
  public int getProtocolId() {
    return 5515;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.remote);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.remote = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ExchangeObjectMessage(" + "remote=" + this.remote + ')';
  }
}
