// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayHumanoidInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayNamedActorInformations {
  public static final int PROTOCOL_ID = 159;
  // com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations humanoidInfo;
  // i32
  public int accountId;

  public GameRolePlayHumanoidInformations() {}

  public GameRolePlayHumanoidInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations humanoidInfo,
      int accountId) {

    super(contextualId, look, disposition, name);
    this.humanoidInfo = humanoidInfo;
    this.accountId = accountId;
  }

  @Override
  public int getProtocolId() {
    return 159;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.humanoidInfo.getProtocolId());
    this.humanoidInfo.serialize(writer);
    writer.write_i32(this.accountId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int humanoidInfo_typeId = reader.read_ui16();
    this.humanoidInfo =
        (com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations)
            InternalProtocolTypeManager.get(humanoidInfo_typeId);
    this.humanoidInfo.deserialize(reader);
    this.accountId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GameRolePlayHumanoidInformations("
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
        + ')';
  }
}
