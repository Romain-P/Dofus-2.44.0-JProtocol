// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.finishmoves;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FinishMoveInformations extends NetworkType {
  public static final int PROTOCOL_ID = 506;
  // i32
  public int finishMoveId;
  // bool
  public boolean finishMoveState;

  public FinishMoveInformations() {}

  public FinishMoveInformations(int finishMoveId, boolean finishMoveState) {
    this.finishMoveId = finishMoveId;
    this.finishMoveState = finishMoveState;
  }

  @Override
  public int getProtocolId() {
    return 506;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.finishMoveId);
    writer.write_bool(this.finishMoveState);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.finishMoveId = reader.read_i32();
    this.finishMoveState = reader.read_bool();
  }

  @Override
  public String toString() {

    return "FinishMoveInformations("
        + "finishMoveId="
        + this.finishMoveId
        + ", finishMoveState="
        + this.finishMoveState
        + ')';
  }
}
