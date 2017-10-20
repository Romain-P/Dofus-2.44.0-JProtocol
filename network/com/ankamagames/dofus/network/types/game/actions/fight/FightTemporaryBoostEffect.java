// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTemporaryBoostEffect
    extends com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect {
  public static final int PROTOCOL_ID = 209;
  // i16
  public short delta;

  public FightTemporaryBoostEffect() {}

  public FightTemporaryBoostEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid,
      short delta) {

    super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid);
    this.delta = delta;
  }

  @Override
  public int getProtocolId() {
    return 209;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.delta);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.delta = reader.read_i16();
  }

  @Override
  public String toString() {

    return "FightTemporaryBoostEffect("
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
        + ')';
  }
}
