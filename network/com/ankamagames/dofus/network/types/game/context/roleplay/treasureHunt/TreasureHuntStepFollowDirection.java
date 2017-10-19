// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntStepFollowDirection
    extends com.ankamagames
        .dofus
        .network
        .types
        .game
        .context
        .roleplay
        .treasureHunt
        .TreasureHuntStep {
  public static final int PROTOCOL_ID = 468;
  // i8
  public byte direction;
  // vi16
  public short mapCount;

  public TreasureHuntStepFollowDirection()
  {}

  public TreasureHuntStepFollowDirection(byte direction, short mapCount)
  {

    super();
    this.direction = direction;
    this.mapCount = mapCount;
  }

  @Override
  public int getProtocolId()
  {
    return 468;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.direction);
    writer.write_vi16(this.mapCount);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.direction = reader.read_i8();
    this.mapCount = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "TreasureHuntStepFollowDirection("
        + "direction="
        + this.direction
        + ", mapCount="
        + this.mapCount
        + ')';
  }
}
