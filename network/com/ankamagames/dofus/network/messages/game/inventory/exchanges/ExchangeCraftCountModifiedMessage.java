// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftCountModifiedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6595;
  // vi32
  public int count;

  public ExchangeCraftCountModifiedMessage() {}

  public ExchangeCraftCountModifiedMessage(int count) {
    this.count = count;
  }

  @Override
  public int getProtocolId() {
    return 6595;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.count);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.count = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeCraftCountModifiedMessage(" + "count=" + this.count + ')';
  }
}
