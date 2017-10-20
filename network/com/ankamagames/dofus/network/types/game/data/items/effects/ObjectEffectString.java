// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectString
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 74;
  // str
  public java.lang.String value;

  public ObjectEffectString() {}

  public ObjectEffectString(short actionId, java.lang.String value) {

    super(actionId);
    this.value = value;
  }

  @Override
  public int getProtocolId() {
    return 74;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.value);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.value = reader.read_str();
  }

  @Override
  public String toString() {

    return "ObjectEffectString(" + "actionId=" + this.actionId + ", value=" + this.value + ')';
  }
}
