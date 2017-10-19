// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameDataPaddockObjectAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5990;
  // com.ankamagames.dofus.network.types.game.paddock.PaddockItem
  public com.ankamagames.dofus.network.types.game.paddock.PaddockItem paddockItemDescription;

  public GameDataPaddockObjectAddMessage()
  {}

  public GameDataPaddockObjectAddMessage(
      com.ankamagames.dofus.network.types.game.paddock.PaddockItem paddockItemDescription)
  {
    this.paddockItemDescription = paddockItemDescription;
  }

  @Override
  public int getProtocolId()
  {
    return 5990;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.paddockItemDescription.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.paddockItemDescription =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockItem();
    this.paddockItemDescription.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameDataPaddockObjectAddMessage("
        + "paddockItemDescription="
        + this.paddockItemDescription
        + ')';
  }
}
