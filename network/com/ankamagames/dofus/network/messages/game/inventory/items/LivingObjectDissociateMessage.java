// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LivingObjectDissociateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5723;
  // vi32
  public int livingUID;
  // ui8
  public short livingPosition;

  public LivingObjectDissociateMessage()
  {}

  public LivingObjectDissociateMessage(int livingUID, short livingPosition)
  {
    this.livingUID = livingUID;
    this.livingPosition = livingPosition;
  }

  @Override
  public int getProtocolId()
  {
    return 5723;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.livingUID);
    writer.write_ui8(this.livingPosition);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.livingUID = reader.read_vi32();
    this.livingPosition = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "LivingObjectDissociateMessage("
        + "livingUID="
        + this.livingUID
        + ", livingPosition="
        + this.livingPosition
        + ')';
  }
}
