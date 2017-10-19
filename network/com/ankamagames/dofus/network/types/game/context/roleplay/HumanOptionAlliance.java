// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionAlliance
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 425;
  // com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
      allianceInformations;
  // i8
  public byte aggressable;

  public HumanOptionAlliance()
  {}

  public HumanOptionAlliance(
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
          allianceInformations,
      byte aggressable)
  {

    super();
    this.allianceInformations = allianceInformations;
    this.aggressable = aggressable;
  }

  @Override
  public int getProtocolId()
  {
    return 425;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.allianceInformations.serialize(writer);
    writer.write_i8(this.aggressable);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.allianceInformations =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations();
    this.allianceInformations.deserialize(reader);
    this.aggressable = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "HumanOptionAlliance("
        + "allianceInformations="
        + this.allianceInformations
        + ", aggressable="
        + this.aggressable
        + ')';
  }
}
