// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismSetSabotagedRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6468;
  // vi16
  public short subAreaId;

  public PrismSetSabotagedRequestMessage()
  {}

  public PrismSetSabotagedRequestMessage(short subAreaId)
  {
    this.subAreaId = subAreaId;
  }

  @Override
  public int getProtocolId()
  {
    return 6468;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.subAreaId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.subAreaId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "PrismSetSabotagedRequestMessage(" + "subAreaId=" + this.subAreaId + ')';
  }
}
