// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.creation;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterCanBeCreatedResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6733;
  // bool
  public boolean yesYouCan;

  public CharacterCanBeCreatedResultMessage() {}

  public CharacterCanBeCreatedResultMessage(boolean yesYouCan) {
    this.yesYouCan = yesYouCan;
  }

  @Override
  public int getProtocolId() {
    return 6733;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.yesYouCan);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.yesYouCan = reader.read_bool();
  }

  @Override
  public String toString() {

    return "CharacterCanBeCreatedResultMessage(" + "yesYouCan=" + this.yesYouCan + ')';
  }
}
