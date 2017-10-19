// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightVanishMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6217;
  // f64
  public double targetId;

  public GameActionFightVanishMessage()
  {}

  public GameActionFightVanishMessage(short actionId, double sourceId, double targetId)
  {

    super(actionId, sourceId);
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 6217;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameActionFightVanishMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ')';
  }
}
