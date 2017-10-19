// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockItem
    extends com.ankamagames.dofus.network.types.game.context.roleplay.ObjectItemInRolePlay {
  public static final int PROTOCOL_ID = 185;
  // com.ankamagames.dofus.network.types.game.mount.ItemDurability
  public com.ankamagames.dofus.network.types.game.mount.ItemDurability durability;

  public PaddockItem()
  {}

  public PaddockItem(
      short cellId,
      short objectGID,
      com.ankamagames.dofus.network.types.game.mount.ItemDurability durability)
  {

    super(cellId, objectGID);
    this.durability = durability;
  }

  @Override
  public int getProtocolId()
  {
    return 185;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.durability.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.durability = new com.ankamagames.dofus.network.types.game.mount.ItemDurability();
    this.durability.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PaddockItem("
        + "cellId="
        + this.cellId
        + ", objectGID="
        + this.objectGID
        + ", durability="
        + this.durability
        + ')';
  }
}
