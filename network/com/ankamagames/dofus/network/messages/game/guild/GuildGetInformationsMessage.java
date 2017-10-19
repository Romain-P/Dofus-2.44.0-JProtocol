// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildGetInformationsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5550;
  // i8
  public byte infoType;

  public GuildGetInformationsMessage()
  {}

  public GuildGetInformationsMessage(byte infoType)
  {
    this.infoType = infoType;
  }

  @Override
  public int getProtocolId()
  {
    return 5550;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.infoType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.infoType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GuildGetInformationsMessage(" + "infoType=" + this.infoType + ')';
  }
}
