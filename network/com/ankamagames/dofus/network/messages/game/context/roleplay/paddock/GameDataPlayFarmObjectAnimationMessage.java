// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameDataPlayFarmObjectAnimationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6026;
  // array,vi16
  public short[] cellId;

  public GameDataPlayFarmObjectAnimationMessage() {}

  public GameDataPlayFarmObjectAnimationMessage(short[] cellId) {
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId() {
    return 6026;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(cellId.length);
    writer.write_array_vi16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    int cellId_length = reader.read_ui16();
    this.cellId = reader.read_array_vi16(cellId_length);
  }

  @Override
  public String toString() {

    return "GameDataPlayFarmObjectAnimationMessage("
        + "cellId="
        + java.util.Arrays.toString(this.cellId)
        + ')';
  }
}
