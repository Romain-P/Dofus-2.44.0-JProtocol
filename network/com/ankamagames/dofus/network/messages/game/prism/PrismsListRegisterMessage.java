// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismsListRegisterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6441;
  // i8
  public byte listen;

  public PrismsListRegisterMessage() {}

  public PrismsListRegisterMessage(byte listen) {
    this.listen = listen;
  }

  @Override
  public int getProtocolId() {
    return 6441;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.listen);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.listen = reader.read_i8();
  }

  @Override
  public String toString() {

    return "PrismsListRegisterMessage(" + "listen=" + this.listen + ')';
  }
}
