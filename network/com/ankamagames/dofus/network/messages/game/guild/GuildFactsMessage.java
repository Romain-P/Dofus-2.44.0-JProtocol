// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFactsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6415;
  // com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations
  public com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations infos;
  // i32
  public int creationDate;
  // vi16
  public short nbTaxCollectors;
  // array,com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations[] members;

  public GuildFactsMessage() {}

  public GuildFactsMessage(
      com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations infos,
      int creationDate,
      short nbTaxCollectors,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations[] members) {
    this.infos = infos;
    this.creationDate = creationDate;
    this.nbTaxCollectors = nbTaxCollectors;
    this.members = members;
  }

  public GuildFactsMessage(
      com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations infos,
      int creationDate,
      short nbTaxCollectors,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations>
          members) {
    this.infos = infos;
    this.creationDate = creationDate;
    this.nbTaxCollectors = nbTaxCollectors;
    this.members =
        members.toArray(
            com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6415;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.infos.getProtocolId());
    this.infos.serialize(writer);
    writer.write_i32(this.creationDate);
    writer.write_vi16(this.nbTaxCollectors);
    writer.write_ui16(members.length);

    for (int i = 0; i < members.length; i++) {

      members[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int infos_typeId = reader.read_ui16();
    this.infos =
        (com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations)
            InternalProtocolTypeManager.get(infos_typeId);
    this.infos.deserialize(reader);
    this.creationDate = reader.read_i32();
    this.nbTaxCollectors = reader.read_vi16();

    int members_length = reader.read_ui16();
    this.members =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
            [members_length];

    for (int i = 0; i < members_length; i++) {

      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations members_it =
          new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations();

      members_it.deserialize(reader);
      this.members[i] = members_it;
    }
  }

  @Override
  public String toString() {

    return "GuildFactsMessage("
        + "infos="
        + this.infos
        + ", creationDate="
        + this.creationDate
        + ", nbTaxCollectors="
        + this.nbTaxCollectors
        + ", members="
        + java.util.Arrays.toString(this.members)
        + ')';
  }
}
