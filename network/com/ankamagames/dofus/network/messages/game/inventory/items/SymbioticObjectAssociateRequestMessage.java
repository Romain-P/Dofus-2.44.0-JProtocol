// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SymbioticObjectAssociateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6522;
  // vi32
  public int symbioteUID;
  // ui8
  public short symbiotePos;
  // vi32
  public int hostUID;
  // ui8
  public short hostPos;

  public SymbioticObjectAssociateRequestMessage() {}

  public SymbioticObjectAssociateRequestMessage(
      int symbioteUID, short symbiotePos, int hostUID, short hostPos) {
    this.symbioteUID = symbioteUID;
    this.symbiotePos = symbiotePos;
    this.hostUID = hostUID;
    this.hostPos = hostPos;
  }

  @Override
  public int getProtocolId() {
    return 6522;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.symbioteUID);
    writer.write_ui8(this.symbiotePos);
    writer.write_vi32(this.hostUID);
    writer.write_ui8(this.hostPos);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.symbioteUID = reader.read_vi32();
    this.symbiotePos = reader.read_ui8();
    this.hostUID = reader.read_vi32();
    this.hostPos = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "SymbioticObjectAssociateRequestMessage("
        + "symbioteUID="
        + this.symbioteUID
        + ", symbiotePos="
        + this.symbiotePos
        + ", hostUID="
        + this.hostUID
        + ", hostPos="
        + this.hostPos
        + ')';
  }
}
