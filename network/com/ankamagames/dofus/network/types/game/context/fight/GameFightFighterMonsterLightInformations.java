// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterMonsterLightInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .GameFightFighterLightInformations {
  public static final int PROTOCOL_ID = 455;
  // vi16
  public short creatureGenericId;

  public GameFightFighterMonsterLightInformations()
  {}

  public GameFightFighterMonsterLightInformations(
      boolean sex,
      boolean alive,
      double id,
      byte wave,
      short level,
      byte breed,
      short creatureGenericId)
  {

    super(sex, alive, id, wave, level, breed);
    this.creatureGenericId = creatureGenericId;
  }

  @Override
  public int getProtocolId()
  {
    return 455;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.creatureGenericId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.creatureGenericId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameFightFighterMonsterLightInformations("
        + "sex="
        + this.sex
        + ", alive="
        + this.alive
        + ", id="
        + this.id
        + ", wave="
        + this.wave
        + ", level="
        + this.level
        + ", breed="
        + this.breed
        + ", creatureGenericId="
        + this.creatureGenericId
        + ')';
  }
}
