// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayMerchantInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayNamedActorInformations {
  public static final int PROTOCOL_ID = 129;
  // i8
  public byte sellType;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption
  public com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[] options;

  public GameRolePlayMerchantInformations() {}

  public GameRolePlayMerchantInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      byte sellType,
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[] options) {

    super(contextualId, look, disposition, name);
    this.sellType = sellType;
    this.options = options;
  }

  public GameRolePlayMerchantInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      java.lang.String name,
      byte sellType,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption>
          options) {

    super(contextualId, look, disposition, name);
    this.sellType = sellType;
    this.options =
        options.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[]::new);
  }

  @Override
  public int getProtocolId() {
    return 129;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.sellType);
    writer.write_ui16(options.length);

    for (int i = 0; i < options.length; i++) {

      writer.write_ui16(options[i].getProtocolId());

      options[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.sellType = reader.read_i8();

    int options_length = reader.read_ui16();
    this.options =
        new com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption[options_length];

    for (int i = 0; i < options_length; i++) {

      int options_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption options_it =
          (com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption)
              InternalProtocolTypeManager.get(options_it_typeId);

      options_it.deserialize(reader);
      this.options[i] = options_it;
    }
  }

  @Override
  public String toString() {

    return "GameRolePlayMerchantInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", name="
        + this.name
        + ", sellType="
        + this.sellType
        + ", options="
        + java.util.Arrays.toString(this.options)
        + ')';
  }
}
