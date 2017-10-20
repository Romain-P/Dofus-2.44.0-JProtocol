// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTriggeredEffect
    extends com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect {
  public static final int PROTOCOL_ID = 210;
  // i32
  public int param1;
  // i32
  public int param2;
  // i32
  public int param3;
  // i16
  public short delay;

  public FightTriggeredEffect() {}

  public FightTriggeredEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid,
      int param1,
      int param2,
      int param3,
      short delay) {

    super(uid, targetId, turnDuration, dispelable, spellId, effectId, parentBoostUid);
    this.param1 = param1;
    this.param2 = param2;
    this.param3 = param3;
    this.delay = delay;
  }

  @Override
  public int getProtocolId() {
    return 210;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.param1);
    writer.write_i32(this.param2);
    writer.write_i32(this.param3);
    writer.write_i16(this.delay);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.param1 = reader.read_i32();
    this.param2 = reader.read_i32();
    this.param3 = reader.read_i32();
    this.delay = reader.read_i16();
  }

  @Override
  public String toString() {

    return "FightTriggeredEffect("
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
        + ", param1="
        + this.param1
        + ", param2="
        + this.param2
        + ", param3="
        + this.param3
        + ", delay="
        + this.delay
        + ')';
  }
}
