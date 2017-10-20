// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character.characteristic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterSpellModification extends NetworkType {
  public static final int PROTOCOL_ID = 215;
  // i8
  public byte modificationType;
  // vi16
  public short spellId;
  // com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
  public com.ankamagames.dofus.network.types.game.character.characteristic
          .CharacterBaseCharacteristic
      value;

  public CharacterSpellModification() {}

  public CharacterSpellModification(
      byte modificationType,
      short spellId,
      com.ankamagames.dofus.network.types.game.character.characteristic.CharacterBaseCharacteristic
          value) {
    this.modificationType = modificationType;
    this.spellId = spellId;
    this.value = value;
  }

  @Override
  public int getProtocolId() {
    return 215;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.modificationType);
    writer.write_vi16(this.spellId);
    this.value.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.modificationType = reader.read_i8();
    this.spellId = reader.read_vi16();
    this.value =
        new com.ankamagames.dofus.network.types.game.character.characteristic
            .CharacterBaseCharacteristic();
    this.value.deserialize(reader);
  }

  @Override
  public String toString() {

    return "CharacterSpellModification("
        + "modificationType="
        + this.modificationType
        + ", spellId="
        + this.spellId
        + ", value="
        + this.value
        + ')';
  }
}
