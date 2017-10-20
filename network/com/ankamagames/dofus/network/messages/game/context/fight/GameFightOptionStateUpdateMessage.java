// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightOptionStateUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5927;
  // i16
  public short fightId;
  // i8
  public byte teamId;
  // i8
  public byte option;
  // bool
  public boolean state;

  public GameFightOptionStateUpdateMessage() {}

  public GameFightOptionStateUpdateMessage(short fightId, byte teamId, byte option, boolean state) {
    this.fightId = fightId;
    this.teamId = teamId;
    this.option = option;
    this.state = state;
  }

  @Override
  public int getProtocolId() {
    return 5927;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.fightId);
    writer.write_i8(this.teamId);
    writer.write_i8(this.option);
    writer.write_bool(this.state);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i16();
    this.teamId = reader.read_i8();
    this.option = reader.read_i8();
    this.state = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GameFightOptionStateUpdateMessage("
        + "fightId="
        + this.fightId
        + ", teamId="
        + this.teamId
        + ", option="
        + this.option
        + ", state="
        + this.state
        + ')';
  }
}
