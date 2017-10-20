// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseGenericItemAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5947;
  // vi16
  public short objGenericId;

  public ExchangeBidHouseGenericItemAddedMessage() {}

  public ExchangeBidHouseGenericItemAddedMessage(short objGenericId) {
    this.objGenericId = objGenericId;
  }

  @Override
  public int getProtocolId() {
    return 5947;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.objGenericId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objGenericId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ExchangeBidHouseGenericItemAddedMessage(" + "objGenericId=" + this.objGenericId + ')';
  }
}
