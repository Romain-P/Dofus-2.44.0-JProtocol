// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalAllianceInformations
    extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalGuildInformations {
  public static final int PROTOCOL_ID = 444;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
      alliance;

  public CharacterMinimalAllianceInformations()
  {}

  public CharacterMinimalAllianceInformations(
      java.math.BigInteger id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
          alliance)
  {

    super(id, name, level, entityLook, guild);
    this.alliance = alliance;
  }

  @Override
  public int getProtocolId()
  {
    return 444;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.alliance.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.alliance =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations();
    this.alliance.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "CharacterMinimalAllianceInformations("
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
        + ", alliance="
        + this.alliance
        + ')';
  }
}
