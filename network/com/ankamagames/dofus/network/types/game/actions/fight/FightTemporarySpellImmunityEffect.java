// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTemporarySpellImmunityEffect
    extends com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect {
  public static final int PROTOCOL_ID = 366;
  // i32
  public int immuneSpellId;

  public FightTemporarySpellImmunityEffect() {}

  public FightTemporarySpellImmunityEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid,
      int immuneSpellId) {

    super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid);
    this.immuneSpellId = immuneSpellId;
  }

  @Override
  public int getProtocolId() {
    return 366;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.immuneSpellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.immuneSpellId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "FightTemporarySpellImmunityEffect("
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
        + ", immuneSpellId="
        + this.immuneSpellId
        + ')';
  }
}
