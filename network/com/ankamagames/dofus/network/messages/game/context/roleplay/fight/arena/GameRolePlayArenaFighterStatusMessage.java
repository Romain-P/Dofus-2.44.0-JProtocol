// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaFighterStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6281;
  // i32
  public int fightId;
  // i32
  public int playerId;
  // bool
  public boolean accepted;

  public GameRolePlayArenaFighterStatusMessage()
  {}

  public GameRolePlayArenaFighterStatusMessage(int fightId, int playerId, boolean accepted)
  {
    this.fightId = fightId;
    this.playerId = playerId;
    this.accepted = accepted;
  }

  @Override
  public int getProtocolId()
  {
    return 6281;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.fightId);
    writer.write_i32(this.playerId);
    writer.write_bool(this.accepted);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i32();
    this.playerId = reader.read_i32();
    this.accepted = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaFighterStatusMessage("
        + "fightId="
        + this.fightId
        + ", playerId="
        + this.playerId
        + ", accepted="
        + this.accepted
        + ')';
  }
}
