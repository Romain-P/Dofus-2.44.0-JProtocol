// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayShowChallengeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 301;
  // com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations
      commonsInfos;

  public GameRolePlayShowChallengeMessage() {}

  public GameRolePlayShowChallengeMessage(
      com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations commonsInfos) {
    this.commonsInfos = commonsInfos;
  }

  @Override
  public int getProtocolId() {
    return 301;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.commonsInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.commonsInfos =
        new com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations();
    this.commonsInfos.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameRolePlayShowChallengeMessage(" + "commonsInfos=" + this.commonsInfos + ')';
  }
}
