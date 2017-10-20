// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterSelectedSuccessMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 153;
  // com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations
  public com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations infos;
  // bool
  public boolean isCollectingStats;

  public CharacterSelectedSuccessMessage() {}

  public CharacterSelectedSuccessMessage(
      com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations infos,
      boolean isCollectingStats) {
    this.infos = infos;
    this.isCollectingStats = isCollectingStats;
  }

  @Override
  public int getProtocolId() {
    return 153;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.infos.serialize(writer);
    writer.write_bool(this.isCollectingStats);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.infos =
        new com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations();
    this.infos.deserialize(reader);
    this.isCollectingStats = reader.read_bool();
  }

  @Override
  public String toString() {

    return "CharacterSelectedSuccessMessage("
        + "infos="
        + this.infos
        + ", isCollectingStats="
        + this.isCollectingStats
        + ')';
  }
}
