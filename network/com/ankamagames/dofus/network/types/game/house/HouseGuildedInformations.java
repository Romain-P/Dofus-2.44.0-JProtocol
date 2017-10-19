// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.house;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildedInformations
    extends com.ankamagames.dofus.network.types.game.house.HouseInstanceInformations {
  public static final int PROTOCOL_ID = 512;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;

  public HouseGuildedInformations()
  {}

  public HouseGuildedInformations(
      boolean secondHand,
      boolean isLocked,
      boolean isSaleLocked,
      int instanceId,
      java.lang.String ownerName,
      long price,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo)
  {

    super(secondHand, isLocked, isSaleLocked, instanceId, ownerName, price);
    this.guildInfo = guildInfo;
  }

  @Override
  public int getProtocolId()
  {
    return 512;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.guildInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildInfo.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "HouseGuildedInformations("
        + "secondHand="
        + this.secondHand
        + ", isLocked="
        + this.isLocked
        + ", isSaleLocked="
        + this.isSaleLocked
        + ", instanceId="
        + this.instanceId
        + ", ownerName="
        + this.ownerName
        + ", price="
        + this.price
        + ", guildInfo="
        + this.guildInfo
        + ')';
  }
}
