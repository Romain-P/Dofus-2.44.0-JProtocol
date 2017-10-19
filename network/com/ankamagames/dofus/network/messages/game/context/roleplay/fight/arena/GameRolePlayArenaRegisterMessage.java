// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaRegisterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6280;
  // i32
  public int battleMode;

  public GameRolePlayArenaRegisterMessage()
  {}

  public GameRolePlayArenaRegisterMessage(int battleMode)
  {
    this.battleMode = battleMode;
  }

  @Override
  public int getProtocolId()
  {
    return 6280;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.battleMode);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.battleMode = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaRegisterMessage(" + "battleMode=" + this.battleMode + ')';
  }
}
