// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayRemoveChallengeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 300;
  // i32
  public int fightId;

  public GameRolePlayRemoveChallengeMessage()
  {}

  public GameRolePlayRemoveChallengeMessage(int fightId)
  {
    this.fightId = fightId;
  }

  @Override
  public int getProtocolId()
  {
    return 300;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.fightId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayRemoveChallengeMessage(" + "fightId=" + this.fightId + ')';
  }
}
