// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightUpdateTeamMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5572;
  // i16
  public short fightId;
  // com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations team;

  public GameFightUpdateTeamMessage()
  {}

  public GameFightUpdateTeamMessage(
      short fightId,
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations team)
  {
    this.fightId = fightId;
    this.team = team;
  }

  @Override
  public int getProtocolId()
  {
    return 5572;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i16(this.fightId);
    this.team.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i16();
    this.team = new com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations();
    this.team.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameFightUpdateTeamMessage(" + "fightId=" + this.fightId + ", team=" + this.team + ')';
  }
}
