// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseToSellListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6140;
  // vi16
  public short pageIndex;
  // vi16
  public short totalPage;
  // array,com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell
  public com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell[] houseList;

  public HouseToSellListMessage() {}

  public HouseToSellListMessage(
      short pageIndex,
      short totalPage,
      com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell[] houseList) {
    this.pageIndex = pageIndex;
    this.totalPage = totalPage;
    this.houseList = houseList;
  }

  public HouseToSellListMessage(
      short pageIndex,
      short totalPage,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell>
          houseList) {
    this.pageIndex = pageIndex;
    this.totalPage = totalPage;
    this.houseList =
        houseList.toArray(
            com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6140;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.pageIndex);
    writer.write_vi16(this.totalPage);
    writer.write_ui16(houseList.length);

    for (int i = 0; i < houseList.length; i++) {

      houseList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.pageIndex = reader.read_vi16();
    this.totalPage = reader.read_vi16();

    int houseList_length = reader.read_ui16();
    this.houseList =
        new com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell
            [houseList_length];

    for (int i = 0; i < houseList_length; i++) {

      com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell houseList_it =
          new com.ankamagames.dofus.network.types.game.house.HouseInformationsForSell();

      houseList_it.deserialize(reader);
      this.houseList[i] = houseList_it;
    }
  }

  @Override
  public String toString() {

    return "HouseToSellListMessage("
        + "pageIndex="
        + this.pageIndex
        + ", totalPage="
        + this.totalPage
        + ", houseList="
        + java.util.Arrays.toString(this.houseList)
        + ')';
  }
}
