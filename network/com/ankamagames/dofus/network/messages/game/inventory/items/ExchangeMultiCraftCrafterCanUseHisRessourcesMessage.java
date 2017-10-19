// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMultiCraftCrafterCanUseHisRessourcesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6020;
  // bool
  public boolean allowed;

  public ExchangeMultiCraftCrafterCanUseHisRessourcesMessage()
  {}

  public ExchangeMultiCraftCrafterCanUseHisRessourcesMessage(boolean allowed)
  {
    this.allowed = allowed;
  }

  @Override
  public int getProtocolId()
  {
    return 6020;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.allowed);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.allowed = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "ExchangeMultiCraftCrafterCanUseHisRessourcesMessage(" + "allowed=" + this.allowed + ')';
  }
}
