// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockToSellFilterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6161;
  // i32
  public int areaId;
  // i8
  public byte atLeastNbMount;
  // i8
  public byte atLeastNbMachine;
  // ui64
  public java.math.BigInteger maxPrice;

  public PaddockToSellFilterMessage()
  {}

  public PaddockToSellFilterMessage(
      int areaId, byte atLeastNbMount, byte atLeastNbMachine, java.math.BigInteger maxPrice)
  {
    this.areaId = areaId;
    this.atLeastNbMount = atLeastNbMount;
    this.atLeastNbMachine = atLeastNbMachine;
    this.maxPrice = maxPrice;
  }

  @Override
  public int getProtocolId()
  {
    return 6161;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.areaId);
    writer.write_i8(this.atLeastNbMount);
    writer.write_i8(this.atLeastNbMachine);
    writer.write_ui64(this.maxPrice);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.areaId = reader.read_i32();
    this.atLeastNbMount = reader.read_i8();
    this.atLeastNbMachine = reader.read_i8();
    this.maxPrice = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PaddockToSellFilterMessage("
        + "areaId="
        + this.areaId
        + ", atLeastNbMount="
        + this.atLeastNbMount
        + ", atLeastNbMachine="
        + this.atLeastNbMachine
        + ", maxPrice="
        + this.maxPrice
        + ')';
  }
}
