// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountHouseMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6315;
  // array,com.ankamagames.dofus.network.types.game.house.AccountHouseInformations
  public com.ankamagames.dofus.network.types.game.house.AccountHouseInformations[] houses;

  public AccountHouseMessage() {}

  public AccountHouseMessage(
      com.ankamagames.dofus.network.types.game.house.AccountHouseInformations[] houses) {
    this.houses = houses;
  }

  public AccountHouseMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.house.AccountHouseInformations>
          houses) {
    this.houses =
        houses.toArray(
            com.ankamagames.dofus.network.types.game.house.AccountHouseInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6315;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(houses.length);

    for (int i = 0; i < houses.length; i++) {

      houses[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int houses_length = reader.read_ui16();
    this.houses =
        new com.ankamagames.dofus.network.types.game.house.AccountHouseInformations[houses_length];

    for (int i = 0; i < houses_length; i++) {

      com.ankamagames.dofus.network.types.game.house.AccountHouseInformations houses_it =
          new com.ankamagames.dofus.network.types.game.house.AccountHouseInformations();

      houses_it.deserialize(reader);
      this.houses[i] = houses_it;
    }
  }

  @Override
  public String toString() {

    return "AccountHouseMessage(" + "houses=" + java.util.Arrays.toString(this.houses) + ')';
  }
}
