// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayNpcWithQuestInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayNpcInformations {
  public static final int PROTOCOL_ID = 383;
  // com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
  public com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
      questFlag;

  public GameRolePlayNpcWithQuestInformations() {}

  public GameRolePlayNpcWithQuestInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      short npcId,
      boolean sex,
      short specialArtworkId,
      com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
          questFlag) {

    super(contextualId, look, disposition, npcId, sex, specialArtworkId);
    this.questFlag = questFlag;
  }

  @Override
  public int getProtocolId() {
    return 383;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.questFlag.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.questFlag =
        new com.ankamagames.dofus.network.types.game.context.roleplay.quest
            .GameRolePlayNpcQuestFlag();
    this.questFlag.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameRolePlayNpcWithQuestInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", npcId="
        + this.npcId
        + ", sex="
        + this.sex
        + ", specialArtworkId="
        + this.specialArtworkId
        + ", questFlag="
        + this.questFlag
        + ')';
  }
}
