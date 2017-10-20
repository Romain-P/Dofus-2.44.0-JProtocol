// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3004;
  // i8
  public byte reason;

  public ObjectErrorMessage() {}

  public ObjectErrorMessage(byte reason) {
    this.reason = reason;
  }

  @Override
  public int getProtocolId() {
    return 3004;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.reason = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ObjectErrorMessage(" + "reason=" + this.reason + ')';
  }
}
