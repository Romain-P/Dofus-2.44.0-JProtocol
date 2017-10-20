// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareCancelRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6680;
  // f64
  public double dareId;

  public DareCancelRequestMessage() {}

  public DareCancelRequestMessage(double dareId) {
    this.dareId = dareId;
  }

  @Override
  public int getProtocolId() {
    return 6680;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.dareId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dareId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "DareCancelRequestMessage(" + "dareId=" + this.dareId + ')';
  }
}
