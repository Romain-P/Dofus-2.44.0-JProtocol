// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaFightAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6279;
  // i32
  public int fightId;
  // bool
  public boolean accept;

  public GameRolePlayArenaFightAnswerMessage()
  {}

  public GameRolePlayArenaFightAnswerMessage(int fightId, boolean accept)
  {
    this.fightId = fightId;
    this.accept = accept;
  }

  @Override
  public int getProtocolId()
  {
    return 6279;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.fightId);
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i32();
    this.accept = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaFightAnswerMessage("
        + "fightId="
        + this.fightId
        + ", accept="
        + this.accept
        + ')';
  }
}
