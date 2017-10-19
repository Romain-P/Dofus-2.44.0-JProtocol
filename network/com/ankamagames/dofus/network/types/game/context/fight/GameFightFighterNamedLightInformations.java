// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterNamedLightInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .GameFightFighterLightInformations {
  public static final int PROTOCOL_ID = 456;
  // str
  public java.lang.String name;

  public GameFightFighterNamedLightInformations()
  {}

  public GameFightFighterNamedLightInformations(
      boolean sex,
      boolean alive,
      double id,
      byte wave,
      short level,
      byte breed,
      java.lang.String name)
  {

    super(sex, alive, id, wave, level, breed);
    this.name = name;
  }

  @Override
  public int getProtocolId()
  {
    return 456;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.name = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "GameFightFighterNamedLightInformations("
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
        + ", name="
        + this.name
        + ')';
  }
}
