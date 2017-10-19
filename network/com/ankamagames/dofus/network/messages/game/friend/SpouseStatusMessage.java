// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpouseStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6265;
  // bool
  public boolean hasSpouse;

  public SpouseStatusMessage()
  {}

  public SpouseStatusMessage(boolean hasSpouse)
  {
    this.hasSpouse = hasSpouse;
  }

  @Override
  public int getProtocolId()
  {
    return 6265;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.hasSpouse);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.hasSpouse = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "SpouseStatusMessage(" + "hasSpouse=" + this.hasSpouse + ')';
  }
}
