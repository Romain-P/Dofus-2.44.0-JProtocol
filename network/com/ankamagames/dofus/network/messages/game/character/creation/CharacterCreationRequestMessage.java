// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.creation;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterCreationRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 160;
  // str
  public java.lang.String name;
  // i8
  public byte breed;
  // bool
  public boolean sex;
  // array,i32,5
  public int[] colors;
  // vi16
  public short cosmeticId;

  public CharacterCreationRequestMessage() {}

  public CharacterCreationRequestMessage(
      java.lang.String name, byte breed, boolean sex, int[] colors, short cosmeticId) {
    this.name = name;
    this.breed = breed;
    this.sex = sex;
    this.colors = colors;
    this.cosmeticId = cosmeticId;
  }

  @Override
  public int getProtocolId() {
    return 160;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.name);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
    writer.write_array_i32(this.colors);
    writer.write_vi16(this.cosmeticId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.name = reader.read_str();
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();

    int colors_length = 5;
    this.colors = reader.read_array_i32(colors_length);
    this.cosmeticId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "CharacterCreationRequestMessage("
        + "name="
        + this.name
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", colors="
        + java.util.Arrays.toString(this.colors)
        + ", cosmeticId="
        + this.cosmeticId
        + ')';
  }
}
