// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSpellCastMessage
    extends com.ankamagames.dofus.network.messages.game.actions.fight
        .AbstractGameActionFightTargetedAbilityMessage {
  public static final int PROTOCOL_ID = 1010;
  // vi16
  public short spellId;
  // i16
  public short spellLevel;
  // array,i16
  public short[] portalsIds;

  public GameActionFightSpellCastMessage()
  {}

  public GameActionFightSpellCastMessage(
      short actionId,
      double sourceId,
      boolean silentCast,
      boolean verboseCast,
      double targetId,
      short destinationCellId,
      byte critical,
      short spellId,
      short spellLevel,
      short[] portalsIds)
  {

    super(actionId, sourceId, silentCast, verboseCast, targetId, destinationCellId, critical);
    this.spellId = spellId;
    this.spellLevel = spellLevel;
    this.portalsIds = portalsIds;
  }

  @Override
  public int getProtocolId()
  {
    return 1010;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.spellId);
    writer.write_i16(this.spellLevel);
    writer.write_ui16(portalsIds.length);
    writer.write_array_i16(this.portalsIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.spellId = reader.read_vi16();
    this.spellLevel = reader.read_i16();

    int portalsIds_length = reader.read_ui16();
    this.portalsIds = reader.read_array_i16(portalsIds_length);
  }

  @Override
  public String toString()
  {

    return "GameActionFightSpellCastMessage("
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
        + ", spellId="
        + this.spellId
        + ", spellLevel="
        + this.spellLevel
        + ", portalsIds="
        + java.util.Arrays.toString(this.portalsIds)
        + ')';
  }
}
