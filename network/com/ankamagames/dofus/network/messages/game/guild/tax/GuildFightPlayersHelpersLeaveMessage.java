// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersHelpersLeaveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5719;
  // f64
  public double fightId;
  // vi64
  public long playerId;

  public GuildFightPlayersHelpersLeaveMessage() {}

  public GuildFightPlayersHelpersLeaveMessage(double fightId, long playerId) {
    this.fightId = fightId;
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId() {
    return 5719;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.fightId);
    writer.write_vi64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_f64();
    this.playerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "GuildFightPlayersHelpersLeaveMessage("
        + "fightId="
        + this.fightId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
