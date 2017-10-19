// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcGenericActionRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5898;
  // i32
  public int npcId;
  // i8
  public byte npcActionId;
  // f64
  public double npcMapId;

  public NpcGenericActionRequestMessage()
  {}

  public NpcGenericActionRequestMessage(int npcId, byte npcActionId, double npcMapId)
  {
    this.npcId = npcId;
    this.npcActionId = npcActionId;
    this.npcMapId = npcMapId;
  }

  @Override
  public int getProtocolId()
  {
    return 5898;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.npcId);
    writer.write_i8(this.npcActionId);
    writer.write_f64(this.npcMapId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.npcId = reader.read_i32();
    this.npcActionId = reader.read_i8();
    this.npcMapId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "NpcGenericActionRequestMessage("
        + "npcId="
        + this.npcId
        + ", npcActionId="
        + this.npcActionId
        + ", npcMapId="
        + this.npcMapId
        + ')';
  }
}
