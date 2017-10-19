// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayCharacterInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayHumanoidInformations {
  public static final int PROTOCOL_ID = 36;
  // com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
  public com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
      alignmentInfos;

  public GameRolePlayCharacterInformations()
  {}

  public GameRolePlayCharacterInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations humanoidInfo,
      int accountId,
      com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
          alignmentInfos)
  {

    super(contextualId, look, disposition, name, humanoidInfo, accountId);
    this.alignmentInfos = alignmentInfos;
  }

  @Override
  public int getProtocolId()
  {
    return 36;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.alignmentInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.alignmentInfos =
        new com.ankamagames.dofus.network.types.game.character.alignment
            .ActorAlignmentInformations();
    this.alignmentInfos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameRolePlayCharacterInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", name="
        + this.name
        + ", humanoidInfo="
        + this.humanoidInfo
        + ", accountId="
        + this.accountId
        + ", alignmentInfos="
        + this.alignmentInfos
        + ')';
  }
}
