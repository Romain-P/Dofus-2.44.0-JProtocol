// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareReward extends NetworkType {
  public static final int PROTOCOL_ID = 505;
  // i8
  public byte type;
  // vi16
  public short monsterId;
  // vi64
  public long kamas;
  // f64
  public double dareId;

  public DareReward() {}

  public DareReward(byte type, short monsterId, long kamas, double dareId) {
    this.type = type;
    this.monsterId = monsterId;
    this.kamas = kamas;
    this.dareId = dareId;
  }

  @Override
  public int getProtocolId() {
    return 505;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.type);
    writer.write_vi16(this.monsterId);
    writer.write_vi64(this.kamas);
    writer.write_f64(this.dareId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type = reader.read_i8();
    this.monsterId = reader.read_vi16();
    this.kamas = reader.read_vi64();
    this.dareId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "DareReward("
        + "type="
        + this.type
        + ", monsterId="
        + this.monsterId
        + ", kamas="
        + this.kamas
        + ", dareId="
        + this.dareId
        + ')';
  }
}
