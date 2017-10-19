// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AtlasPointsInformations extends NetworkType {
  public static final int PROTOCOL_ID = 175;
  // i8
  public byte type;
  // array,com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended
  public com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended[] coords;

  public AtlasPointsInformations()
  {}

  public AtlasPointsInformations(
      byte type, com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended[] coords)
  {
    this.type = type;
    this.coords = coords;
  }

  public AtlasPointsInformations(
      byte type,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended>
          coords)
  {
    this.type = type;
    this.coords =
        coords.toArray(
            com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 175;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.type);
    writer.write_ui16(coords.length);

    for (int i = 0; i < coords.length; i++)
  {

      coords[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.type = reader.read_i8();

    int coords_length = reader.read_ui16();
    this.coords =
        new com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended[coords_length];

    for (int i = 0; i < coords_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended coords_it =
          new com.ankamagames.dofus.network.types.game.context.MapCoordinatesExtended();

      coords_it.deserialize(reader);
      this.coords[i] = coords_it;
    }
  }

  @Override
  public String toString()
  {

    return "AtlasPointsInformations("
        + "type="
        + this.type
        + ", coords="
        + java.util.Arrays.toString(this.coords)
        + ')';
  }
}
