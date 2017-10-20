// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHousePriceMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5805;
  // vi16
  public short genId;

  public ExchangeBidHousePriceMessage() {}

  public ExchangeBidHousePriceMessage(short genId) {
    this.genId = genId;
  }

  @Override
  public int getProtocolId() {
    return 5805;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.genId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.genId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ExchangeBidHousePriceMessage(" + "genId=" + this.genId + ')';
  }
}
