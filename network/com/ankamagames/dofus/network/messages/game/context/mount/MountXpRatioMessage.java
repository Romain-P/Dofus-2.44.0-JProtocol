// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountXpRatioMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5970;
  // i8
  public byte ratio;

  public MountXpRatioMessage()
  {}

  public MountXpRatioMessage(byte ratio)
  {
    this.ratio = ratio;
  }

  @Override
  public int getProtocolId()
  {
    return 5970;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.ratio);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.ratio = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "MountXpRatioMessage(" + "ratio=" + this.ratio + ')';
  }
}
