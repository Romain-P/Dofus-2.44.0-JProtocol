// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.atlas.compass;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CompassUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5591;
  // i8
  public byte type;
  // com.ankamagames.dofus.network.types.game.context.MapCoordinates
  public com.ankamagames.dofus.network.types.game.context.MapCoordinates coords;

  public CompassUpdateMessage()
  {}

  public CompassUpdateMessage(
      byte type, com.ankamagames.dofus.network.types.game.context.MapCoordinates coords)
  {
    this.type = type;
    this.coords = coords;
  }

  @Override
  public int getProtocolId()
  {
    return 5591;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.type);
    writer.write_ui16(this.coords.getProtocolId());
    this.coords.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.type = reader.read_i8();

    int coords_typeId = reader.read_ui16();
    this.coords =
        (com.ankamagames.dofus.network.types.game.context.MapCoordinates)
            InternalProtocolTypeManager.get(coords_typeId);
    this.coords.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "CompassUpdateMessage(" + "type=" + this.type + ", coords=" + this.coords + ')';
  }
}
