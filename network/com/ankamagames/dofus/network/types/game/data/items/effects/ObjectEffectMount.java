// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectMount
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 179;
  // i32
  public int mountId;
  // f64
  public double date;
  // vi16
  public short modelId;

  public ObjectEffectMount()
  {}

  public ObjectEffectMount(short actionId, int mountId, double date, short modelId)
  {

    super(actionId);
    this.mountId = mountId;
    this.date = date;
    this.modelId = modelId;
  }

  @Override
  public int getProtocolId()
  {
    return 179;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.mountId);
    writer.write_f64(this.date);
    writer.write_vi16(this.modelId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.mountId = reader.read_i32();
    this.date = reader.read_f64();
    this.modelId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ObjectEffectMount("
        + "actionId="
        + this.actionId
        + ", mountId="
        + this.mountId
        + ", date="
        + this.date
        + ", modelId="
        + this.modelId
        + ')';
  }
}
