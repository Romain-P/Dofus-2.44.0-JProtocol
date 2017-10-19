// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorStaticExtendedInformations
    extends com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations {
  public static final int PROTOCOL_ID = 440;
  // com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
      allianceIdentity;

  public TaxCollectorStaticExtendedInformations()
  {}

  public TaxCollectorStaticExtendedInformations(
      short firstNameId,
      short lastNameId,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildIdentity,
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
          allianceIdentity)
  {

    super(firstNameId, lastNameId, guildIdentity);
    this.allianceIdentity = allianceIdentity;
  }

  @Override
  public int getProtocolId()
  {
    return 440;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.allianceIdentity.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.allianceIdentity =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations();
    this.allianceIdentity.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "TaxCollectorStaticExtendedInformations("
        + "firstNameId="
        + this.firstNameId
        + ", lastNameId="
        + this.lastNameId
        + ", guildIdentity="
        + this.guildIdentity
        + ", allianceIdentity="
        + this.allianceIdentity
        + ')';
  }
}
