// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceFactsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6414;
  // com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations
  public com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations infos;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations[]
      guilds;
  // array,vi16
  public short[] controlledSubareaIds;
  // vi64
  public long leaderCharacterId;
  // str
  public java.lang.String leaderCharacterName;

  public AllianceFactsMessage() {}

  public AllianceFactsMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations infos,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations[]
          guilds,
      short[] controlledSubareaIds,
      long leaderCharacterId,
      java.lang.String leaderCharacterName) {
    this.infos = infos;
    this.guilds = guilds;
    this.controlledSubareaIds = controlledSubareaIds;
    this.leaderCharacterId = leaderCharacterId;
    this.leaderCharacterName = leaderCharacterName;
  }

  public AllianceFactsMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations infos,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations>
          guilds,
      short[] controlledSubareaIds,
      long leaderCharacterId,
      java.lang.String leaderCharacterName) {
    this.infos = infos;
    this.guilds =
        guilds.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations[]
                ::new);
    this.controlledSubareaIds = controlledSubareaIds;
    this.leaderCharacterId = leaderCharacterId;
    this.leaderCharacterName = leaderCharacterName;
  }

  @Override
  public int getProtocolId() {
    return 6414;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.infos.getProtocolId());
    this.infos.serialize(writer);
    writer.write_ui16(guilds.length);

    for (int i = 0; i < guilds.length; i++) {

      guilds[i].serialize(writer);
    }
    writer.write_ui16(controlledSubareaIds.length);
    writer.write_array_vi16(this.controlledSubareaIds);
    writer.write_vi64(this.leaderCharacterId);
    writer.write_str(this.leaderCharacterName);
  }

  @Override
  public void deserialize(DataReader reader) {

    int infos_typeId = reader.read_ui16();
    this.infos =
        (com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations)
            InternalProtocolTypeManager.get(infos_typeId);
    this.infos.deserialize(reader);

    int guilds_length = reader.read_ui16();
    this.guilds =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations
            [guilds_length];

    for (int i = 0; i < guilds_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInAllianceInformations
          guilds_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay
                  .GuildInAllianceInformations();

      guilds_it.deserialize(reader);
      this.guilds[i] = guilds_it;
    }

    int controlledSubareaIds_length = reader.read_ui16();
    this.controlledSubareaIds = reader.read_array_vi16(controlledSubareaIds_length);
    this.leaderCharacterId = reader.read_vi64();
    this.leaderCharacterName = reader.read_str();
  }

  @Override
  public String toString() {

    return "AllianceFactsMessage("
        + "infos="
        + this.infos
        + ", guilds="
        + java.util.Arrays.toString(this.guilds)
        + ", controlledSubareaIds="
        + java.util.Arrays.toString(this.controlledSubareaIds)
        + ", leaderCharacterId="
        + this.leaderCharacterId
        + ", leaderCharacterName="
        + this.leaderCharacterName
        + ')';
  }
}
