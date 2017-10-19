// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayMutantInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayHumanoidInformations {
  public static final int PROTOCOL_ID = 3;
  // vi16
  public short monsterId;
  // i8
  public byte powerLevel;

  public GameRolePlayMutantInformations()
  {}

  public GameRolePlayMutantInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanInformations humanoidInfo,
      int accountId,
      short monsterId,
      byte powerLevel)
  {

    super(contextualId, look, disposition, name, humanoidInfo, accountId);
    this.monsterId = monsterId;
    this.powerLevel = powerLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 3;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.monsterId);
    writer.write_i8(this.powerLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.monsterId = reader.read_vi16();
    this.powerLevel = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayMutantInformations("
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
        + ", monsterId="
        + this.monsterId
        + ", powerLevel="
        + this.powerLevel
        + ')';
  }
}
