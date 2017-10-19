// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightMonsterInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.GameFightAIInformations {
  public static final int PROTOCOL_ID = 29;
  // vi16
  public short creatureGenericId;
  // i8
  public byte creatureGrade;

  public GameFightMonsterInformations()
  {}

  public GameFightMonsterInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      short creatureGenericId,
      byte creatureGrade)
  {

    super(contextualId, look, disposition, teamId, wave, alive, stats, previousPositions);
    this.creatureGenericId = creatureGenericId;
    this.creatureGrade = creatureGrade;
  }

  @Override
  public int getProtocolId()
  {
    return 29;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.creatureGenericId);
    writer.write_i8(this.creatureGrade);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.creatureGenericId = reader.read_vi16();
    this.creatureGrade = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameFightMonsterInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", teamId="
        + this.teamId
        + ", wave="
        + this.wave
        + ", alive="
        + this.alive
        + ", stats="
        + this.stats
        + ", previousPositions="
        + java.util.Arrays.toString(this.previousPositions)
        + ", creatureGenericId="
        + this.creatureGenericId
        + ", creatureGrade="
        + this.creatureGrade
        + ')';
  }
}
