// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightCompanionInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations {
  public static final int PROTOCOL_ID = 450;
  // i8
  public byte companionGenericId;
  // ui8
  public short level;
  // f64
  public double masterId;

  public GameFightCompanionInformations()
  {}

  public GameFightCompanionInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      byte companionGenericId,
      short level,
      double masterId)
  {

    super(contextualId, look, disposition, teamId, wave, alive, stats, previousPositions);
    this.companionGenericId = companionGenericId;
    this.level = level;
    this.masterId = masterId;
  }

  @Override
  public int getProtocolId()
  {
    return 450;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.companionGenericId);
    writer.write_ui8(this.level);
    writer.write_f64(this.masterId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.companionGenericId = reader.read_i8();
    this.level = reader.read_ui8();
    this.masterId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameFightCompanionInformations("
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
        + ", companionGenericId="
        + this.companionGenericId
        + ", level="
        + this.level
        + ", masterId="
        + this.masterId
        + ')';
  }
}
