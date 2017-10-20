// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapInformationsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 225;
  // f64
  public double mapId;

  public MapInformationsRequestMessage() {}

  public MapInformationsRequestMessage(double mapId) {
    this.mapId = mapId;
  }

  @Override
  public int getProtocolId() {
    return 225;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.mapId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mapId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "MapInformationsRequestMessage(" + "mapId=" + this.mapId + ')';
  }
}
