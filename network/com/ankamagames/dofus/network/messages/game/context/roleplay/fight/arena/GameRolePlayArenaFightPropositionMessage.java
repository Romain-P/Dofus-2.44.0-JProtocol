// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaFightPropositionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6276;
  // i32
  public int fightId;
  // array,f64
  public double[] alliesId;
  // vi16
  public short duration;

  public GameRolePlayArenaFightPropositionMessage()
  {}

  public GameRolePlayArenaFightPropositionMessage(int fightId, double[] alliesId, short duration)
  {
    this.fightId = fightId;
    this.alliesId = alliesId;
    this.duration = duration;
  }

  @Override
  public int getProtocolId()
  {
    return 6276;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.fightId);
    writer.write_ui16(alliesId.length);
    writer.write_array_f64(this.alliesId);
    writer.write_vi16(this.duration);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i32();

    int alliesId_length = reader.read_ui16();
    this.alliesId = reader.read_array_f64(alliesId_length);
    this.duration = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaFightPropositionMessage("
        + "fightId="
        + this.fightId
        + ", alliesId="
        + java.util.Arrays.toString(this.alliesId)
        + ", duration="
        + this.duration
        + ')';
  }
}
