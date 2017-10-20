// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterRemodelingInformation
    extends com.ankamagames.dofus.network.types.game.character.AbstractCharacterInformation {
  public static final int PROTOCOL_ID = 479;
  // str
  public java.lang.String name;
  // i8
  public byte breed;
  // bool
  public boolean sex;
  // vi16
  public short cosmeticId;
  // array,i32
  public int[] colors;

  public CharacterRemodelingInformation() {}

  public CharacterRemodelingInformation(
      long id, java.lang.String name, byte breed, boolean sex, short cosmeticId, int[] colors) {

    super(id);
    this.name = name;
    this.breed = breed;
    this.sex = sex;
    this.cosmeticId = cosmeticId;
    this.colors = colors;
  }

  @Override
  public int getProtocolId() {
    return 479;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.name);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
    writer.write_vi16(this.cosmeticId);
    writer.write_ui16(colors.length);
    writer.write_array_i32(this.colors);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.name = reader.read_str();
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();
    this.cosmeticId = reader.read_vi16();

    int colors_length = reader.read_ui16();
    this.colors = reader.read_array_i32(colors_length);
  }

  @Override
  public String toString() {

    return "CharacterRemodelingInformation("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", cosmeticId="
        + this.cosmeticId
        + ", colors="
        + java.util.Arrays.toString(this.colors)
        + ')';
  }
}
