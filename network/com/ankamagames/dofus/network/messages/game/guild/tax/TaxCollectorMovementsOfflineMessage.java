// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorMovementsOfflineMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6611;
  // array,com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement[] movements;

  public TaxCollectorMovementsOfflineMessage() {}

  public TaxCollectorMovementsOfflineMessage(
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement[] movements) {
    this.movements = movements;
  }

  public TaxCollectorMovementsOfflineMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement>
          movements) {
    this.movements =
        movements.toArray(
            com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6611;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(movements.length);

    for (int i = 0; i < movements.length; i++) {

      movements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int movements_length = reader.read_ui16();
    this.movements =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement
            [movements_length];

    for (int i = 0; i < movements_length; i++) {

      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement movements_it =
          new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorMovement();

      movements_it.deserialize(reader);
      this.movements[i] = movements_it;
    }
  }

  @Override
  public String toString() {

    return "TaxCollectorMovementsOfflineMessage("
        + "movements="
        + java.util.Arrays.toString(this.movements)
        + ')';
  }
}
