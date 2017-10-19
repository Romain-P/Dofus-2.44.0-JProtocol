// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightMarkCellsMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5540;
  // com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark
  public com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark mark;

  public GameActionFightMarkCellsMessage()
  {}

  public GameActionFightMarkCellsMessage(
      short actionId,
      double sourceId,
      com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark mark)
  {

    super(actionId, sourceId);
    this.mark = mark;
  }

  @Override
  public int getProtocolId()
  {
    return 5540;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.mark.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.mark = new com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark();
    this.mark.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameActionFightMarkCellsMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", mark="
        + this.mark
        + ')';
  }
}
