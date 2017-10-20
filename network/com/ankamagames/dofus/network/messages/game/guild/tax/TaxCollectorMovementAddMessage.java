// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorMovementAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5917;
  // com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations informations;

  public TaxCollectorMovementAddMessage() {}

  public TaxCollectorMovementAddMessage(
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations informations) {
    this.informations = informations;
  }

  @Override
  public int getProtocolId() {
    return 5917;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.informations.getProtocolId());
    this.informations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    int informations_typeId = reader.read_ui16();
    this.informations =
        (com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorInformations)
            InternalProtocolTypeManager.get(informations_typeId);
    this.informations.deserialize(reader);
  }

  @Override
  public String toString() {

    return "TaxCollectorMovementAddMessage(" + "informations=" + this.informations + ')';
  }
}
