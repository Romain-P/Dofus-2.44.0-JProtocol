// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyIdol extends com.ankamagames.dofus.network.types.game.idol.Idol {
  public static final int PROTOCOL_ID = 490;
  // array,vi64
  public long[] ownersIds;

  public PartyIdol() {}

  public PartyIdol(short id, short xpBonusPercent, short dropBonusPercent, long[] ownersIds) {

    super(id, xpBonusPercent, dropBonusPercent);
    this.ownersIds = ownersIds;
  }

  @Override
  public int getProtocolId() {
    return 490;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(ownersIds.length);
    writer.write_array_vi64(this.ownersIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int ownersIds_length = reader.read_ui16();
    this.ownersIds = reader.read_array_vi64(ownersIds_length);
  }

  @Override
  public String toString() {

    return "PartyIdol("
        + "id="
        + this.id
        + ", xpBonusPercent="
        + this.xpBonusPercent
        + ", dropBonusPercent="
        + this.dropBonusPercent
        + ", ownersIds="
        + java.util.Arrays.toString(this.ownersIds)
        + ')';
  }
}
