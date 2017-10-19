// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractPresetDeleteMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6735;
  // i8
  public byte presetId;

  public AbstractPresetDeleteMessage()
  {}

  public AbstractPresetDeleteMessage(byte presetId)
  {
    this.presetId = presetId;
  }

  @Override
  public int getProtocolId()
  {
    return 6735;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.presetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.presetId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AbstractPresetDeleteMessage(" + "presetId=" + this.presetId + ')';
  }
}
