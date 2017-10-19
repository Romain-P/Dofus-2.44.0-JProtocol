// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntStepFollowDirectionToPOI
    extends com.ankamagames
        .dofus
        .network
        .types
        .game
        .context
        .roleplay
        .treasureHunt
        .TreasureHuntStep {
  public static final int PROTOCOL_ID = 461;
  // i8
  public byte direction;
  // vi16
  public short poiLabelId;

  public TreasureHuntStepFollowDirectionToPOI()
  {}

  public TreasureHuntStepFollowDirectionToPOI(byte direction, short poiLabelId)
  {

    super();
    this.direction = direction;
    this.poiLabelId = poiLabelId;
  }

  @Override
  public int getProtocolId()
  {
    return 461;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.direction);
    writer.write_vi16(this.poiLabelId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.direction = reader.read_i8();
    this.poiLabelId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "TreasureHuntStepFollowDirectionToPOI("
        + "direction="
        + this.direction
        + ", poiLabelId="
        + this.poiLabelId
        + ')';
  }
}
