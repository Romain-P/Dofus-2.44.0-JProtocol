// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterPlayingStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6347;
  // bool
  public boolean playing;

  public KrosmasterPlayingStatusMessage()
  {}

  public KrosmasterPlayingStatusMessage(boolean playing)
  {
    this.playing = playing;
  }

  @Override
  public int getProtocolId()
  {
    return 6347;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.playing);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playing = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "KrosmasterPlayingStatusMessage(" + "playing=" + this.playing + ')';
  }
}
