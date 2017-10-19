// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockBuyResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6516;
  // f64
  public double paddockId;
  // bool
  public boolean bought;
  // ui64
  public java.math.BigInteger realPrice;

  public PaddockBuyResultMessage()
  {}

  public PaddockBuyResultMessage(double paddockId, boolean bought, java.math.BigInteger realPrice)
  {
    this.paddockId = paddockId;
    this.bought = bought;
    this.realPrice = realPrice;
  }

  @Override
  public int getProtocolId()
  {
    return 6516;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.paddockId);
    writer.write_bool(this.bought);
    writer.write_ui64(this.realPrice);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.paddockId = reader.read_f64();
    this.bought = reader.read_bool();
    this.realPrice = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PaddockBuyResultMessage("
        + "paddockId="
        + this.paddockId
        + ", bought="
        + this.bought
        + ", realPrice="
        + this.realPrice
        + ')';
  }
}
