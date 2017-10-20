// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeOnHumanVendorRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5772;
  // vi64
  public long humanVendorId;
  // vi16
  public short humanVendorCell;

  public ExchangeOnHumanVendorRequestMessage() {}

  public ExchangeOnHumanVendorRequestMessage(long humanVendorId, short humanVendorCell) {
    this.humanVendorId = humanVendorId;
    this.humanVendorCell = humanVendorCell;
  }

  @Override
  public int getProtocolId() {
    return 5772;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.humanVendorId);
    writer.write_vi16(this.humanVendorCell);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.humanVendorId = reader.read_vi64();
    this.humanVendorCell = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ExchangeOnHumanVendorRequestMessage("
        + "humanVendorId="
        + this.humanVendorId
        + ", humanVendorCell="
        + this.humanVendorCell
        + ')';
  }
}
