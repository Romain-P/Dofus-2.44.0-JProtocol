// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class OrnamentGainedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6368;
  // i16
  public short ornamentId;

  public OrnamentGainedMessage() {}

  public OrnamentGainedMessage(short ornamentId) {
    this.ornamentId = ornamentId;
  }

  @Override
  public int getProtocolId() {
    return 6368;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.ornamentId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.ornamentId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "OrnamentGainedMessage(" + "ornamentId=" + this.ornamentId + ')';
  }
}
