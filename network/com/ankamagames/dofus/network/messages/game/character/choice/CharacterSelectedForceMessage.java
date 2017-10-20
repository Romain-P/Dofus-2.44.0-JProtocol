// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterSelectedForceMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6068;
  // i32
  public int id;

  public CharacterSelectedForceMessage() {}

  public CharacterSelectedForceMessage(int id) {
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 6068;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_i32();
  }

  @Override
  public String toString() {

    return "CharacterSelectedForceMessage(" + "id=" + this.id + ')';
  }
}
