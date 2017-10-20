// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaUpdatePlayerInfosAllQueuesMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
        .GameRolePlayArenaUpdatePlayerInfosMessage {
  public static final int PROTOCOL_ID = 6728;
  // com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos
  public com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos team;
  // com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos
  public com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos duel;

  public GameRolePlayArenaUpdatePlayerInfosAllQueuesMessage() {}

  public GameRolePlayArenaUpdatePlayerInfosAllQueuesMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos solo,
      com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos team,
      com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos duel) {

    super(solo);
    this.team = team;
    this.duel = duel;
  }

  @Override
  public int getProtocolId() {
    return 6728;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.team.serialize(writer);
    this.duel.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.team =
        new com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos();
    this.team.deserialize(reader);
    this.duel =
        new com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena.ArenaRankInfos();
    this.duel.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameRolePlayArenaUpdatePlayerInfosAllQueuesMessage("
        + "solo="
        + this.solo
        + ", team="
        + this.team
        + ", duel="
        + this.duel
        + ')';
  }
}
