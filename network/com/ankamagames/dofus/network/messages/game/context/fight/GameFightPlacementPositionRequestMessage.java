// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementPositionRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 704;
  // vi16
  public short cellId;

  public GameFightPlacementPositionRequestMessage() {}

  public GameFightPlacementPositionRequestMessage(short cellId) {
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId() {
    return 704;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cellId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GameFightPlacementPositionRequestMessage(" + "cellId=" + this.cellId + ')';
  }
}
