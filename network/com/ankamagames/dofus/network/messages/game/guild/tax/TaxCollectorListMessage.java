// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorListMessage
    extends com.ankamagames.dofus.network.messages.game.guild.tax.AbstractTaxCollectorListMessage {
  public static final int PROTOCOL_ID = 5930;
  // i8
  public byte nbcollectorMax;
  // array,com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation[]
      fightersInformations;

  public TaxCollectorListMessage() {}

  public TaxCollectorListMessage(
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations[] informations,
      byte nbcollectorMax,
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation[]
          fightersInformations) {

    super(informations);
    this.nbcollectorMax = nbcollectorMax;
    this.fightersInformations = fightersInformations;
  }

  public TaxCollectorListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations>
          informations,
      byte nbcollectorMax,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation>
          fightersInformations) {

    super(informations);
    this.nbcollectorMax = nbcollectorMax;
    this.fightersInformations =
        fightersInformations.toArray(
            com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5930;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.nbcollectorMax);
    writer.write_ui16(fightersInformations.length);

    for (int i = 0; i < fightersInformations.length; i++) {

      fightersInformations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.nbcollectorMax = reader.read_i8();

    int fightersInformations_length = reader.read_ui16();
    this.fightersInformations =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation
            [fightersInformations_length];

    for (int i = 0; i < fightersInformations_length; i++) {

      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorFightersInformation
          fightersInformations_it =
              new com.ankamagames.dofus.network.types.game.guild.tax
                  .TaxCollectorFightersInformation();

      fightersInformations_it.deserialize(reader);
      this.fightersInformations[i] = fightersInformations_it;
    }
  }

  @Override
  public String toString() {

    return "TaxCollectorListMessage("
        + "informations="
        + java.util.Arrays.toString(this.informations)
        + ", nbcollectorMax="
        + this.nbcollectorMax
        + ", fightersInformations="
        + java.util.Arrays.toString(this.fightersInformations)
        + ')';
  }
}
