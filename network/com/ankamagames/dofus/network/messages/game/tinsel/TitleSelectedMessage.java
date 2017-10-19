// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TitleSelectedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6366;
  // vi16
  public short titleId;

  public TitleSelectedMessage()
  {}

  public TitleSelectedMessage(short titleId)
  {
    this.titleId = titleId;
  }

  @Override
  public int getProtocolId()
  {
    return 6366;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.titleId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.titleId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "TitleSelectedMessage(" + "titleId=" + this.titleId + ')';
  }
}
