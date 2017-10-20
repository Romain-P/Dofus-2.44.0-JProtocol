// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.initialization;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterCapabilitiesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6339;
  // vi32
  public int guildEmblemSymbolCategories;

  public CharacterCapabilitiesMessage() {}

  public CharacterCapabilitiesMessage(int guildEmblemSymbolCategories) {
    this.guildEmblemSymbolCategories = guildEmblemSymbolCategories;
  }

  @Override
  public int getProtocolId() {
    return 6339;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.guildEmblemSymbolCategories);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guildEmblemSymbolCategories = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "CharacterCapabilitiesMessage("
        + "guildEmblemSymbolCategories="
        + this.guildEmblemSymbolCategories
        + ')';
  }
}
