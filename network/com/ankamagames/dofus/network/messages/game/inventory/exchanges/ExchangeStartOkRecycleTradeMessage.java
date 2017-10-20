// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkRecycleTradeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6600;
  // i16
  public short percentToPrism;
  // i16
  public short percentToPlayer;

  public ExchangeStartOkRecycleTradeMessage() {}

  public ExchangeStartOkRecycleTradeMessage(short percentToPrism, short percentToPlayer) {
    this.percentToPrism = percentToPrism;
    this.percentToPlayer = percentToPlayer;
  }

  @Override
  public int getProtocolId() {
    return 6600;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.percentToPrism);
    writer.write_i16(this.percentToPlayer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.percentToPrism = reader.read_i16();
    this.percentToPlayer = reader.read_i16();
  }

  @Override
  public String toString() {

    return "ExchangeStartOkRecycleTradeMessage("
        + "percentToPrism="
        + this.percentToPrism
        + ", percentToPlayer="
        + this.percentToPlayer
        + ')';
  }
}
