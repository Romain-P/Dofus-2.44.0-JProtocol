// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeReplyTaxVendorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5787;
  // vi64
  public long objectValue;
  // vi64
  public long totalTaxValue;

  public ExchangeReplyTaxVendorMessage() {}

  public ExchangeReplyTaxVendorMessage(long objectValue, long totalTaxValue) {
    this.objectValue = objectValue;
    this.totalTaxValue = totalTaxValue;
  }

  @Override
  public int getProtocolId() {
    return 5787;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.objectValue);
    writer.write_vi64(this.totalTaxValue);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectValue = reader.read_vi64();
    this.totalTaxValue = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeReplyTaxVendorMessage("
        + "objectValue="
        + this.objectValue
        + ", totalTaxValue="
        + this.totalTaxValue
        + ')';
  }
}
