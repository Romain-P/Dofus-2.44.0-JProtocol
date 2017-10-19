// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractCharacterToRefurbishInformation
    extends com.ankamagames.dofus.network.types.game.character.AbstractCharacterInformation {
  public static final int PROTOCOL_ID = 475;
  // array,i32
  public int[] colors;
  // vi32
  public int cosmeticId;

  public AbstractCharacterToRefurbishInformation()
  {}

  public AbstractCharacterToRefurbishInformation(
      java.math.BigInteger id, int[] colors, int cosmeticId)
  {

    super(id);
    this.colors = colors;
    this.cosmeticId = cosmeticId;
  }

  @Override
  public int getProtocolId()
  {
    return 475;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(colors.length);
    writer.write_array_i32(this.colors);
    writer.write_vi32(this.cosmeticId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int colors_length = reader.read_ui16();
    this.colors = reader.read_array_i32(colors_length);
    this.cosmeticId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "AbstractCharacterToRefurbishInformation("
        + "id="
        + this.id
        + ", colors="
        + java.util.Arrays.toString(this.colors)
        + ", cosmeticId="
        + this.cosmeticId
        + ')';
  }
}
