// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightInvisibilityMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5821;
  // f64
  public double targetId;
  // i8
  public byte state;

  public GameActionFightInvisibilityMessage() {}

  public GameActionFightInvisibilityMessage(
      short actionId, double sourceId, double targetId, byte state) {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.state = state;
  }

  @Override
  public int getProtocolId() {
    return 5821;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_i8(this.state);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.state = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameActionFightInvisibilityMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", state="
        + this.state
        + ')';
  }
}
