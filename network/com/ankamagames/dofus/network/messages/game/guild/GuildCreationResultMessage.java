// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildCreationResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5554;
  // i8
  public byte result;

  public GuildCreationResultMessage()
  {}

  public GuildCreationResultMessage(byte result)
  {
    this.result = result;
  }

  @Override
  public int getProtocolId()
  {
    return 5554;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.result);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.result = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GuildCreationResultMessage(" + "result=" + this.result + ')';
  }
}
