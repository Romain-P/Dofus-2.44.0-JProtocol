// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayMassiveMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.emote
        .EmotePlayAbstractMessage {
  public static final int PROTOCOL_ID = 5691;
  // array,f64
  public double[] actorIds;

  public EmotePlayMassiveMessage()
  {}

  public EmotePlayMassiveMessage(short emoteId, double emoteStartTime, double[] actorIds)
  {

    super(emoteId, emoteStartTime);
    this.actorIds = actorIds;
  }

  @Override
  public int getProtocolId()
  {
    return 5691;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(actorIds.length);
    writer.write_array_f64(this.actorIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int actorIds_length = reader.read_ui16();
    this.actorIds = reader.read_array_f64(actorIds_length);
  }

  @Override
  public String toString()
  {

    return "EmotePlayMassiveMessage("
        + "emoteId="
        + this.emoteId
        + ", emoteStartTime="
        + this.emoteStartTime
        + ", actorIds="
        + java.util.Arrays.toString(this.actorIds)
        + ')';
  }
}
