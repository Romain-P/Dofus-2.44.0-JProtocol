// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorStateUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6455;
  // f64
  public double uniqueId;
  // i8
  public byte state;

  public TaxCollectorStateUpdateMessage() {}

  public TaxCollectorStateUpdateMessage(double uniqueId, byte state) {
    this.uniqueId = uniqueId;
    this.state = state;
  }

  @Override
  public int getProtocolId() {
    return 6455;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.uniqueId);
    writer.write_i8(this.state);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.uniqueId = reader.read_f64();
    this.state = reader.read_i8();
  }

  @Override
  public String toString() {

    return "TaxCollectorStateUpdateMessage("
        + "uniqueId="
        + this.uniqueId
        + ", state="
        + this.state
        + ')';
  }
}
