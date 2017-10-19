// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightMonsterWithAlignmentInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.GameFightMonsterInformations {
  public static final int PROTOCOL_ID = 203;
  // com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
  public com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
      alignmentInfos;

  public GameFightMonsterWithAlignmentInformations()
  {}

  public GameFightMonsterWithAlignmentInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      short creatureGenericId,
      byte creatureGrade,
      com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
          alignmentInfos)
  {

    super(
        contextualId,
        look,
        disposition,
        teamId,
        wave,
        alive,
        stats,
        previousPositions,
        creatureGenericId,
        creatureGrade);
    this.alignmentInfos = alignmentInfos;
  }

  @Override
  public int getProtocolId()
  {
    return 203;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.alignmentInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.alignmentInfos =
        new com.ankamagames.dofus.network.types.game.character.alignment
            .ActorAlignmentInformations();
    this.alignmentInfos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameFightMonsterWithAlignmentInformations("
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
        + ", alignmentInfos="
        + this.alignmentInfos
        + ')';
  }
}
