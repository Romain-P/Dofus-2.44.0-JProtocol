// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterMinimalPlusLookInformations
    extends com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations {
  public static final int PROTOCOL_ID = 163;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook entityLook;

  public CharacterMinimalPlusLookInformations() {}

  public CharacterMinimalPlusLookInformations(
      long id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook) {

    super(id, name, level);
    this.entityLook = entityLook;
  }

  @Override
  public int getProtocolId() {
    return 163;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.entityLook.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.entityLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.entityLook.deserialize(reader);
  }

  @Override
  public String toString() {

    return "CharacterMinimalPlusLookInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", entityLook="
        + this.entityLook
        + ')';
  }
}
