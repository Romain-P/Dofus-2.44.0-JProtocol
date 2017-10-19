// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPrismInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 161;
  // com.ankamagames.dofus.network.types.game.prism.PrismInformation
  public com.ankamagames.dofus.network.types.game.prism.PrismInformation prism;

  public GameRolePlayPrismInformations()
  {}

  public GameRolePlayPrismInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      com.ankamagames.dofus.network.types.game.prism.PrismInformation prism)
  {

    super(contextualId, look, disposition);
    this.prism = prism;
  }

  @Override
  public int getProtocolId()
  {
    return 161;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(this.prism.getProtocolId());
    this.prism.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int prism_typeId = reader.read_ui16();
    this.prism =
        (com.ankamagames.dofus.network.types.game.prism.PrismInformation)
            InternalProtocolTypeManager.get(prism_typeId);
    this.prism.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameRolePlayPrismInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", prism="
        + this.prism
        + ')';
  }
}
