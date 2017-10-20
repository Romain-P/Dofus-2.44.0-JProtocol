// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberCompanionInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations {
  public static final int PROTOCOL_ID = 451;
  // i8
  public byte companionId;
  // ui8
  public short level;
  // f64
  public double masterId;

  public FightTeamMemberCompanionInformations() {}

  public FightTeamMemberCompanionInformations(
      double id, byte companionId, short level, double masterId) {

    super(id);
    this.companionId = companionId;
    this.level = level;
    this.masterId = masterId;
  }

  @Override
  public int getProtocolId() {
    return 451;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.companionId);
    writer.write_ui8(this.level);
    writer.write_f64(this.masterId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.companionId = reader.read_i8();
    this.level = reader.read_ui8();
    this.masterId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "FightTeamMemberCompanionInformations("
        + "id="
        + this.id
        + ", companionId="
        + this.companionId
        + ", level="
        + this.level
        + ", masterId="
        + this.masterId
        + ')';
  }
}
