// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MimicryObjectErrorMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items
        .SymbioticObjectErrorMessage {
  public static final int PROTOCOL_ID = 6461;
  // bool
  public boolean preview;

  public MimicryObjectErrorMessage()
  {}

  public MimicryObjectErrorMessage(byte reason, byte errorCode, boolean preview)
  {

    super(reason, errorCode);
    this.preview = preview;
  }

  @Override
  public int getProtocolId()
  {
    return 6461;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.preview);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.preview = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "MimicryObjectErrorMessage("
        + "reason="
        + this.reason
        + ", errorCode="
        + this.errorCode
        + ", preview="
        + this.preview
        + ')';
  }
}
