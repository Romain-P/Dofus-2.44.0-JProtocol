// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectInteger
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 70;
  // vi32
  public int value;

  public ObjectEffectInteger() {}

  public ObjectEffectInteger(short actionId, int value) {

    super(actionId);
    this.value = value;
  }

  @Override
  public int getProtocolId() {
    return 70;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.value);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.value = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectEffectInteger(" + "actionId=" + this.actionId + ", value=" + this.value + ')';
  }
}
