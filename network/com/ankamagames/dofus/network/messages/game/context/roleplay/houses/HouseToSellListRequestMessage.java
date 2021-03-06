// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseToSellListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6139;
  // vi16
  public short pageIndex;

  public HouseToSellListRequestMessage() {}

  public HouseToSellListRequestMessage(short pageIndex) {
    this.pageIndex = pageIndex;
  }

  @Override
  public int getProtocolId() {
    return 6139;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.pageIndex);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.pageIndex = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "HouseToSellListRequestMessage(" + "pageIndex=" + this.pageIndex + ')';
  }
}
