// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountSetXpRatioRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5989;
  // i8
  public byte xpRatio;

  public MountSetXpRatioRequestMessage()
  {}

  public MountSetXpRatioRequestMessage(byte xpRatio)
  {
    this.xpRatio = xpRatio;
  }

  @Override
  public int getProtocolId()
  {
    return 5989;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.xpRatio);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.xpRatio = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "MountSetXpRatioRequestMessage(" + "xpRatio=" + this.xpRatio + ')';
  }
}
