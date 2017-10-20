// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MonsterInGroupLightInformations extends NetworkType {
  public static final int PROTOCOL_ID = 395;
  // i32
  public int creatureGenericId;
  // i8
  public byte grade;

  public MonsterInGroupLightInformations() {}

  public MonsterInGroupLightInformations(int creatureGenericId, byte grade) {
    this.creatureGenericId = creatureGenericId;
    this.grade = grade;
  }

  @Override
  public int getProtocolId() {
    return 395;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.creatureGenericId);
    writer.write_i8(this.grade);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.creatureGenericId = reader.read_i32();
    this.grade = reader.read_i8();
  }

  @Override
  public String toString() {

    return "MonsterInGroupLightInformations("
        + "creatureGenericId="
        + this.creatureGenericId
        + ", grade="
        + this.grade
        + ')';
  }
}
