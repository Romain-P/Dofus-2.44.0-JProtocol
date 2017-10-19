// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.look;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EntityLook extends NetworkType {
  public static final int PROTOCOL_ID = 55;
  // vi16
  public short bonesId;
  // array,vi16
  public short[] skins;
  // array,i32
  public int[] indexedColors;
  // array,vi16
  public short[] scales;
  // array,com.ankamagames.dofus.network.types.game.look.SubEntity
  public com.ankamagames.dofus.network.types.game.look.SubEntity[] subentities;

  public EntityLook()
  {}

  public EntityLook(
      short bonesId,
      short[] skins,
      int[] indexedColors,
      short[] scales,
      com.ankamagames.dofus.network.types.game.look.SubEntity[] subentities)
  {
    this.bonesId = bonesId;
    this.skins = skins;
    this.indexedColors = indexedColors;
    this.scales = scales;
    this.subentities = subentities;
  }

  public EntityLook(
      short bonesId,
      short[] skins,
      int[] indexedColors,
      short[] scales,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.look.SubEntity>
          subentities)
  {
    this.bonesId = bonesId;
    this.skins = skins;
    this.indexedColors = indexedColors;
    this.scales = scales;
    this.subentities =
        subentities.toArray(com.ankamagames.dofus.network.types.game.look.SubEntity[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 55;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.bonesId);
    writer.write_ui16(skins.length);
    writer.write_array_vi16(this.skins);
    writer.write_ui16(indexedColors.length);
    writer.write_array_i32(this.indexedColors);
    writer.write_ui16(scales.length);
    writer.write_array_vi16(this.scales);
    writer.write_ui16(subentities.length);

    for (int i = 0; i < subentities.length; i++)
  {

      subentities[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.bonesId = reader.read_vi16();

    int skins_length = reader.read_ui16();
    this.skins = reader.read_array_vi16(skins_length);

    int indexedColors_length = reader.read_ui16();
    this.indexedColors = reader.read_array_i32(indexedColors_length);

    int scales_length = reader.read_ui16();
    this.scales = reader.read_array_vi16(scales_length);

    int subentities_length = reader.read_ui16();
    this.subentities =
        new com.ankamagames.dofus.network.types.game.look.SubEntity[subentities_length];

    for (int i = 0; i < subentities_length; i++)
  {

      com.ankamagames.dofus.network.types.game.look.SubEntity subentities_it =
          new com.ankamagames.dofus.network.types.game.look.SubEntity();

      subentities_it.deserialize(reader);
      this.subentities[i] = subentities_it;
    }
  }

  @Override
  public String toString()
  {

    return "EntityLook("
        + "bonesId="
        + this.bonesId
        + ", skins="
        + java.util.Arrays.toString(this.skins)
        + ", indexedColors="
        + java.util.Arrays.toString(this.indexedColors)
        + ", scales="
        + java.util.Arrays.toString(this.scales)
        + ", subentities="
        + java.util.Arrays.toString(this.subentities)
        + ')';
  }
}
