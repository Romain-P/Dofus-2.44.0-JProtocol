// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntLegendaryRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6499;
  // vi16
  public short legendaryId;

  public TreasureHuntLegendaryRequestMessage()
  {}

  public TreasureHuntLegendaryRequestMessage(short legendaryId)
  {
    this.legendaryId = legendaryId;
  }

  @Override
  public int getProtocolId()
  {
    return 6499;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.legendaryId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.legendaryId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "TreasureHuntLegendaryRequestMessage(" + "legendaryId=" + this.legendaryId + ')';
  }
}
