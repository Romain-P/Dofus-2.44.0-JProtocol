// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicWhoAmIRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5664;
  // bool
  public boolean verbose;

  public BasicWhoAmIRequestMessage() {}

  public BasicWhoAmIRequestMessage(boolean verbose) {
    this.verbose = verbose;
  }

  @Override
  public int getProtocolId() {
    return 5664;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.verbose);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.verbose = reader.read_bool();
  }

  @Override
  public String toString() {

    return "BasicWhoAmIRequestMessage(" + "verbose=" + this.verbose + ')';
  }
}
