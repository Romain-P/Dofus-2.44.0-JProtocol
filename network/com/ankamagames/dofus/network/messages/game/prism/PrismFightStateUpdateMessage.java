// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightStateUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6040;
  // i8
  public byte state;

  public PrismFightStateUpdateMessage() {}

  public PrismFightStateUpdateMessage(byte state) {
    this.state = state;
  }

  @Override
  public int getProtocolId() {
    return 6040;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.state);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.state = reader.read_i8();
  }

  @Override
  public String toString() {

    return "PrismFightStateUpdateMessage(" + "state=" + this.state + ')';
  }
}
