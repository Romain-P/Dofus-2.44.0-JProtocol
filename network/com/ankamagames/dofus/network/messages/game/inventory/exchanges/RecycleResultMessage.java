// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RecycleResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6601;
  // vi32
  public int nuggetsForPrism;
  // vi32
  public int nuggetsForPlayer;

  public RecycleResultMessage() {}

  public RecycleResultMessage(int nuggetsForPrism, int nuggetsForPlayer) {
    this.nuggetsForPrism = nuggetsForPrism;
    this.nuggetsForPlayer = nuggetsForPlayer;
  }

  @Override
  public int getProtocolId() {
    return 6601;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.nuggetsForPrism);
    writer.write_vi32(this.nuggetsForPlayer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.nuggetsForPrism = reader.read_vi32();
    this.nuggetsForPlayer = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "RecycleResultMessage("
        + "nuggetsForPrism="
        + this.nuggetsForPrism
        + ", nuggetsForPlayer="
        + this.nuggetsForPlayer
        + ')';
  }
}
