// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DecraftedItemStackInfo extends NetworkType {
  public static final int PROTOCOL_ID = 481;
  // vi32
  public int objectUID;
  // f32
  public float bonusMin;
  // f32
  public float bonusMax;
  // array,vi16
  public short[] runesId;
  // array,vi32
  public int[] runesQty;

  public DecraftedItemStackInfo()
  {}

  public DecraftedItemStackInfo(
      int objectUID, float bonusMin, float bonusMax, short[] runesId, int[] runesQty)
  {
    this.objectUID = objectUID;
    this.bonusMin = bonusMin;
    this.bonusMax = bonusMax;
    this.runesId = runesId;
    this.runesQty = runesQty;
  }

  @Override
  public int getProtocolId()
  {
    return 481;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.objectUID);
    writer.write_f32(this.bonusMin);
    writer.write_f32(this.bonusMax);
    writer.write_ui16(runesId.length);
    writer.write_array_vi16(this.runesId);
    writer.write_ui16(runesQty.length);
    writer.write_array_vi32(this.runesQty);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.objectUID = reader.read_vi32();
    this.bonusMin = reader.read_f32();
    this.bonusMax = reader.read_f32();

    int runesId_length = reader.read_ui16();
    this.runesId = reader.read_array_vi16(runesId_length);

    int runesQty_length = reader.read_ui16();
    this.runesQty = reader.read_array_vi32(runesQty_length);
  }

  @Override
  public String toString()
  {

    return "DecraftedItemStackInfo("
        + "objectUID="
        + this.objectUID
        + ", bonusMin="
        + this.bonusMin
        + ", bonusMax="
        + this.bonusMax
        + ", runesId="
        + java.util.Arrays.toString(this.runesId)
        + ", runesQty="
        + java.util.Arrays.toString(this.runesQty)
        + ')';
  }
}
