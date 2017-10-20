// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightCastOnTargetRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6330;
  // vi16
  public short spellId;
  // f64
  public double targetId;

  public GameActionFightCastOnTargetRequestMessage() {}

  public GameActionFightCastOnTargetRequestMessage(short spellId, double targetId) {
    this.spellId = spellId;
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId() {
    return 6330;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.spellId);
    writer.write_f64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_vi16();
    this.targetId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameActionFightCastOnTargetRequestMessage("
        + "spellId="
        + this.spellId
        + ", targetId="
        + this.targetId
        + ')';
  }
}
