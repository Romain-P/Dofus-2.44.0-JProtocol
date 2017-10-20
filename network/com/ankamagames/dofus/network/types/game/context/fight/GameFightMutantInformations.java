// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightMutantInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .GameFightFighterNamedInformations {
  public static final int PROTOCOL_ID = 50;
  // i8
  public byte powerLevel;

  public GameFightMutantInformations() {}

  public GameFightMutantInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      byte powerLevel) {

    super(
        contextualId,
        look,
        disposition,
        teamId,
        wave,
        alive,
        stats,
        previousPositions,
        name,
        status);
    this.powerLevel = powerLevel;
  }

  @Override
  public int getProtocolId() {
    return 50;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.powerLevel);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.powerLevel = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameFightMutantInformations("
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
        + ", powerLevel="
        + this.powerLevel
        + ')';
  }
}
