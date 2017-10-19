// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class OrnamentSelectedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6369;
  // vi16
  public short ornamentId;

  public OrnamentSelectedMessage()
  {}

  public OrnamentSelectedMessage(short ornamentId)
  {
    this.ornamentId = ornamentId;
  }

  @Override
  public int getProtocolId()
  {
    return 6369;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.ornamentId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.ornamentId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "OrnamentSelectedMessage(" + "ornamentId=" + this.ornamentId + ')';
  }
}
