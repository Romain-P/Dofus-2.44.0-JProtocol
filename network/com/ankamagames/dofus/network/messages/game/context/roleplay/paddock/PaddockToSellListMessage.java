// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockToSellListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6138;
  // vi16
  public short pageIndex;
  // vi16
  public short totalPage;
  // array,com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell
  public com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell[] paddockList;

  public PaddockToSellListMessage()
  {}

  public PaddockToSellListMessage(
      short pageIndex,
      short totalPage,
      com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell[] paddockList)
  {
    this.pageIndex = pageIndex;
    this.totalPage = totalPage;
    this.paddockList = paddockList;
  }

  public PaddockToSellListMessage(
      short pageIndex,
      short totalPage,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell>
          paddockList)
  {
    this.pageIndex = pageIndex;
    this.totalPage = totalPage;
    this.paddockList =
        paddockList.toArray(
            com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6138;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.pageIndex);
    writer.write_vi16(this.totalPage);
    writer.write_ui16(paddockList.length);

    for (int i = 0; i < paddockList.length; i++)
  {

      paddockList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.pageIndex = reader.read_vi16();
    this.totalPage = reader.read_vi16();

    int paddockList_length = reader.read_ui16();
    this.paddockList =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell
            [paddockList_length];

    for (int i = 0; i < paddockList_length; i++)
  {

      com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell paddockList_it =
          new com.ankamagames.dofus.network.types.game.paddock.PaddockInformationsForSell();

      paddockList_it.deserialize(reader);
      this.paddockList[i] = paddockList_it;
    }
  }

  @Override
  public String toString()
  {

    return "PaddockToSellListMessage("
        + "pageIndex="
        + this.pageIndex
        + ", totalPage="
        + this.totalPage
        + ", paddockList="
        + java.util.Arrays.toString(this.paddockList)
        + ')';
  }
}
