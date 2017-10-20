// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightEntityDispositionInformations
    extends com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations {
  public static final int PROTOCOL_ID = 217;
  // f64
  public double carryingCharacterId;

  public FightEntityDispositionInformations() {}

  public FightEntityDispositionInformations(
      short cellId, byte direction, double carryingCharacterId) {

    super(cellId, direction);
    this.carryingCharacterId = carryingCharacterId;
  }

  @Override
  public int getProtocolId() {
    return 217;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.carryingCharacterId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.carryingCharacterId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "FightEntityDispositionInformations("
        + "cellId="
        + this.cellId
        + ", direction="
        + this.direction
        + ", carryingCharacterId="
        + this.carryingCharacterId
        + ')';
  }
}
