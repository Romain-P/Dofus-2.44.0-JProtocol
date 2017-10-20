// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalInformations
    extends com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations {
  public static final int PROTOCOL_ID = 110;
  // ui8
  public short level;

  public CharacterMinimalInformations() {}

  public CharacterMinimalInformations(long id, java.lang.String name, short level) {

    super(id, name);
    this.level = level;
  }

  @Override
  public int getProtocolId() {
    return 110;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui8(this.level);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.level = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "CharacterMinimalInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ')';
  }
}
