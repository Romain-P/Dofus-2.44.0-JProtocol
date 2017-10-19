// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorGuildInformations
    extends com.ankamagames.dofus.network.types.game.guild.tax
        .TaxCollectorComplementaryInformations {
  public static final int PROTOCOL_ID = 446;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild;

  public TaxCollectorGuildInformations()
  {}

  public TaxCollectorGuildInformations(
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild)
  {

    super();
    this.guild = guild;
  }

  @Override
  public int getProtocolId()
  {
    return 446;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.guild.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guild =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guild.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "TaxCollectorGuildInformations(" + "guild=" + this.guild + ')';
  }
}
