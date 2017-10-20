// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ActorOrientation extends NetworkType {
  public static final int PROTOCOL_ID = 353;
  // f64
  public double id;
  // i8
  public byte direction;

  public ActorOrientation() {}

  public ActorOrientation(double id, byte direction) {
    this.id = id;
    this.direction = direction;
  }

  @Override
  public int getProtocolId() {
    return 353;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.id);
    writer.write_i8(this.direction);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_f64();
    this.direction = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ActorOrientation(" + "id=" + this.id + ", direction=" + this.direction + ')';
  }
}
