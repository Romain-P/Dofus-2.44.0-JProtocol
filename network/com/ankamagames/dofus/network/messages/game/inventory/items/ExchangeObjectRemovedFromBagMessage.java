// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectRemovedFromBagMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 6010;
  // vi32
  public int objectUID;

  public ExchangeObjectRemovedFromBagMessage() {}

  public ExchangeObjectRemovedFromBagMessage(boolean remote, int objectUID) {

    super(remote);
    this.objectUID = objectUID;
  }

  @Override
  public int getProtocolId() {
    return 6010;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.objectUID);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.objectUID = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeObjectRemovedFromBagMessage("
        + "remote="
        + this.remote
        + ", objectUID="
        + this.objectUID
        + ')';
  }
}
