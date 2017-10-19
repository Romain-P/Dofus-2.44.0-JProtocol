// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GoldAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6030;
  // com.ankamagames.dofus.network.types.game.data.items.GoldItem
  public com.ankamagames.dofus.network.types.game.data.items.GoldItem gold;

  public GoldAddedMessage()
  {}

  public GoldAddedMessage(com.ankamagames.dofus.network.types.game.data.items.GoldItem gold)
  {
    this.gold = gold;
  }

  @Override
  public int getProtocolId()
  {
    return 6030;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.gold.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.gold = new com.ankamagames.dofus.network.types.game.data.items.GoldItem();
    this.gold.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GoldAddedMessage(" + "gold=" + this.gold + ')';
  }
}
