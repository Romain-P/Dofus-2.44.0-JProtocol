// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalPlusLookAndGradeInformations
    extends com.ankamagames.dofus.network.types.game.character
        .CharacterMinimalPlusLookInformations {
  public static final int PROTOCOL_ID = 193;
  // vi32
  public int grade;

  public CharacterMinimalPlusLookAndGradeInformations() {}

  public CharacterMinimalPlusLookAndGradeInformations(
      long id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      int grade) {

    super(id, name, level, entityLook);
    this.grade = grade;
  }

  @Override
  public int getProtocolId() {
    return 193;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.grade);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.grade = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "CharacterMinimalPlusLookAndGradeInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", entityLook="
        + this.entityLook
        + ", grade="
        + this.grade
        + ')';
  }
}
