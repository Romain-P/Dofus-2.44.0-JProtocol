// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SetUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5503;
  // vi16
  public short setId;
  // array,vi16
  public short[] setObjects;
  // array,com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
  public com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] setEffects;

  public SetUpdateMessage()
  {}

  public SetUpdateMessage(
      short setId,
      short[] setObjects,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] setEffects)
  {
    this.setId = setId;
    this.setObjects = setObjects;
    this.setEffects = setEffects;
  }

  public SetUpdateMessage(
      short setId,
      short[] setObjects,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          setEffects)
  {
    this.setId = setId;
    this.setObjects = setObjects;
    this.setEffects =
        setEffects.toArray(
            com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5503;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.setId);
    writer.write_ui16(setObjects.length);
    writer.write_array_vi16(this.setObjects);
    writer.write_ui16(setEffects.length);

    for (int i = 0; i < setEffects.length; i++)
  {

      writer.write_ui16(setEffects[i].getProtocolId());

      setEffects[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.setId = reader.read_vi16();

    int setObjects_length = reader.read_ui16();
    this.setObjects = reader.read_array_vi16(setObjects_length);

    int setEffects_length = reader.read_ui16();
    this.setEffects =
        new com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect
            [setEffects_length];

    for (int i = 0; i < setEffects_length; i++)
  {

      int setEffects_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect setEffects_it =
          (com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect)
              InternalProtocolTypeManager.get(setEffects_it_typeId);

      setEffects_it.deserialize(reader);
      this.setEffects[i] = setEffects_it;
    }
  }

  @Override
  public String toString()
  {

    return "SetUpdateMessage("
        + "setId="
        + this.setId
        + ", setObjects="
        + java.util.Arrays.toString(this.setObjects)
        + ", setEffects="
        + java.util.Arrays.toString(this.setEffects)
        + ')';
  }
}
