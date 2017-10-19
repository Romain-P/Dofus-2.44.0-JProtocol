// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterInformations
    extends com.ankamagames.dofus.network.types.game.context.GameContextActorInformations {
  public static final int PROTOCOL_ID = 143;
  // i8
  public byte teamId;
  // i8
  public byte wave;
  // bool
  public boolean alive;
  // com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats;
  // array,vi16
  public short[] previousPositions;

  public GameFightFighterInformations()
  {}

  public GameFightFighterInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions)
  {

    super(contextualId, look, disposition);
    this.teamId = teamId;
    this.wave = wave;
    this.alive = alive;
    this.stats = stats;
    this.previousPositions = previousPositions;
  }

  @Override
  public int getProtocolId()
  {
    return 143;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.teamId);
    writer.write_i8(this.wave);
    writer.write_bool(this.alive);
    writer.write_ui16(this.stats.getProtocolId());
    this.stats.serialize(writer);
    writer.write_ui16(previousPositions.length);
    writer.write_array_vi16(this.previousPositions);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.teamId = reader.read_i8();
    this.wave = reader.read_i8();
    this.alive = reader.read_bool();

    int stats_typeId = reader.read_ui16();
    this.stats =
        (com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats)
            InternalProtocolTypeManager.get(stats_typeId);
    this.stats.deserialize(reader);

    int previousPositions_length = reader.read_ui16();
    this.previousPositions = reader.read_array_vi16(previousPositions_length);
  }

  @Override
  public String toString()
  {

    return "GameFightFighterInformations("
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
        + ')';
  }
}
