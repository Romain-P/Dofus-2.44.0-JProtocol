// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.creation;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterNameSuggestionSuccessMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5544;
  // str
  public java.lang.String suggestion;

  public CharacterNameSuggestionSuccessMessage() {}

  public CharacterNameSuggestionSuccessMessage(java.lang.String suggestion) {
    this.suggestion = suggestion;
  }

  @Override
  public int getProtocolId() {
    return 5544;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.suggestion);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.suggestion = reader.read_str();
  }

  @Override
  public String toString() {

    return "CharacterNameSuggestionSuccessMessage(" + "suggestion=" + this.suggestion + ')';
  }
}
