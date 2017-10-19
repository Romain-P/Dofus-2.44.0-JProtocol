// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightActivateGlyphTrapMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6545;
  // i16
  public short markId;
  // bool
  public boolean active;

  public GameActionFightActivateGlyphTrapMessage()
  {}

  public GameActionFightActivateGlyphTrapMessage(
      short actionId, double sourceId, short markId, boolean active)
  {

    super(actionId, sourceId);
    this.markId = markId;
    this.active = active;
  }

  @Override
  public int getProtocolId()
  {
    return 6545;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i16(this.markId);
    writer.write_bool(this.active);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.markId = reader.read_i16();
    this.active = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "GameActionFightActivateGlyphTrapMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", markId="
        + this.markId
        + ", active="
        + this.active
        + ')';
  }
}
