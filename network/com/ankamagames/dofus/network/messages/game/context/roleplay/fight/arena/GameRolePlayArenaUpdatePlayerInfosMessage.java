// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaUpdatePlayerInfosMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6301;
  // com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos
  public com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos solo;

  public GameRolePlayArenaUpdatePlayerInfosMessage() {}

  public GameRolePlayArenaUpdatePlayerInfosMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos solo) {
    this.solo = solo;
  }

  @Override
  public int getProtocolId() {
    return 6301;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.solo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.solo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos();
    this.solo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameRolePlayArenaUpdatePlayerInfosMessage(" + "solo=" + this.solo + ')';
  }
}
