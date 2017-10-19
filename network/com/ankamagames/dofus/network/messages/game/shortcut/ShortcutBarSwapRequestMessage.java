// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShortcutBarSwapRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6230;
  // i8
  public byte barType;
  // i8
  public byte firstSlot;
  // i8
  public byte secondSlot;

  public ShortcutBarSwapRequestMessage()
  {}

  public ShortcutBarSwapRequestMessage(byte barType, byte firstSlot, byte secondSlot)
  {
    this.barType = barType;
    this.firstSlot = firstSlot;
    this.secondSlot = secondSlot;
  }

  @Override
  public int getProtocolId()
  {
    return 6230;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.barType);
    writer.write_i8(this.firstSlot);
    writer.write_i8(this.secondSlot);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.barType = reader.read_i8();
    this.firstSlot = reader.read_i8();
    this.secondSlot = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ShortcutBarSwapRequestMessage("
        + "barType="
        + this.barType
        + ", firstSlot="
        + this.firstSlot
        + ", secondSlot="
        + this.secondSlot
        + ')';
  }
}
