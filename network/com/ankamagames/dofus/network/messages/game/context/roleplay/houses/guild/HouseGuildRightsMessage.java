// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildRightsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5703;
  // vi32
  public int houseId;
  // i32
  public int instanceId;
  // bool
  public boolean secondHand;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
  // vi32
  public int rights;

  public HouseGuildRightsMessage() {}

  public HouseGuildRightsMessage(
      int houseId,
      int instanceId,
      boolean secondHand,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo,
      int rights) {
    this.houseId = houseId;
    this.instanceId = instanceId;
    this.secondHand = secondHand;
    this.guildInfo = guildInfo;
    this.rights = rights;
  }

  @Override
  public int getProtocolId() {
    return 5703;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
    writer.write_bool(this.secondHand);
    this.guildInfo.serialize(writer);
    writer.write_vi32(this.rights);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
    this.secondHand = reader.read_bool();
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildInfo.deserialize(reader);
    this.rights = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "HouseGuildRightsMessage("
        + "houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ", secondHand="
        + this.secondHand
        + ", guildInfo="
        + this.guildInfo
        + ", rights="
        + this.rights
        + ')';
  }
}
