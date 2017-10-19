// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockToSellListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6141;
  // vi16
  public short pageIndex;

  public PaddockToSellListRequestMessage()
  {}

  public PaddockToSellListRequestMessage(short pageIndex)
  {
    this.pageIndex = pageIndex;
  }

  @Override
  public int getProtocolId()
  {
    return 6141;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.pageIndex);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.pageIndex = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "PaddockToSellListRequestMessage(" + "pageIndex=" + this.pageIndex + ')';
  }
}
