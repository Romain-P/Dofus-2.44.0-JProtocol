// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismSetSabotagedRefusedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6466;
  // vi16
  public short subAreaId;
  // i8
  public byte reason;

  public PrismSetSabotagedRefusedMessage()
  {}

  public PrismSetSabotagedRefusedMessage(short subAreaId, byte reason)
  {
    this.subAreaId = subAreaId;
    this.reason = reason;
  }

  @Override
  public int getProtocolId()
  {
    return 6466;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.subAreaId);
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.subAreaId = reader.read_vi16();
    this.reason = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "PrismSetSabotagedRefusedMessage("
        + "subAreaId="
        + this.subAreaId
        + ", reason="
        + this.reason
        + ')';
  }
}
