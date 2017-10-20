// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayNamedActorInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 154;
  // str
  public java.lang.String name;

  public GameRolePlayNamedActorInformations() {}

  public GameRolePlayNamedActorInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name) {

    super(contextualId, look, disposition);
    this.name = name;
  }

  @Override
  public int getProtocolId() {
    return 154;
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

    return "GameRolePlayNamedActorInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", name="
        + this.name
        + ')';
  }
}
