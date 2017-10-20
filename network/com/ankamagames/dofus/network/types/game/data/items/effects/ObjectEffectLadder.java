// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectLadder
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffectCreature {
  public static final int PROTOCOL_ID = 81;
  // vi32
  public int monsterCount;

  public ObjectEffectLadder() {}

  public ObjectEffectLadder(short actionId, short monsterFamilyId, int monsterCount) {

    super(actionId, monsterFamilyId);
    this.monsterCount = monsterCount;
  }

  @Override
  public int getProtocolId() {
    return 81;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.monsterCount);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.monsterCount = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectEffectLadder("
        + "actionId="
        + this.actionId
        + ", monsterFamilyId="
        + this.monsterFamilyId
        + ", monsterCount="
        + this.monsterCount
        + ')';
  }
}
