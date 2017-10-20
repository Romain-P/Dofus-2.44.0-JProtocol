// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayTreasureHintInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 471;
  // vi16
  public short npcId;

  public GameRolePlayTreasureHintInformations() {}

  public GameRolePlayTreasureHintInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      short npcId) {

    super(contextualId, look, disposition);
    this.npcId = npcId;
  }

  @Override
  public int getProtocolId() {
    return 471;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.npcId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.npcId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GameRolePlayTreasureHintInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", npcId="
        + this.npcId
        + ')';
  }
}
