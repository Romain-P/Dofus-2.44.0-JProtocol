// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTemporaryBoostWeaponDamagesEffect
    extends com.ankamagames.dofus.network.types.game.actions.fight.FightTemporaryBoostEffect {
  public static final int PROTOCOL_ID = 211;
  // i16
  public short weaponTypeId;

  public FightTemporaryBoostWeaponDamagesEffect() {}

  public FightTemporaryBoostWeaponDamagesEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid,
      short delta,
      short weaponTypeId) {

    super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid, delta);
    this.weaponTypeId = weaponTypeId;
  }

  @Override
  public int getProtocolId() {
    return 211;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.weaponTypeId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.weaponTypeId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "FightTemporaryBoostWeaponDamagesEffect("
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
        + ", weaponTypeId="
        + this.weaponTypeId
        + ')';
  }
}
