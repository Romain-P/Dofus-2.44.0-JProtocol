// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemNotInContainer
    extends com.ankamagames.dofus.network.types.game.data.items.Item {
  public static final int PROTOCOL_ID = 134;
  // vi16
  public short objectGID;
  // array,com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
  public com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects;
  // vi32
  public int objectUID;
  // vi32
  public int quantity;

  public ObjectItemNotInContainer()
  {}

  public ObjectItemNotInContainer(
      short objectGID,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      int objectUID,
      int quantity)
  {

    super();
    this.objectGID = objectGID;
    this.effects = effects;
    this.objectUID = objectUID;
    this.quantity = quantity;
  }

  public ObjectItemNotInContainer(
      short objectGID,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      int objectUID,
      int quantity)
  {

    super();
    this.objectGID = objectGID;
    this.effects =
        effects.toArray(
            com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[]::new);
    this.objectUID = objectUID;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId()
  {
    return 134;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.objectGID);
    writer.write_ui16(effects.length);

    for (int i = 0; i < effects.length; i++)
  {

      writer.write_ui16(effects[i].getProtocolId());

      effects[i].serialize(writer);
    }
    writer.write_vi32(this.objectUID);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.objectGID = reader.read_vi16();

    int effects_length = reader.read_ui16();
    this.effects =
        new com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
            [effects_length];

    for (int i = 0; i < effects_length; i++)
  {

      int effects_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect effects_it =
          (com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect)
              InternalProtocolTypeManager.get(effects_it_typeId);

      effects_it.deserialize(reader);
      this.effects[i] = effects_it;
    }
    this.objectUID = reader.read_vi32();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ObjectItemNotInContainer("
        + "objectGID="
        + this.objectGID
        + ", effects="
        + java.util.Arrays.toString(this.effects)
        + ", objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ')';
  }
}
