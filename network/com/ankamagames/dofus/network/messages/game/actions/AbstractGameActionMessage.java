// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractGameActionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1000;
  // vi16
  public short actionId;
  // f64
  public double sourceId;

  public AbstractGameActionMessage() {}

  public AbstractGameActionMessage(short actionId, double sourceId) {
    this.actionId = actionId;
    this.sourceId = sourceId;
  }

  @Override
  public int getProtocolId() {
    return 1000;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.actionId);
    writer.write_f64(this.sourceId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.actionId = reader.read_vi16();
    this.sourceId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "AbstractGameActionMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ')';
  }
}
