// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceVersatileInformations extends NetworkType {
  public static final int PROTOCOL_ID = 432;
  // vi32
  public int allianceId;
  // vi16
  public short nbGuilds;
  // vi16
  public short nbMembers;
  // vi16
  public short nbSubarea;

  public AllianceVersatileInformations() {}

  public AllianceVersatileInformations(
      int allianceId, short nbGuilds, short nbMembers, short nbSubarea) {
    this.allianceId = allianceId;
    this.nbGuilds = nbGuilds;
    this.nbMembers = nbMembers;
    this.nbSubarea = nbSubarea;
  }

  @Override
  public int getProtocolId() {
    return 432;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.allianceId);
    writer.write_vi16(this.nbGuilds);
    writer.write_vi16(this.nbMembers);
    writer.write_vi16(this.nbSubarea);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allianceId = reader.read_vi32();
    this.nbGuilds = reader.read_vi16();
    this.nbMembers = reader.read_vi16();
    this.nbSubarea = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "AllianceVersatileInformations("
        + "allianceId="
        + this.allianceId
        + ", nbGuilds="
        + this.nbGuilds
        + ", nbMembers="
        + this.nbMembers
        + ", nbSubarea="
        + this.nbSubarea
        + ')';
  }
}
