// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightChangeLookMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5532;
  // f64
  public double targetId;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook entityLook;

  public GameActionFightChangeLookMessage()
  {}

  public GameActionFightChangeLookMessage(
      short actionId,
      double sourceId,
      double targetId,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook)
  {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.entityLook = entityLook;
  }

  @Override
  public int getProtocolId()
  {
    return 5532;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    this.entityLook.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.entityLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.entityLook.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameActionFightChangeLookMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", entityLook="
        + this.entityLook
        + ')';
  }
}
