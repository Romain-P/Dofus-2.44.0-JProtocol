// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntShowLegendaryUIMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6498;
  // array,vi16
  public short[] availableLegendaryIds;

  public TreasureHuntShowLegendaryUIMessage() {}

  public TreasureHuntShowLegendaryUIMessage(short[] availableLegendaryIds) {
    this.availableLegendaryIds = availableLegendaryIds;
  }

  @Override
  public int getProtocolId() {
    return 6498;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(availableLegendaryIds.length);
    writer.write_array_vi16(this.availableLegendaryIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    int availableLegendaryIds_length = reader.read_ui16();
    this.availableLegendaryIds = reader.read_array_vi16(availableLegendaryIds_length);
  }

  @Override
  public String toString() {

    return "TreasureHuntShowLegendaryUIMessage("
        + "availableLegendaryIds="
        + java.util.Arrays.toString(this.availableLegendaryIds)
        + ')';
  }
}
