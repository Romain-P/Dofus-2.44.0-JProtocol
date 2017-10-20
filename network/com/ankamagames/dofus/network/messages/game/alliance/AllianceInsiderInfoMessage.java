// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInsiderInfoMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6403;
  // com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations
  public com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations
      allianceInfos;
  // array,com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations
  public com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations[] guilds;
  // array,com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo
  public com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[] prisms;

  public AllianceInsiderInfoMessage() {}

  public AllianceInsiderInfoMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations allianceInfos,
      com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations[] guilds,
      com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[] prisms) {
    this.allianceInfos = allianceInfos;
    this.guilds = guilds;
    this.prisms = prisms;
  }

  public AllianceInsiderInfoMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations allianceInfos,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations>
          guilds,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo>
          prisms) {
    this.allianceInfos = allianceInfos;
    this.guilds =
        guilds.toArray(
            com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations[]
                ::new);
    this.prisms =
        prisms.toArray(com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6403;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.allianceInfos.serialize(writer);
    writer.write_ui16(guilds.length);

    for (int i = 0; i < guilds.length; i++) {

      guilds[i].serialize(writer);
    }
    writer.write_ui16(prisms.length);

    for (int i = 0; i < prisms.length; i++) {

      writer.write_ui16(prisms[i].getProtocolId());

      prisms[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allianceInfos =
        new com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations();
    this.allianceInfos.deserialize(reader);

    int guilds_length = reader.read_ui16();
    this.guilds =
        new com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations
            [guilds_length];

    for (int i = 0; i < guilds_length; i++) {

      com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations guilds_it =
          new com.ankamagames.dofus.network.types.game.social.GuildInsiderFactSheetInformations();

      guilds_it.deserialize(reader);
      this.guilds[i] = guilds_it;
    }

    int prisms_length = reader.read_ui16();
    this.prisms =
        new com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[prisms_length];

    for (int i = 0; i < prisms_length; i++) {

      int prisms_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo prisms_it =
          (com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo)
              InternalProtocolTypeManager.get(prisms_it_typeId);

      prisms_it.deserialize(reader);
      this.prisms[i] = prisms_it;
    }
  }

  @Override
  public String toString() {

    return "AllianceInsiderInfoMessage("
        + "allianceInfos="
        + this.allianceInfos
        + ", guilds="
        + java.util.Arrays.toString(this.guilds)
        + ", prisms="
        + java.util.Arrays.toString(this.prisms)
        + ')';
  }
}
