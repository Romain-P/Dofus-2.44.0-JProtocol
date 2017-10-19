// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersEnemyRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5929;
  // f64
  public double fightId;
  // ui64
  public java.math.BigInteger playerId;

  public GuildFightPlayersEnemyRemoveMessage()
  {}

  public GuildFightPlayersEnemyRemoveMessage(double fightId, java.math.BigInteger playerId)
  {
    this.fightId = fightId;
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 5929;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.fightId);
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_f64();
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GuildFightPlayersEnemyRemoveMessage("
        + "fightId="
        + this.fightId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
