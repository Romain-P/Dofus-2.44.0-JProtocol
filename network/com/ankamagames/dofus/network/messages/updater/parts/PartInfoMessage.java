// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartInfoMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1508;
  // com.ankamagames.dofus.network.types.updater.ContentPart
  public com.ankamagames.dofus.network.types.updater.ContentPart part;
  // f32
  public float installationPercent;

  public PartInfoMessage()
  {}

  public PartInfoMessage(
      com.ankamagames.dofus.network.types.updater.ContentPart part, float installationPercent)
  {
    this.part = part;
    this.installationPercent = installationPercent;
  }

  @Override
  public int getProtocolId()
  {
    return 1508;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.part.serialize(writer);
    writer.write_f32(this.installationPercent);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.part = new com.ankamagames.dofus.network.types.updater.ContentPart();
    this.part.deserialize(reader);
    this.installationPercent = reader.read_f32();
  }

  @Override
  public String toString()
  {

    return "PartInfoMessage("
        + "part="
        + this.part
        + ", installationPercent="
        + this.installationPercent
        + ')';
  }
}
