// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicNamedAllianceInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations {
  public static final int PROTOCOL_ID = 418;
  // str
  public java.lang.String allianceName;

  public BasicNamedAllianceInformations() {}

  public BasicNamedAllianceInformations(
      int allianceId, java.lang.String allianceTag, java.lang.String allianceName) {

    super(allianceId, allianceTag);
    this.allianceName = allianceName;
  }

  @Override
  public int getProtocolId() {
    return 418;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.allianceName);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allianceName = reader.read_str();
  }

  @Override
  public String toString() {

    return "BasicNamedAllianceInformations("
        + "allianceId="
        + this.allianceId
        + ", allianceTag="
        + this.allianceTag
        + ", allianceName="
        + this.allianceName
        + ')';
  }
}
