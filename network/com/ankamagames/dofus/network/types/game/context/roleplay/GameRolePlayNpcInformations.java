// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayNpcInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 156;
  // vi16
  public short npcId;
  // bool
  public boolean sex;
  // vi16
  public short specialArtworkId;

  public GameRolePlayNpcInformations()
  {}

  public GameRolePlayNpcInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      short npcId,
      boolean sex,
      short specialArtworkId)
  {

    super(contextualId, look, disposition);
    this.npcId = npcId;
    this.sex = sex;
    this.specialArtworkId = specialArtworkId;
  }

  @Override
  public int getProtocolId()
  {
    return 156;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.npcId);
    writer.write_bool(this.sex);
    writer.write_vi16(this.specialArtworkId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.npcId = reader.read_vi16();
    this.sex = reader.read_bool();
    this.specialArtworkId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayNpcInformations("
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
        + ')';
  }
}
