// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildPaddockRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5955;
  // f64
  public double paddockId;

  public GuildPaddockRemovedMessage()
  {}

  public GuildPaddockRemovedMessage(double paddockId)
  {
    this.paddockId = paddockId;
  }

  @Override
  public int getProtocolId()
  {
    return 5955;
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

    return "GuildPaddockRemovedMessage(" + "paddockId=" + this.paddockId + ')';
  }
}
