// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayAttackMonsterRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6191;
  // f64
  public double monsterGroupId;

  public GameRolePlayAttackMonsterRequestMessage()
  {}

  public GameRolePlayAttackMonsterRequestMessage(double monsterGroupId)
  {
    this.monsterGroupId = monsterGroupId;
  }

  @Override
  public int getProtocolId()
  {
    return 6191;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.monsterGroupId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.monsterGroupId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayAttackMonsterRequestMessage("
        + "monsterGroupId="
        + this.monsterGroupId
        + ')';
  }
}
