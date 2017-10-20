// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterToRemodelInformations
    extends com.ankamagames.dofus.network.types.game.character.choice
        .CharacterRemodelingInformation {
  public static final int PROTOCOL_ID = 477;
  // i8
  public byte possibleChangeMask;
  // i8
  public byte mandatoryChangeMask;

  public CharacterToRemodelInformations() {}

  public CharacterToRemodelInformations(
      long id,
      java.lang.String name,
      byte breed,
      boolean sex,
      short cosmeticId,
      int[] colors,
      byte possibleChangeMask,
      byte mandatoryChangeMask) {

    super(id, name, breed, sex, cosmeticId, colors);
    this.possibleChangeMask = possibleChangeMask;
    this.mandatoryChangeMask = mandatoryChangeMask;
  }

  @Override
  public int getProtocolId() {
    return 477;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.possibleChangeMask);
    writer.write_i8(this.mandatoryChangeMask);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.possibleChangeMask = reader.read_i8();
    this.mandatoryChangeMask = reader.read_i8();
  }

  @Override
  public String toString() {

    return "CharacterToRemodelInformations("
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
        + ", possibleChangeMask="
        + this.possibleChangeMask
        + ", mandatoryChangeMask="
        + this.mandatoryChangeMask
        + ')';
  }
}
