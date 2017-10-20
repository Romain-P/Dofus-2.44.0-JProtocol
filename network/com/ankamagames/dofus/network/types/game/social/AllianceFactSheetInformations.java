// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceFactSheetInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations {
  public static final int PROTOCOL_ID = 421;
  // i32
  public int creationDate;

  public AllianceFactSheetInformations() {}

  public AllianceFactSheetInformations(
      int allianceId,
      java.lang.String allianceTag,
      java.lang.String allianceName,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem allianceEmblem,
      int creationDate) {

    super(allianceId, allianceTag, allianceName, allianceEmblem);
    this.creationDate = creationDate;
  }

  @Override
  public int getProtocolId() {
    return 421;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.creationDate);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.creationDate = reader.read_i32();
  }

  @Override
  public String toString() {

    return "AllianceFactSheetInformations("
        + "allianceId="
        + this.allianceId
        + ", allianceTag="
        + this.allianceTag
        + ", allianceName="
        + this.allianceName
        + ", allianceEmblem="
        + this.allianceEmblem
        + ", creationDate="
        + this.creationDate
        + ')';
  }
}
