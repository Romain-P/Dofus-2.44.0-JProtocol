// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterNamedInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations {
  public static final int PROTOCOL_ID = 158;
  // str
  public java.lang.String name;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;

  public GameFightFighterNamedInformations()
  {}

  public GameFightFighterNamedInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status)
  {

    super(contextualId, look, disposition, teamId, wave, alive, stats, previousPositions);
    this.name = name;
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 158;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.name);
    this.status.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.name = reader.read_str();
    this.status = new com.ankamagames.dofus.network.types.game.character.status.PlayerStatus();
    this.status.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameFightFighterNamedInformations("
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
        + ", name="
        + this.name
        + ", status="
        + this.status
        + ')';
  }
}
