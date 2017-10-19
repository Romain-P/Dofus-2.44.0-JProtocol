// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractFightDispellableEffect extends NetworkType {
  public static final int PROTOCOL_ID = 206;
  // vi32
  public int uid;
  // f64
  public double targetId;
  // i16
  public short turnDuration;
  // i8
  public byte dispelable;
  // vi16
  public short spellId;
  // vi32
  public int effectId;
  // vi32
  public int parentBoostUid;

  public AbstractFightDispellableEffect()
  {}

  public AbstractFightDispellableEffect(
      int uid,
      double targetId,
      short turnDuration,
      byte dispelable,
      short spellId,
      int effectId,
      int parentBoostUid)
  {
    this.uid = uid;
    this.targetId = targetId;
    this.turnDuration = turnDuration;
    this.dispelable = dispelable;
    this.spellId = spellId;
    this.effectId = effectId;
    this.parentBoostUid = parentBoostUid;
  }

  @Override
  public int getProtocolId()
  {
    return 206;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.uid);
    writer.write_f64(this.targetId);
    writer.write_i16(this.turnDuration);
    writer.write_i8(this.dispelable);
    writer.write_vi16(this.spellId);
    writer.write_vi32(this.effectId);
    writer.write_vi32(this.parentBoostUid);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.uid = reader.read_vi32();
    this.targetId = reader.read_f64();
    this.turnDuration = reader.read_i16();
    this.dispelable = reader.read_i8();
    this.spellId = reader.read_vi16();
    this.effectId = reader.read_vi32();
    this.parentBoostUid = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "AbstractFightDispellableEffect("
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
        + ')';
  }
}
