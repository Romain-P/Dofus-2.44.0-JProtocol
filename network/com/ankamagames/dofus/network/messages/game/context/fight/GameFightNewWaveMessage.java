// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightNewWaveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6490;
  // i8
  public byte id;
  // i8
  public byte teamId;
  // i16
  public short nbTurnBeforeNextWave;

  public GameFightNewWaveMessage() {}

  public GameFightNewWaveMessage(byte id, byte teamId, short nbTurnBeforeNextWave) {
    this.id = id;
    this.teamId = teamId;
    this.nbTurnBeforeNextWave = nbTurnBeforeNextWave;
  }

  @Override
  public int getProtocolId() {
    return 6490;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.id);
    writer.write_i8(this.teamId);
    writer.write_i16(this.nbTurnBeforeNextWave);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_i8();
    this.teamId = reader.read_i8();
    this.nbTurnBeforeNextWave = reader.read_i16();
  }

  @Override
  public String toString() {

    return "GameFightNewWaveMessage("
        + "id="
        + this.id
        + ", teamId="
        + this.teamId
        + ", nbTurnBeforeNextWave="
        + this.nbTurnBeforeNextWave
        + ')';
  }
}
