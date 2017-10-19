// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MimicryObjectFeedAndAssociateRequestMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items
        .SymbioticObjectAssociateRequestMessage {
  public static final int PROTOCOL_ID = 6460;
  // vi32
  public int foodUID;
  // ui8
  public short foodPos;
  // bool
  public boolean preview;

  public MimicryObjectFeedAndAssociateRequestMessage()
  {}

  public MimicryObjectFeedAndAssociateRequestMessage(
      int symbioteUID,
      short symbiotePos,
      int hostUID,
      short hostPos,
      int foodUID,
      short foodPos,
      boolean preview)
  {

    super(symbioteUID, symbiotePos, hostUID, hostPos);
    this.foodUID = foodUID;
    this.foodPos = foodPos;
    this.preview = preview;
  }

  @Override
  public int getProtocolId()
  {
    return 6460;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.foodUID);
    writer.write_ui8(this.foodPos);
    writer.write_bool(this.preview);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.foodUID = reader.read_vi32();
    this.foodPos = reader.read_ui8();
    this.preview = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "MimicryObjectFeedAndAssociateRequestMessage("
        + "symbioteUID="
        + this.symbioteUID
        + ", symbiotePos="
        + this.symbiotePos
        + ", hostUID="
        + this.hostUID
        + ", hostPos="
        + this.hostPos
        + ", foodUID="
        + this.foodUID
        + ", foodPos="
        + this.foodPos
        + ", preview="
        + this.preview
        + ')';
  }
}
