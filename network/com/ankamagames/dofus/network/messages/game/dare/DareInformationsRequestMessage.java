// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareInformationsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6659;
  // f64
  public double dareId;

  public DareInformationsRequestMessage() {}

  public DareInformationsRequestMessage(double dareId) {
    this.dareId = dareId;
  }

  @Override
  public int getProtocolId() {
    return 6659;
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

    return "DareInformationsRequestMessage(" + "dareId=" + this.dareId + ')';
  }
}
