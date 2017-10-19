// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightTackledMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 1004;
  // array,f64
  public double[] tacklersIds;

  public GameActionFightTackledMessage()
  {}

  public GameActionFightTackledMessage(short actionId, double sourceId, double[] tacklersIds)
  {

    super(actionId, sourceId);
    this.tacklersIds = tacklersIds;
  }

  @Override
  public int getProtocolId()
  {
    return 1004;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(tacklersIds.length);
    writer.write_array_f64(this.tacklersIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int tacklersIds_length = reader.read_ui16();
    this.tacklersIds = reader.read_array_f64(tacklersIds_length);
  }

  @Override
  public String toString()
  {

    return "GameActionFightTackledMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", tacklersIds="
        + java.util.Arrays.toString(this.tacklersIds)
        + ')';
  }
}
