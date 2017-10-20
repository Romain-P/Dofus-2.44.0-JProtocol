// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextCreateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 200;
  // i8
  public byte context;

  public GameContextCreateMessage() {}

  public GameContextCreateMessage(byte context) {
    this.context = context;
  }

  @Override
  public int getProtocolId() {
    return 200;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.context);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.context = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameContextCreateMessage(" + "context=" + this.context + ')';
  }
}
