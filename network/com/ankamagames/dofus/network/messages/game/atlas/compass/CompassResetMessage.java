// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.atlas.compass;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CompassResetMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5584;
  // i8
  public byte type;

  public CompassResetMessage() {}

  public CompassResetMessage(byte type) {
    this.type = type;
  }

  @Override
  public int getProtocolId() {
    return 5584;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.type);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type = reader.read_i8();
  }

  @Override
  public String toString() {

    return "CompassResetMessage(" + "type=" + this.type + ')';
  }
}
