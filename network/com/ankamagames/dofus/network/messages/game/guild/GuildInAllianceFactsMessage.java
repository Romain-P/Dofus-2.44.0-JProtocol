// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInAllianceFactsMessage
    extends com.ankamagames.dofus.network.messages.game.guild.GuildFactsMessage {
  public static final int PROTOCOL_ID = 6422;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
      allianceInfos;

  public GuildInAllianceFactsMessage()
  {}

  public GuildInAllianceFactsMessage(
      com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations infos,
      int creationDate,
      short nbTaxCollectors,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations[] members,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
          allianceInfos)
  {

    super(infos, creationDate, nbTaxCollectors, members);
    this.allianceInfos = allianceInfos;
  }

  public GuildInAllianceFactsMessage(
      com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations infos,
      int creationDate,
      short nbTaxCollectors,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations>
          members,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
          allianceInfos)
  {

    super(infos, creationDate, nbTaxCollectors, members);
    this.allianceInfos = allianceInfos;
  }

  @Override
  public int getProtocolId()
  {
    return 6422;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.allianceInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.allianceInfos =
        new com.ankamagames.dofus.network.types.game.context.roleplay
            .BasicNamedAllianceInformations();
    this.allianceInfos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildInAllianceFactsMessage("
        + "infos="
        + this.infos
        + ", creationDate="
        + this.creationDate
        + ", nbTaxCollectors="
        + this.nbTaxCollectors
        + ", members="
        + java.util.Arrays.toString(this.members)
        + ", allianceInfos="
        + this.allianceInfos
        + ')';
  }
}
