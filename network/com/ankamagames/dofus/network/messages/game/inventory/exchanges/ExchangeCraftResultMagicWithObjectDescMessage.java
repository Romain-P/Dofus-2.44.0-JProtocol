// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCraftResultMagicWithObjectDescMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeCraftResultWithObjectDescMessage {
  public static final int PROTOCOL_ID = 6188;
  // i8
  public byte magicPoolStatus;

  public ExchangeCraftResultMagicWithObjectDescMessage()
  {}

  public ExchangeCraftResultMagicWithObjectDescMessage(
      byte craftResult,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemNotInContainer objectInfo,
      byte magicPoolStatus)
  {

    super(craftResult, objectInfo);
    this.magicPoolStatus = magicPoolStatus;
  }

  @Override
  public int getProtocolId()
  {
    return 6188;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.magicPoolStatus);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.magicPoolStatus = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ExchangeCraftResultMagicWithObjectDescMessage("
        + "craftResult="
        + this.craftResult
        + ", objectInfo="
        + this.objectInfo
        + ", magicPoolStatus="
        + this.magicPoolStatus
        + ')';
  }
}
