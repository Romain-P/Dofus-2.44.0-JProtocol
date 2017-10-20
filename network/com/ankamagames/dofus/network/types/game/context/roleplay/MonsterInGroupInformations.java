// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MonsterInGroupInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .MonsterInGroupLightInformations {
  public static final int PROTOCOL_ID = 144;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;

  public MonsterInGroupInformations() {}

  public MonsterInGroupInformations(
      int creatureGenericId,
      byte grade,
      com.ankamagames.dofus.network.types.game.look.EntityLook look) {

    super(creatureGenericId, grade);
    this.look = look;
  }

  @Override
  public int getProtocolId() {
    return 144;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.look.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);
  }

  @Override
  public String toString() {

    return "MonsterInGroupInformations("
        + "creatureGenericId="
        + this.creatureGenericId
        + ", grade="
        + this.grade
        + ", look="
        + this.look
        + ')';
  }
}
