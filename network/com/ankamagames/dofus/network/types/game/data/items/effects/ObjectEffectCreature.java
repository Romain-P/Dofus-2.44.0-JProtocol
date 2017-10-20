// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectCreature
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 71;
  // vi16
  public short monsterFamilyId;

  public ObjectEffectCreature() {}

  public ObjectEffectCreature(short actionId, short monsterFamilyId) {

    super(actionId);
    this.monsterFamilyId = monsterFamilyId;
  }

  @Override
  public int getProtocolId() {
    return 71;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.monsterFamilyId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.monsterFamilyId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ObjectEffectCreature("
        + "actionId="
        + this.actionId
        + ", monsterFamilyId="
        + this.monsterFamilyId
        + ')';
  }
}
