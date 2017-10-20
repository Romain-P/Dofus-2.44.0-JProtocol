// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceCreationResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6391;
  // i8
  public byte result;

  public AllianceCreationResultMessage() {}

  public AllianceCreationResultMessage(byte result) {
    this.result = result;
  }

  @Override
  public int getProtocolId() {
    return 6391;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.result);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.result = reader.read_i8();
  }

  @Override
  public String toString() {

    return "AllianceCreationResultMessage(" + "result=" + this.result + ')';
  }
}
