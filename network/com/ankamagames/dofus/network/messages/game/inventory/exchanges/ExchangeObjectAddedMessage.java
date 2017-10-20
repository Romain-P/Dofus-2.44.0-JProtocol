// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectAddedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 5516;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem object;

  public ExchangeObjectAddedMessage() {}

  public ExchangeObjectAddedMessage(
      boolean remote, com.ankamagames.dofus.network.types.game.data.items.ObjectItem object) {

    super(remote);
    this.object = object;
  }

  @Override
  public int getProtocolId() {
    return 5516;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.object.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();
    this.object.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ExchangeObjectAddedMessage("
        + "remote="
        + this.remote
        + ", object="
        + this.object
        + ')';
  }
}
