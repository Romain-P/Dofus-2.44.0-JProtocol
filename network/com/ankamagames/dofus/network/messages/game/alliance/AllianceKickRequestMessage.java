// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceKickRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6400;
  // vi32
  public int kickedId;

  public AllianceKickRequestMessage()
  {}

  public AllianceKickRequestMessage(int kickedId)
  {
    this.kickedId = kickedId;
  }

  @Override
  public int getProtocolId()
  {
    return 6400;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.kickedId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.kickedId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "AllianceKickRequestMessage(" + "kickedId=" + this.kickedId + ')';
  }
}
