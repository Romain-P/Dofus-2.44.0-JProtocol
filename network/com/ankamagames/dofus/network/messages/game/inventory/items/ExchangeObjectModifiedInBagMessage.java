// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectModifiedInBagMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 6008;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem object;

  public ExchangeObjectModifiedInBagMessage()
  {}

  public ExchangeObjectModifiedInBagMessage(
      boolean remote, com.ankamagames.dofus.network.types.game.data.items.ObjectItem object)
  {

    super(remote);
    this.object = object;
  }

  @Override
  public int getProtocolId()
  {
    return 6008;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.object.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();
    this.object.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ExchangeObjectModifiedInBagMessage("
        + "remote="
        + this.remote
        + ", object="
        + this.object
        + ')';
  }
}
