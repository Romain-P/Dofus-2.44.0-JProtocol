// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicWhoIsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 181;
  // bool
  public boolean verbose;
  // str
  public java.lang.String search;

  public BasicWhoIsRequestMessage() {}

  public BasicWhoIsRequestMessage(boolean verbose, java.lang.String search) {
    this.verbose = verbose;
    this.search = search;
  }

  @Override
  public int getProtocolId() {
    return 181;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.verbose);
    writer.write_str(this.search);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.verbose = reader.read_bool();
    this.search = reader.read_str();
  }

  @Override
  public String toString() {

    return "BasicWhoIsRequestMessage("
        + "verbose="
        + this.verbose
        + ", search="
        + this.search
        + ')';
  }
}
