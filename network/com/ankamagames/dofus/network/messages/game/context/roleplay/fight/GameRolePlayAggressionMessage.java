// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayAggressionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6073;
  // ui64
  public java.math.BigInteger attackerId;
  // ui64
  public java.math.BigInteger defenderId;

  public GameRolePlayAggressionMessage()
  {}

  public GameRolePlayAggressionMessage(
      java.math.BigInteger attackerId, java.math.BigInteger defenderId)
  {
    this.attackerId = attackerId;
    this.defenderId = defenderId;
  }

  @Override
  public int getProtocolId()
  {
    return 6073;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.attackerId);
    writer.write_ui64(this.defenderId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.attackerId = reader.read_ui64();
    this.defenderId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayAggressionMessage("
        + "attackerId="
        + this.attackerId
        + ", defenderId="
        + this.defenderId
        + ')';
  }
}
