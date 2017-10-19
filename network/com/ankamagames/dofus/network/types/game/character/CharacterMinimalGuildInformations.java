// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalGuildInformations
    extends com.ankamagames.dofus.network.types.game.character
        .CharacterMinimalPlusLookInformations {
  public static final int PROTOCOL_ID = 445;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild;

  public CharacterMinimalGuildInformations()
  {}

  public CharacterMinimalGuildInformations(
      java.math.BigInteger id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild)
  {

    super(id, name, level, entityLook);
    this.guild = guild;
  }

  @Override
  public int getProtocolId()
  {
    return 445;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.guild.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guild =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guild.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "CharacterMinimalGuildInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", entityLook="
        + this.entityLook
        + ", guild="
        + this.guild
        + ')';
  }
}
