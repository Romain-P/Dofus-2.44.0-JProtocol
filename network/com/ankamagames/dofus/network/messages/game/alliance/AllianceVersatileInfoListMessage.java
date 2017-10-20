// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceVersatileInfoListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6436;
  // array,com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations
  public com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations[] alliances;

  public AllianceVersatileInfoListMessage() {}

  public AllianceVersatileInfoListMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations[] alliances) {
    this.alliances = alliances;
  }

  public AllianceVersatileInfoListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations>
          alliances) {
    this.alliances =
        alliances.toArray(
            com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6436;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(alliances.length);

    for (int i = 0; i < alliances.length; i++) {

      alliances[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int alliances_length = reader.read_ui16();
    this.alliances =
        new com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations
            [alliances_length];

    for (int i = 0; i < alliances_length; i++) {

      com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations alliances_it =
          new com.ankamagames.dofus.network.types.game.social.AllianceVersatileInformations();

      alliances_it.deserialize(reader);
      this.alliances[i] = alliances_it;
    }
  }

  @Override
  public String toString() {

    return "AllianceVersatileInfoListMessage("
        + "alliances="
        + java.util.Arrays.toString(this.alliances)
        + ')';
  }
}
