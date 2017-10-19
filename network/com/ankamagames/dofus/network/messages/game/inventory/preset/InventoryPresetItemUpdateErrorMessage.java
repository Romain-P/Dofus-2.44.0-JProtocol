// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetItemUpdateErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6211;
  // i8
  public byte code;

  public InventoryPresetItemUpdateErrorMessage()
  {}

  public InventoryPresetItemUpdateErrorMessage(byte code)
  {
    this.code = code;
  }

  @Override
  public int getProtocolId()
  {
    return 6211;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.code);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.code = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "InventoryPresetItemUpdateErrorMessage(" + "code=" + this.code + ')';
  }
}
