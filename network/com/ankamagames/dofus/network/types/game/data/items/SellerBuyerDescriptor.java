// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SellerBuyerDescriptor extends NetworkType {
  public static final int PROTOCOL_ID = 121;
  // array,vi32
  public int[] quantities;
  // array,vi32
  public int[] types;
  // f32
  public float taxPercentage;
  // f32
  public float taxModificationPercentage;
  // ui8
  public short maxItemLevel;
  // vi32
  public int maxItemPerAccount;
  // i32
  public int npcContextualId;
  // vi16
  public short unsoldDelay;

  public SellerBuyerDescriptor() {}

  public SellerBuyerDescriptor(
      int[] quantities,
      int[] types,
      float taxPercentage,
      float taxModificationPercentage,
      short maxItemLevel,
      int maxItemPerAccount,
      int npcContextualId,
      short unsoldDelay) {
    this.quantities = quantities;
    this.types = types;
    this.taxPercentage = taxPercentage;
    this.taxModificationPercentage = taxModificationPercentage;
    this.maxItemLevel = maxItemLevel;
    this.maxItemPerAccount = maxItemPerAccount;
    this.npcContextualId = npcContextualId;
    this.unsoldDelay = unsoldDelay;
  }

  @Override
  public int getProtocolId() {
    return 121;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(quantities.length);
    writer.write_array_vi32(this.quantities);
    writer.write_ui16(types.length);
    writer.write_array_vi32(this.types);
    writer.write_f32(this.taxPercentage);
    writer.write_f32(this.taxModificationPercentage);
    writer.write_ui8(this.maxItemLevel);
    writer.write_vi32(this.maxItemPerAccount);
    writer.write_i32(this.npcContextualId);
    writer.write_vi16(this.unsoldDelay);
  }

  @Override
  public void deserialize(DataReader reader) {

    int quantities_length = reader.read_ui16();
    this.quantities = reader.read_array_vi32(quantities_length);

    int types_length = reader.read_ui16();
    this.types = reader.read_array_vi32(types_length);
    this.taxPercentage = reader.read_f32();
    this.taxModificationPercentage = reader.read_f32();
    this.maxItemLevel = reader.read_ui8();
    this.maxItemPerAccount = reader.read_vi32();
    this.npcContextualId = reader.read_i32();
    this.unsoldDelay = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "SellerBuyerDescriptor("
        + "quantities="
        + java.util.Arrays.toString(this.quantities)
        + ", types="
        + java.util.Arrays.toString(this.types)
        + ", taxPercentage="
        + this.taxPercentage
        + ", taxModificationPercentage="
        + this.taxModificationPercentage
        + ", maxItemLevel="
        + this.maxItemLevel
        + ", maxItemPerAccount="
        + this.maxItemPerAccount
        + ", npcContextualId="
        + this.npcContextualId
        + ", unsoldDelay="
        + this.unsoldDelay
        + ')';
  }
}
