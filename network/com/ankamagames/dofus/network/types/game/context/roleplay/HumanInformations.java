// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanInformations extends NetworkType {
  public static final int PROTOCOL_ID = 157;
  // com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
  public com.ankamagames.dofus.network.types.game.character.restriction
          .ActorRestrictionsInformations
      restrictions;
  // bool
  public boolean sex;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption
  public com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[] options;

  public HumanInformations()
  {}

  public HumanInformations(
      com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
          restrictions,
      boolean sex,
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[] options)
  {
    this.restrictions = restrictions;
    this.sex = sex;
    this.options = options;
  }

  public HumanInformations(
      com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
          restrictions,
      boolean sex,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption>
          options)
  {
    this.restrictions = restrictions;
    this.sex = sex;
    this.options =
        options.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 157;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.restrictions.serialize(writer);
    writer.write_bool(this.sex);
    writer.write_ui16(options.length);

    for (int i = 0; i < options.length; i++)
  {

      writer.write_ui16(options[i].getProtocolId());

      options[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.restrictions =
        new com.ankamagames.dofus.network.types.game.character.restriction
            .ActorRestrictionsInformations();
    this.restrictions.deserialize(reader);
    this.sex = reader.read_bool();

    int options_length = reader.read_ui16();
    this.options =
        new com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[options_length];

    for (int i = 0; i < options_length; i++)
  {

      int options_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption options_it =
          (com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption)
              InternalProtocolTypeManager.get(options_it_typeId);

      options_it.deserialize(reader);
      this.options[i] = options_it;
    }
  }

  @Override
  public String toString()
  {

    return "HumanInformations("
        + "restrictions="
        + this.restrictions
        + ", sex="
        + this.sex
        + ", options="
        + java.util.Arrays.toString(this.options)
        + ')';
  }
}
