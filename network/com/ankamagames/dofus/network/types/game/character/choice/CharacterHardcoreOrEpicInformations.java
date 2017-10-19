// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterHardcoreOrEpicInformations
    extends com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations {
  public static final int PROTOCOL_ID = 474;
  // i8
  public byte deathState;
  // vi16
  public short deathCount;
  // ui8
  public short deathMaxLevel;

  public CharacterHardcoreOrEpicInformations()
  {}

  public CharacterHardcoreOrEpicInformations(
      java.math.BigInteger id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      byte breed,
      boolean sex,
      byte deathState,
      short deathCount,
      short deathMaxLevel)
  {

    super(id, name, level, entityLook, breed, sex);
    this.deathState = deathState;
    this.deathCount = deathCount;
    this.deathMaxLevel = deathMaxLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 474;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.deathState);
    writer.write_vi16(this.deathCount);
    writer.write_ui8(this.deathMaxLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.deathState = reader.read_i8();
    this.deathCount = reader.read_vi16();
    this.deathMaxLevel = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "CharacterHardcoreOrEpicInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", entityLook="
        + this.entityLook
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", deathState="
        + this.deathState
        + ", deathCount="
        + this.deathCount
        + ", deathMaxLevel="
        + this.deathMaxLevel
        + ')';
  }
}
