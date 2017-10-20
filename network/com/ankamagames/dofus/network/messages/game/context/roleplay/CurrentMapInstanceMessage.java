// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CurrentMapInstanceMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.CurrentMapMessage {
  public static final int PROTOCOL_ID = 6738;
  // f64
  public double instantiatedMapId;

  public CurrentMapInstanceMessage() {}

  public CurrentMapInstanceMessage(
      double mapId, java.lang.String mapKey, double instantiatedMapId) {

    super(mapId, mapKey);
    this.instantiatedMapId = instantiatedMapId;
  }

  @Override
  public int getProtocolId() {
    return 6738;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.instantiatedMapId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.instantiatedMapId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "CurrentMapInstanceMessage("
        + "mapId="
        + this.mapId
        + ", mapKey="
        + this.mapKey
        + ", instantiatedMapId="
        + this.instantiatedMapId
        + ')';
  }
}
