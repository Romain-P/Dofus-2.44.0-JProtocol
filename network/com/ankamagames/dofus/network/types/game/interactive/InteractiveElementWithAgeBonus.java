// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveElementWithAgeBonus
    extends com.ankamagames.dofus.network.types.game.interactive.InteractiveElement {
  public static final int PROTOCOL_ID = 398;
  // i16
  public short ageBonus;

  public InteractiveElementWithAgeBonus()
  {}

  public InteractiveElementWithAgeBonus(
      int elementId,
      int elementTypeId,
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[] enabledSkills,
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill[] disabledSkills,
      boolean onCurrentMap,
      short ageBonus)
  {

    super(elementId, elementTypeId, enabledSkills, disabledSkills, onCurrentMap);
    this.ageBonus = ageBonus;
  }

  public InteractiveElementWithAgeBonus(
      int elementId,
      int elementTypeId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill>
          enabledSkills,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElementSkill>
          disabledSkills,
      boolean onCurrentMap,
      short ageBonus)
  {

    super(elementId, elementTypeId, enabledSkills, disabledSkills, onCurrentMap);
    this.ageBonus = ageBonus;
  }

  @Override
  public int getProtocolId()
  {
    return 398;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i16(this.ageBonus);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.ageBonus = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "InteractiveElementWithAgeBonus("
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
        + ", ageBonus="
        + this.ageBonus
        + ')';
  }
}
