// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayMountInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayNamedActorInformations {
  public static final int PROTOCOL_ID = 180;
  // str
  public java.lang.String ownerName;
  // ui8
  public short level;

  public GameRolePlayMountInformations() {}

  public GameRolePlayMountInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      java.lang.String ownerName,
      short level) {

    super(contextualId, look, disposition, name);
    this.ownerName = ownerName;
    this.level = level;
  }

  @Override
  public int getProtocolId() {
    return 180;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.ownerName);
    writer.write_ui8(this.level);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.ownerName = reader.read_str();
    this.level = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "GameRolePlayMountInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", name="
        + this.name
        + ", ownerName="
        + this.ownerName
        + ", level="
        + this.level
        + ')';
  }
}
