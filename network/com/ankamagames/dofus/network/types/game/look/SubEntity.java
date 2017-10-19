// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.look;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SubEntity extends NetworkType {
  public static final int PROTOCOL_ID = 54;
  // i8
  public byte bindingPointCategory;
  // i8
  public byte bindingPointIndex;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook subEntityLook;

  public SubEntity()
  {}

  public SubEntity(
      byte bindingPointCategory,
      byte bindingPointIndex,
      com.ankamagames.dofus.network.types.game.look.EntityLook subEntityLook)
  {
    this.bindingPointCategory = bindingPointCategory;
    this.bindingPointIndex = bindingPointIndex;
    this.subEntityLook = subEntityLook;
  }

  @Override
  public int getProtocolId()
  {
    return 54;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.bindingPointCategory);
    writer.write_i8(this.bindingPointIndex);
    this.subEntityLook.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.bindingPointCategory = reader.read_i8();
    this.bindingPointIndex = reader.read_i8();
    this.subEntityLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.subEntityLook.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "SubEntity("
        + "bindingPointCategory="
        + this.bindingPointCategory
        + ", bindingPointIndex="
        + this.bindingPointIndex
        + ", subEntityLook="
        + this.subEntityLook
        + ')';
  }
}
