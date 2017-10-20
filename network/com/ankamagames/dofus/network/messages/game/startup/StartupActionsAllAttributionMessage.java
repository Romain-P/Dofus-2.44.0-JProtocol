// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionsAllAttributionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6537;
  // vi64
  public long characterId;

  public StartupActionsAllAttributionMessage() {}

  public StartupActionsAllAttributionMessage(long characterId) {
    this.characterId = characterId;
  }

  @Override
  public int getProtocolId() {
    return 6537;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.characterId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.characterId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "StartupActionsAllAttributionMessage(" + "characterId=" + this.characterId + ')';
  }
}
