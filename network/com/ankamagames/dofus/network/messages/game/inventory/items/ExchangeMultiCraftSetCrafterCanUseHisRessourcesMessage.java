// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMultiCraftSetCrafterCanUseHisRessourcesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6021;
  // bool
  public boolean allow;

  public ExchangeMultiCraftSetCrafterCanUseHisRessourcesMessage() {}

  public ExchangeMultiCraftSetCrafterCanUseHisRessourcesMessage(boolean allow) {
    this.allow = allow;
  }

  @Override
  public int getProtocolId() {
    return 6021;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.allow);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allow = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ExchangeMultiCraftSetCrafterCanUseHisRessourcesMessage(" + "allow=" + this.allow + ')';
  }
}
