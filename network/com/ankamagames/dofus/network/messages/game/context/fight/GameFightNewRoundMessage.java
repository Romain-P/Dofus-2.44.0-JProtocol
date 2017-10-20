// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightNewRoundMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6239;
  // vi32
  public int roundNumber;

  public GameFightNewRoundMessage() {}

  public GameFightNewRoundMessage(int roundNumber) {
    this.roundNumber = roundNumber;
  }

  @Override
  public int getProtocolId() {
    return 6239;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.roundNumber);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.roundNumber = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "GameFightNewRoundMessage(" + "roundNumber=" + this.roundNumber + ')';
  }
}
