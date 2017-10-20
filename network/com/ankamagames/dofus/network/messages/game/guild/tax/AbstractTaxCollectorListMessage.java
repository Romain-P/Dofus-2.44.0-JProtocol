// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractTaxCollectorListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6568;
  // array,com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations[] informations;

  public AbstractTaxCollectorListMessage() {}

  public AbstractTaxCollectorListMessage(
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations[] informations) {
    this.informations = informations;
  }

  public AbstractTaxCollectorListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations>
          informations) {
    this.informations =
        informations.toArray(
            com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6568;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(informations.length);

    for (int i = 0; i < informations.length; i++) {

      writer.write_ui16(informations[i].getProtocolId());

      informations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int informations_length = reader.read_ui16();
    this.informations =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations
            [informations_length];

    for (int i = 0; i < informations_length; i++) {

      int informations_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations informations_it =
          (com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations)
              InternalProtocolTypeManager.get(informations_it_typeId);

      informations_it.deserialize(reader);
      this.informations[i] = informations_it;
    }
  }

  @Override
  public String toString() {

    return "AbstractTaxCollectorListMessage("
        + "informations="
        + java.util.Arrays.toString(this.informations)
        + ')';
  }
}
