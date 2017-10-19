// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionEmote
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 407;
  // ui8
  public short emoteId;
  // f64
  public double emoteStartTime;

  public HumanOptionEmote()
  {}

  public HumanOptionEmote(short emoteId, double emoteStartTime)
  {

    super();
    this.emoteId = emoteId;
    this.emoteStartTime = emoteStartTime;
  }

  @Override
  public int getProtocolId()
  {
    return 407;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui8(this.emoteId);
    writer.write_f64(this.emoteStartTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.emoteId = reader.read_ui8();
    this.emoteStartTime = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "HumanOptionEmote("
        + "emoteId="
        + this.emoteId
        + ", emoteStartTime="
        + this.emoteStartTime
        + ')';
  }
}
