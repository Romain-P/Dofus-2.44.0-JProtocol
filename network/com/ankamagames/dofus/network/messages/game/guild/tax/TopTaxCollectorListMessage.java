// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TopTaxCollectorListMessage
    extends com.ankamagames.dofus.network.messages.game.guild.tax.AbstractTaxCollectorListMessage {
  public static final int PROTOCOL_ID = 6565;
  // bool
  public boolean isDungeon;

  public TopTaxCollectorListMessage()
  {}

  public TopTaxCollectorListMessage(
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations[] informations,
      boolean isDungeon)
  {

    super(informations);
    this.isDungeon = isDungeon;
  }

  public TopTaxCollectorListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations>
          informations,
      boolean isDungeon)
  {

    super(informations);
    this.isDungeon = isDungeon;
  }

  @Override
  public int getProtocolId()
  {
    return 6565;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.isDungeon);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.isDungeon = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "TopTaxCollectorListMessage("
        + "informations="
        + java.util.Arrays.toString(this.informations)
        + ", isDungeon="
        + this.isDungeon
        + ')';
  }
}
