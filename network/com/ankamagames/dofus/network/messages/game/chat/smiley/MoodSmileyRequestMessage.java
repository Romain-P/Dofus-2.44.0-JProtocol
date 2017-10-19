// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MoodSmileyRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6192;
  // vi16
  public short smileyId;

  public MoodSmileyRequestMessage()
  {}

  public MoodSmileyRequestMessage(short smileyId)
  {
    this.smileyId = smileyId;
  }

  @Override
  public int getProtocolId()
  {
    return 6192;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.smileyId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.smileyId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "MoodSmileyRequestMessage(" + "smileyId=" + this.smileyId + ')';
  }
}
