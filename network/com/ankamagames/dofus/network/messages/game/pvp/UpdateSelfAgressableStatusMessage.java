// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.pvp;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateSelfAgressableStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6456;
  // i8
  public byte status;
  // i32
  public int probationTime;

  public UpdateSelfAgressableStatusMessage()
  {}

  public UpdateSelfAgressableStatusMessage(byte status, int probationTime)
  {
    this.status = status;
    this.probationTime = probationTime;
  }

  @Override
  public int getProtocolId()
  {
    return 6456;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.status);
    writer.write_i32(this.probationTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.status = reader.read_i8();
    this.probationTime = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "UpdateSelfAgressableStatusMessage("
        + "status="
        + this.status
        + ", probationTime="
        + this.probationTime
        + ')';
  }
}
