// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPortalInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 467;
  // com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.PortalInformation
  public com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.PortalInformation
      portal;

  public GameRolePlayPortalInformations()
  {}

  public GameRolePlayPortalInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.PortalInformation
          portal)
  {

    super(contextualId, look, disposition);
    this.portal = portal;
  }

  @Override
  public int getProtocolId()
  {
    return 467;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(this.portal.getProtocolId());
    this.portal.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int portal_typeId = reader.read_ui16();
    this.portal =
        (com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.PortalInformation)
            InternalProtocolTypeManager.get(portal_typeId);
    this.portal.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameRolePlayPortalInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", portal="
        + this.portal
        + ')';
  }
}
