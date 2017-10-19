// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.death;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerLifeStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5996;
  // i8
  public byte state;
  // f64
  public double phenixMapId;

  public GameRolePlayPlayerLifeStatusMessage()
  {}

  public GameRolePlayPlayerLifeStatusMessage(byte state, double phenixMapId)
  {
    this.state = state;
    this.phenixMapId = phenixMapId;
  }

  @Override
  public int getProtocolId()
  {
    return 5996;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.state);
    writer.write_f64(this.phenixMapId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.state = reader.read_i8();
    this.phenixMapId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayPlayerLifeStatusMessage("
        + "state="
        + this.state
        + ", phenixMapId="
        + this.phenixMapId
        + ')';
  }
}
