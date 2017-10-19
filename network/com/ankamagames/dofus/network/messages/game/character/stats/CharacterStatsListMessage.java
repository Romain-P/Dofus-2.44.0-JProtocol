// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterStatsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 500;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterCharacteristicsInformations
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterCharacteristicsInformations
      stats;

  public CharacterStatsListMessage()
  {}

  public CharacterStatsListMessage(
      com.ankamagames.dofus.network.types.game.character.characteristic
              .CharacterCharacteristicsInformations
          stats)
  {
    this.stats = stats;
  }

  @Override
  public int getProtocolId()
  {
    return 500;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.stats.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.stats =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterCharacteristicsInformations();
    this.stats.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "CharacterStatsListMessage(" + "stats=" + this.stats + ')';
  }
}
