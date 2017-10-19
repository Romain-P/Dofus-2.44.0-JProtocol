// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PortalDialogCreationMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.npc
        .NpcDialogCreationMessage {
  public static final int PROTOCOL_ID = 6737;
  // i32
  public int type;

  public PortalDialogCreationMessage()
  {}

  public PortalDialogCreationMessage(double mapId, int npcId, int type)
  {

    super(mapId, npcId);
    this.type = type;
  }

  @Override
  public int getProtocolId()
  {
    return 6737;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.type);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.type = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "PortalDialogCreationMessage("
        + "mapId="
        + this.mapId
        + ", npcId="
        + this.npcId
        + ", type="
        + this.type
        + ')';
  }
}
