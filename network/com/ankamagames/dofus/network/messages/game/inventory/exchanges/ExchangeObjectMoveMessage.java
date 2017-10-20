// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectMoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5518;
  // vi32
  public int objectUID;
  // vi32
  public int quantity;

  public ExchangeObjectMoveMessage() {}

  public ExchangeObjectMoveMessage(int objectUID, int quantity) {
    this.objectUID = objectUID;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 5518;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.objectUID);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectUID = reader.read_vi32();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeObjectMoveMessage("
        + "objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ')';
  }
}
