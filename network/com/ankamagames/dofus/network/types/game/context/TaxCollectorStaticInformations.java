// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorStaticInformations extends NetworkType {
  public static final int PROTOCOL_ID = 147;
  // vi16
  public short firstNameId;
  // vi16
  public short lastNameId;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildIdentity;

  public TaxCollectorStaticInformations() {}

  public TaxCollectorStaticInformations(
      short firstNameId,
      short lastNameId,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildIdentity) {
    this.firstNameId = firstNameId;
    this.lastNameId = lastNameId;
    this.guildIdentity = guildIdentity;
  }

  @Override
  public int getProtocolId() {
    return 147;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.firstNameId);
    writer.write_vi16(this.lastNameId);
    this.guildIdentity.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.firstNameId = reader.read_vi16();
    this.lastNameId = reader.read_vi16();
    this.guildIdentity =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildIdentity.deserialize(reader);
  }

  @Override
  public String toString() {

    return "TaxCollectorStaticInformations("
        + "firstNameId="
        + this.firstNameId
        + ", lastNameId="
        + this.lastNameId
        + ", guildIdentity="
        + this.guildIdentity
        + ')';
  }
}
