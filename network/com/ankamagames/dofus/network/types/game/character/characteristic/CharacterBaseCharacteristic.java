// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.characteristic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterBaseCharacteristic extends NetworkType {
  public static final int PROTOCOL_ID = 4;
  // vi16
  public short base;
  // vi16
  public short additionnal;
  // vi16
  public short objectsAndMountBonus;
  // vi16
  public short alignGiftBonus;
  // vi16
  public short contextModif;

  public CharacterBaseCharacteristic()
  {}

  public CharacterBaseCharacteristic(
      short base,
      short additionnal,
      short objectsAndMountBonus,
      short alignGiftBonus,
      short contextModif)
  {
    this.base = base;
    this.additionnal = additionnal;
    this.objectsAndMountBonus = objectsAndMountBonus;
    this.alignGiftBonus = alignGiftBonus;
    this.contextModif = contextModif;
  }

  @Override
  public int getProtocolId()
  {
    return 4;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.base);
    writer.write_vi16(this.additionnal);
    writer.write_vi16(this.objectsAndMountBonus);
    writer.write_vi16(this.alignGiftBonus);
    writer.write_vi16(this.contextModif);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.base = reader.read_vi16();
    this.additionnal = reader.read_vi16();
    this.objectsAndMountBonus = reader.read_vi16();
    this.alignGiftBonus = reader.read_vi16();
    this.contextModif = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "CharacterBaseCharacteristic("
        + "base="
        + this.base
        + ", additionnal="
        + this.additionnal
        + ", objectsAndMountBonus="
        + this.objectsAndMountBonus
        + ", alignGiftBonus="
        + this.alignGiftBonus
        + ", contextModif="
        + this.contextModif
        + ')';
  }
}
