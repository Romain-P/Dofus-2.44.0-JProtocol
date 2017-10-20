// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseBuyResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6272;
  // vi32
  public int uid;
  // bool
  public boolean bought;

  public ExchangeBidHouseBuyResultMessage() {}

  public ExchangeBidHouseBuyResultMessage(int uid, boolean bought) {
    this.uid = uid;
    this.bought = bought;
  }

  @Override
  public int getProtocolId() {
    return 6272;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.uid);
    writer.write_bool(this.bought);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.uid = reader.read_vi32();
    this.bought = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ExchangeBidHouseBuyResultMessage("
        + "uid="
        + this.uid
        + ", bought="
        + this.bought
        + ')';
  }
}
