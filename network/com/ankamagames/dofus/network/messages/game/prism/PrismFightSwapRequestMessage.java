// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightSwapRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5901;
  // vi16
  public short subAreaId;
  // ui64
  public java.math.BigInteger targetId;

  public PrismFightSwapRequestMessage()
  {}

  public PrismFightSwapRequestMessage(short subAreaId, java.math.BigInteger targetId)
  {
    this.subAreaId = subAreaId;
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 5901;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.subAreaId);
    writer.write_ui64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.subAreaId = reader.read_vi16();
    this.targetId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PrismFightSwapRequestMessage("
        + "subAreaId="
        + this.subAreaId
        + ", targetId="
        + this.targetId
        + ')';
  }
}
