// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockInstancesInformations
    extends com.ankamagames.dofus.network.types.game.paddock.PaddockInformations {
  public static final int PROTOCOL_ID = 509;
  // array,com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations
  public com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations[] paddocks;

  public PaddockInstancesInformations() {}

  public PaddockInstancesInformations(
      short maxOutdoorMount,
      short maxItems,
      com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations[] paddocks) {

    super(maxOutdoorMount, maxItems);
    this.paddocks = paddocks;
  }

  public PaddockInstancesInformations(
      short maxOutdoorMount,
      short maxItems,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations>
          paddocks) {

    super(maxOutdoorMount, maxItems);
    this.paddocks =
        paddocks.toArray(
            com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 509;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(paddocks.length);

    for (int i = 0; i < paddocks.length; i++) {

      writer.write_ui16(paddocks[i].getProtocolId());

      paddocks[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int paddocks_length = reader.read_ui16();
    this.paddocks =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations
            [paddocks_length];

    for (int i = 0; i < paddocks_length; i++) {

      int paddocks_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations paddocks_it =
          (com.ankamagames.dofus.network.types.game.paddock.PaddockBuyableInformations)
              InternalProtocolTypeManager.get(paddocks_it_typeId);

      paddocks_it.deserialize(reader);
      this.paddocks[i] = paddocks_it;
    }
  }

  @Override
  public String toString() {

    return "PaddockInstancesInformations("
        + "maxOutdoorMount="
        + this.maxOutdoorMount
        + ", maxItems="
        + this.maxItems
        + ", paddocks="
        + java.util.Arrays.toString(this.paddocks)
        + ')';
  }
}
