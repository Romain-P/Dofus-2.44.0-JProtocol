// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightFighterCompanionLightInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .GameFightFighterLightInformations {
  public static final int PROTOCOL_ID = 454;
  // i8
  public byte companionId;
  // f64
  public double masterId;

  public GameFightFighterCompanionLightInformations()
  {}

  public GameFightFighterCompanionLightInformations(
      boolean sex,
      boolean alive,
      double id,
      byte wave,
      short level,
      byte breed,
      byte companionId,
      double masterId)
  {

    super(sex, alive, id, wave, level, breed);
    this.companionId = companionId;
    this.masterId = masterId;
  }

  @Override
  public int getProtocolId()
  {
    return 454;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.companionId);
    writer.write_f64(this.masterId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.companionId = reader.read_i8();
    this.masterId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameFightFighterCompanionLightInformations("
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
        + ", companionId="
        + this.companionId
        + ", masterId="
        + this.masterId
        + ')';
  }
}
