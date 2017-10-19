// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockGuildedInformations
    extends com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations {
  public static final int PROTOCOL_ID = 508;
  // bool
  public boolean deserted;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;

  public PaddockGuildedInformations()
  {}

  public PaddockGuildedInformations(
      java.math.BigInteger price,
      boolean locked,
      boolean deserted,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo)
  {

    super(price, locked);
    this.deserted = deserted;
    this.guildInfo = guildInfo;
  }

  @Override
  public int getProtocolId()
  {
    return 508;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.deserted);
    this.guildInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.deserted = reader.read_bool();
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildInfo.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PaddockGuildedInformations("
        + "price="
        + this.price
        + ", locked="
        + this.locked
        + ", deserted="
        + this.deserted
        + ", guildInfo="
        + this.guildInfo
        + ')';
  }
}
