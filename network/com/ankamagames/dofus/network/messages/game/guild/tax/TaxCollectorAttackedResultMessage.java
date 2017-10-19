// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorAttackedResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5635;
  // bool
  public boolean deadOrAlive;
  // com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations
      basicInfos;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild;

  public TaxCollectorAttackedResultMessage()
  {}

  public TaxCollectorAttackedResultMessage(
      boolean deadOrAlive,
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations basicInfos,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guild)
  {
    this.deadOrAlive = deadOrAlive;
    this.basicInfos = basicInfos;
    this.guild = guild;
  }

  @Override
  public int getProtocolId()
  {
    return 5635;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.deadOrAlive);
    this.basicInfos.serialize(writer);
    this.guild.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.deadOrAlive = reader.read_bool();
    this.basicInfos =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations();
    this.basicInfos.deserialize(reader);
    this.guild =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guild.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "TaxCollectorAttackedResultMessage("
        + "deadOrAlive="
        + this.deadOrAlive
        + ", basicInfos="
        + this.basicInfos
        + ", guild="
        + this.guild
        + ')';
  }
}
