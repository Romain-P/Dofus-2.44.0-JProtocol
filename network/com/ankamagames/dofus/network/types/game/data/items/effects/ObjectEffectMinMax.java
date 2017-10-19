// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectMinMax
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 82;
  // vi32
  public int min;
  // vi32
  public int max;

  public ObjectEffectMinMax()
  {}

  public ObjectEffectMinMax(short actionId, int min, int max)
  {

    super(actionId);
    this.min = min;
    this.max = max;
  }

  @Override
  public int getProtocolId()
  {
    return 82;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.min);
    writer.write_vi32(this.max);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.min = reader.read_vi32();
    this.max = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ObjectEffectMinMax("
        + "actionId="
        + this.actionId
        + ", min="
        + this.min
        + ", max="
        + this.max
        + ')';
  }
}
