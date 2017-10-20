// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntStepFollowDirectionToHint
    extends com.ankamagames
        .dofus
        .network
        .types
        .game
        .context
        .roleplay
        .treasureHunt
        .TreasureHuntStep {
  public static final int PROTOCOL_ID = 472;
  // i8
  public byte direction;
  // vi16
  public short npcId;

  public TreasureHuntStepFollowDirectionToHint() {}

  public TreasureHuntStepFollowDirectionToHint(byte direction, short npcId) {

    super();
    this.direction = direction;
    this.npcId = npcId;
  }

  @Override
  public int getProtocolId() {
    return 472;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.direction);
    writer.write_vi16(this.npcId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.direction = reader.read_i8();
    this.npcId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "TreasureHuntStepFollowDirectionToHint("
        + "direction="
        + this.direction
        + ", npcId="
        + this.npcId
        + ')';
  }
}
