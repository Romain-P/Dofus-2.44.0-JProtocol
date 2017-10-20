// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTaxCollectorInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.GameFightAIInformations {
  public static final int PROTOCOL_ID = 48;
  // vi16
  public short firstNameId;
  // vi16
  public short lastNameId;
  // ui8
  public short level;

  public GameFightTaxCollectorInformations() {}

  public GameFightTaxCollectorInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      short firstNameId,
      short lastNameId,
      short level) {

    super(contextualId, look, disposition, teamId, wave, alive, stats, previousPositions);
    this.firstNameId = firstNameId;
    this.lastNameId = lastNameId;
    this.level = level;
  }

  @Override
  public int getProtocolId() {
    return 48;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.firstNameId);
    writer.write_vi16(this.lastNameId);
    writer.write_ui8(this.level);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.firstNameId = reader.read_vi16();
    this.lastNameId = reader.read_vi16();
    this.level = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "GameFightTaxCollectorInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", teamId="
        + this.teamId
        + ", wave="
        + this.wave
        + ", alive="
        + this.alive
        + ", stats="
        + this.stats
        + ", previousPositions="
        + java.util.Arrays.toString(this.previousPositions)
        + ", firstNameId="
        + this.firstNameId
        + ", lastNameId="
        + this.lastNameId
        + ", level="
        + this.level
        + ')';
  }
}
