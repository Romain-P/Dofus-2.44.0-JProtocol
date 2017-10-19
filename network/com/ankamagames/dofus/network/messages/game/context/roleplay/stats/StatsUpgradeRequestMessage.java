// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatsUpgradeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5610;
  // bool
  public boolean useAdditionnal;
  // i8
  public byte statId;
  // vi16
  public short boostPoint;

  public StatsUpgradeRequestMessage()
  {}

  public StatsUpgradeRequestMessage(boolean useAdditionnal, byte statId, short boostPoint)
  {
    this.useAdditionnal = useAdditionnal;
    this.statId = statId;
    this.boostPoint = boostPoint;
  }

  @Override
  public int getProtocolId()
  {
    return 5610;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.useAdditionnal);
    writer.write_i8(this.statId);
    writer.write_vi16(this.boostPoint);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.useAdditionnal = reader.read_bool();
    this.statId = reader.read_i8();
    this.boostPoint = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "StatsUpgradeRequestMessage("
        + "useAdditionnal="
        + this.useAdditionnal
        + ", statId="
        + this.statId
        + ", boostPoint="
        + this.boostPoint
        + ')';
  }
}
