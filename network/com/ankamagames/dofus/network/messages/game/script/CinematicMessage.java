// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.script;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CinematicMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6053;
  // vi16
  public short cinematicId;

  public CinematicMessage() {}

  public CinematicMessage(short cinematicId) {
    this.cinematicId = cinematicId;
  }

  @Override
  public int getProtocolId() {
    return 6053;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cinematicId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cinematicId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "CinematicMessage(" + "cinematicId=" + this.cinematicId + ')';
  }
}
