// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveElement extends NetworkType {
  public static final int PROTOCOL_ID = 80;
  // i32
  public int elementId;
  // i32
  public int elementTypeId;
  // array,com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
  public com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[]
      enabledSkills;
  // array,com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
  public com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[]
      disabledSkills;
  // bool
  public boolean onCurrentMap;

  public InteractiveElement() {}

  public InteractiveElement(
      int elementId,
      int elementTypeId,
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[] enabledSkills,
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[] disabledSkills,
      boolean onCurrentMap) {
    this.elementId = elementId;
    this.elementTypeId = elementTypeId;
    this.enabledSkills = enabledSkills;
    this.disabledSkills = disabledSkills;
    this.onCurrentMap = onCurrentMap;
  }

  public InteractiveElement(
      int elementId,
      int elementTypeId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill>
          enabledSkills,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill>
          disabledSkills,
      boolean onCurrentMap) {
    this.elementId = elementId;
    this.elementTypeId = elementTypeId;
    this.enabledSkills =
        enabledSkills.toArray(
            com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[]::new);
    this.disabledSkills =
        disabledSkills.toArray(
            com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[]::new);
    this.onCurrentMap = onCurrentMap;
  }

  @Override
  public int getProtocolId() {
    return 80;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.elementId);
    writer.write_i32(this.elementTypeId);
    writer.write_ui16(enabledSkills.length);

    for (int i = 0; i < enabledSkills.length; i++) {

      writer.write_ui16(enabledSkills[i].getProtocolId());

      enabledSkills[i].serialize(writer);
    }
    writer.write_ui16(disabledSkills.length);

    for (int i = 0; i < disabledSkills.length; i++) {

      writer.write_ui16(disabledSkills[i].getProtocolId());

      disabledSkills[i].serialize(writer);
    }
    writer.write_bool(this.onCurrentMap);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.elementId = reader.read_i32();
    this.elementTypeId = reader.read_i32();

    int enabledSkills_length = reader.read_ui16();
    this.enabledSkills =
        new com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
            [enabledSkills_length];

    for (int i = 0; i < enabledSkills_length; i++) {

      int enabledSkills_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
          enabledSkills_it =
              (com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill)
                  InternalProtocolTypeManager.get(enabledSkills_it_typeId);

      enabledSkills_it.deserialize(reader);
      this.enabledSkills[i] = enabledSkills_it;
    }

    int disabledSkills_length = reader.read_ui16();
    this.disabledSkills =
        new com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
            [disabledSkills_length];

    for (int i = 0; i < disabledSkills_length; i++) {

      int disabledSkills_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill
          disabledSkills_it =
              (com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill)
                  InternalProtocolTypeManager.get(disabledSkills_it_typeId);

      disabledSkills_it.deserialize(reader);
      this.disabledSkills[i] = disabledSkills_it;
    }
    this.onCurrentMap = reader.read_bool();
  }

  @Override
  public String toString() {

    return "InteractiveElement("
        + "elementId="
        + this.elementId
        + ", elementTypeId="
        + this.elementTypeId
        + ", enabledSkills="
        + java.util.Arrays.toString(this.enabledSkills)
        + ", disabledSkills="
        + java.util.Arrays.toString(this.disabledSkills)
        + ", onCurrentMap="
        + this.onCurrentMap
        + ')';
  }
}
