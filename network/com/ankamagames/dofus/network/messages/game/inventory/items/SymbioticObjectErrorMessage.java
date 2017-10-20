// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SymbioticObjectErrorMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.ObjectErrorMessage {
  public static final int PROTOCOL_ID = 6526;
  // i8
  public byte errorCode;

  public SymbioticObjectErrorMessage() {}

  public SymbioticObjectErrorMessage(byte reason, byte errorCode) {

    super(reason);
    this.errorCode = errorCode;
  }

  @Override
  public int getProtocolId() {
    return 6526;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.errorCode);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.errorCode = reader.read_i8();
  }

  @Override
  public String toString() {

    return "SymbioticObjectErrorMessage("
        + "reason="
        + this.reason
        + ", errorCode="
        + this.errorCode
        + ')';
  }
}
