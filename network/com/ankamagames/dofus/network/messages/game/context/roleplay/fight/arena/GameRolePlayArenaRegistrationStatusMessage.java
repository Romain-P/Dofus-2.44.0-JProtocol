// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaRegistrationStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6284;
  // bool
  public boolean registered;
  // i8
  public byte step;
  // i32
  public int battleMode;

  public GameRolePlayArenaRegistrationStatusMessage()
  {}

  public GameRolePlayArenaRegistrationStatusMessage(boolean registered, byte step, int battleMode)
  {
    this.registered = registered;
    this.step = step;
    this.battleMode = battleMode;
  }

  @Override
  public int getProtocolId()
  {
    return 6284;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.registered);
    writer.write_i8(this.step);
    writer.write_i32(this.battleMode);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.registered = reader.read_bool();
    this.step = reader.read_i8();
    this.battleMode = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaRegistrationStatusMessage("
        + "registered="
        + this.registered
        + ", step="
        + this.step
        + ", battleMode="
        + this.battleMode
        + ')';
  }
}
