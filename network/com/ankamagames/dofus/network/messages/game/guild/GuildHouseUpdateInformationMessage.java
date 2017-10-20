// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildHouseUpdateInformationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6181;
  // com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild
  public com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild
      housesInformations;

  public GuildHouseUpdateInformationMessage() {}

  public GuildHouseUpdateInformationMessage(
      com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild housesInformations) {
    this.housesInformations = housesInformations;
  }

  @Override
  public int getProtocolId() {
    return 6181;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.housesInformations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.housesInformations =
        new com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild();
    this.housesInformations.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GuildHouseUpdateInformationMessage("
        + "housesInformations="
        + this.housesInformations
        + ')';
  }
}
