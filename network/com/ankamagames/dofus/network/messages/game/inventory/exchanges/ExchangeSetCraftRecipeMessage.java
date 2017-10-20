// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeSetCraftRecipeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6389;
  // vi16
  public short objectGID;

  public ExchangeSetCraftRecipeMessage() {}

  public ExchangeSetCraftRecipeMessage(short objectGID) {
    this.objectGID = objectGID;
  }

  @Override
  public int getProtocolId() {
    return 6389;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.objectGID);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectGID = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ExchangeSetCraftRecipeMessage(" + "objectGID=" + this.objectGID + ')';
  }
}
