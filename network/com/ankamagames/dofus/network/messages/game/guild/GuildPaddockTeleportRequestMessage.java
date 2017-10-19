// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildPaddockTeleportRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5957;
  // f64
  public double paddockId;

  public GuildPaddockTeleportRequestMessage()
  {}

  public GuildPaddockTeleportRequestMessage(double paddockId)
  {
    this.paddockId = paddockId;
  }

  @Override
  public int getProtocolId()
  {
    return 5957;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.paddockId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.paddockId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GuildPaddockTeleportRequestMessage(" + "paddockId=" + this.paddockId + ')';
  }
}
