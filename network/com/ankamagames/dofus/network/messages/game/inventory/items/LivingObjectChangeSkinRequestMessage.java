// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LivingObjectChangeSkinRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5725;
  // vi32
  public int livingUID;
  // ui8
  public short livingPosition;
  // vi32
  public int skinId;

  public LivingObjectChangeSkinRequestMessage()
  {}

  public LivingObjectChangeSkinRequestMessage(int livingUID, short livingPosition, int skinId)
  {
    this.livingUID = livingUID;
    this.livingPosition = livingPosition;
    this.skinId = skinId;
  }

  @Override
  public int getProtocolId()
  {
    return 5725;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.livingUID);
    writer.write_ui8(this.livingPosition);
    writer.write_vi32(this.skinId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.livingUID = reader.read_vi32();
    this.livingPosition = reader.read_ui8();
    this.skinId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "LivingObjectChangeSkinRequestMessage("
        + "livingUID="
        + this.livingUID
        + ", livingPosition="
        + this.livingPosition
        + ", skinId="
        + this.skinId
        + ')';
  }
}
