// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseTypeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5803;
  // vi32
  public int type;

  public ExchangeBidHouseTypeMessage() {}

  public ExchangeBidHouseTypeMessage(int type) {
    this.type = type;
  }

  @Override
  public int getProtocolId() {
    return 5803;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.type);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeBidHouseTypeMessage(" + "type=" + this.type + ')';
  }
}
