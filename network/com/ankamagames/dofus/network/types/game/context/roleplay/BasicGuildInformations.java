// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicGuildInformations
    extends com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos {
  public static final int PROTOCOL_ID = 365;
  // vi32
  public int guildId;
  // str
  public java.lang.String guildName;
  // ui8
  public short guildLevel;

  public BasicGuildInformations() {}

  public BasicGuildInformations(int guildId, java.lang.String guildName, short guildLevel) {

    super();
    this.guildId = guildId;
    this.guildName = guildName;
    this.guildLevel = guildLevel;
  }

  @Override
  public int getProtocolId() {
    return 365;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.guildId);
    writer.write_str(this.guildName);
    writer.write_ui8(this.guildLevel);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.guildId = reader.read_vi32();
    this.guildName = reader.read_str();
    this.guildLevel = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "BasicGuildInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ')';
  }
}
