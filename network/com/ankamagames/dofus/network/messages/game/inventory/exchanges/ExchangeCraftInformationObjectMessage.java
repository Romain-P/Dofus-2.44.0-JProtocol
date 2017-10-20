// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftInformationObjectMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeCraftResultWithObjectIdMessage {
  public static final int PROTOCOL_ID = 5794;
  // vi64
  public long playerId;

  public ExchangeCraftInformationObjectMessage() {}

  public ExchangeCraftInformationObjectMessage(
      byte craftResult, short objectGenericId, long playerId) {

    super(craftResult, objectGenericId);
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId() {
    return 5794;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeCraftInformationObjectMessage("
        + "craftResult="
        + this.craftResult
        + ", objectGenericId="
        + this.objectGenericId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
