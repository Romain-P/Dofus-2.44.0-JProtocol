// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GroupMonsterStaticInformations extends NetworkType {
  public static final int PROTOCOL_ID = 140;
  // com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
      mainCreatureLightInfos;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations[]
      underlings;

  public GroupMonsterStaticInformations() {}

  public GroupMonsterStaticInformations(
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
          mainCreatureLightInfos,
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations[]
          underlings) {
    this.mainCreatureLightInfos = mainCreatureLightInfos;
    this.underlings = underlings;
  }

  public GroupMonsterStaticInformations(
      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupLightInformations
          mainCreatureLightInfos,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations>
          underlings) {
    this.mainCreatureLightInfos = mainCreatureLightInfos;
    this.underlings =
        underlings.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 140;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.mainCreatureLightInfos.serialize(writer);
    writer.write_ui16(underlings.length);

    for (int i = 0; i < underlings.length; i++) {

      underlings[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mainCreatureLightInfos =
        new com.ankamagames.dofus.network.types.game.context.roleplay
            .MonsterInGroupLightInformations();
    this.mainCreatureLightInfos.deserialize(reader);

    int underlings_length = reader.read_ui16();
    this.underlings =
        new com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations
            [underlings_length];

    for (int i = 0; i < underlings_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.MonsterInGroupInformations
          underlings_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay
                  .MonsterInGroupInformations();

      underlings_it.deserialize(reader);
      this.underlings[i] = underlings_it;
    }
  }

  @Override
  public String toString() {

    return "GroupMonsterStaticInformations("
        + "mainCreatureLightInfos="
        + this.mainCreatureLightInfos
        + ", underlings="
        + java.util.Arrays.toString(this.underlings)
        + ')';
  }
}
