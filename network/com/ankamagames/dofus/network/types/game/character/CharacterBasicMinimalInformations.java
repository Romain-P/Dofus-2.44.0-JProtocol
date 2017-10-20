// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterBasicMinimalInformations
    extends com.ankamagames.dofus.network.types.game.character.AbstractCharacterInformation {
  public static final int PROTOCOL_ID = 503;
  // str
  public java.lang.String name;

  public CharacterBasicMinimalInformations() {}

  public CharacterBasicMinimalInformations(long id, java.lang.String name) {

    super(id);
    this.name = name;
  }

  @Override
  public int getProtocolId() {
    return 503;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.name = reader.read_str();
  }

  @Override
  public String toString() {

    return "CharacterBasicMinimalInformations(" + "id=" + this.id + ", name=" + this.name + ')';
  }
}
