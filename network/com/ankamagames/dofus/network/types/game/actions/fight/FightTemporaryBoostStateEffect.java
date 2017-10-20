// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTemporaryBoostStateEffect
    extends com.ankamagames.dofus.network.types.game.actions.fight.FightTemporaryBoostEffect {
  public static final int PROTOCOL_ID = 214;
  // i16
  public short stateId;

  public FightTemporaryBoostStateEffect() {}

  public FightTemporaryBoostStateEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid,
      short delta,
      short stateId) {

    super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid, delta);
    this.stateId = stateId;
  }

  @Override
  public int getProtocolId() {
    return 214;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.stateId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.stateId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "FightTemporaryBoostStateEffect("
        + "uid="
        + this.uid
        + ", targetId="
        + this.targetId
        + ", turnDuration="
        + this.turnDuration
        + ", dispelable="
        + this.dispelable
        + ", spellId="
        + this.spellId
        + ", effectId="
        + this.effectId
        + ", parentBoostUid="
        + this.parentBoostUid
        + ", delta="
        + this.delta
        + ", stateId="
        + this.stateId
        + ')';
  }
}
