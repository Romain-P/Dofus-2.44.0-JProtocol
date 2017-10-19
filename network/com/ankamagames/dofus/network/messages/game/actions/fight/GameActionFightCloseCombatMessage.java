// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightCloseCombatMessage
    extends com.ankamagames.dofus.network.messages.game.actions.fight
        .AbstractGameActionFightTargetedAbilityMessage {
  public static final int PROTOCOL_ID = 6116;
  // vi16
  public short weaponGenericId;

  public GameActionFightCloseCombatMessage()
  {}

  public GameActionFightCloseCombatMessage(
      short actionId,
      double sourceId,
      boolean silentCast,
      boolean verboseCast,
      double targetId,
      short destinationCellId,
      byte critical,
      short weaponGenericId)
  {

    super(actionId, sourceId, silentCast, verboseCast, targetId, destinationCellId, critical);
    this.weaponGenericId = weaponGenericId;
  }

  @Override
  public int getProtocolId()
  {
    return 6116;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.weaponGenericId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.weaponGenericId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameActionFightCloseCombatMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", silentCast="
        + this.silentCast
        + ", verboseCast="
        + this.verboseCast
        + ", targetId="
        + this.targetId
        + ", destinationCellId="
        + this.destinationCellId
        + ", critical="
        + this.critical
        + ", weaponGenericId="
        + this.weaponGenericId
        + ')';
  }
}
